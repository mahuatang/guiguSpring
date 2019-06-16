package com4.test.guigu.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;

public class JDBCTest {
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;
    private EmployeeDao employeeDao;
    private DepartmentDao departmentDao;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
        jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
        employeeDao = ctx.getBean(EmployeeDao.class);
        departmentDao = ctx.getBean(DepartmentDao.class);
        namedParameterJdbcTemplate = ctx.getBean(NamedParameterJdbcTemplate.class);
    }

    public void tesNamedPatamterJdbcTemplate2(){
        String sql = "insert into employees(last_name, email, dept_id) values(:lastName, :email, :deptId)";

        Employee employee = new Employee();
        employee.setLastName("woka");
        employee.setEmail("wangyi@163");
        employee.setDeptId(10);

        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(employee);
        namedParameterJdbcTemplate.update(sql, parameterSource);
    }

    @Test
    public void testNamedParamterJdbcTemplate(){
        String sql = "insert into employees(last_name, email, dept_id) values(:ln,:email,:deptid)";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("ln", "FF");
        paramMap.put("email", "ddd@ccc.com");
        paramMap.put("deptid", 2);

        namedParameterJdbcTemplate.update(sql, paramMap);
    }

    @Test
    public void testDepartmentDao() {
        System.out.println(departmentDao.get(1));
    }

    @Test
    public void testEmployeeDao() {
        System.out.println(employeeDao.get(1));
    }

    @Test
    public void testQueryForObject2(){
        String sql = "select count(id) from employees";
        long count = jdbcTemplate.queryForObject(sql, Long.class);

        System.out.println(count);
    }

    @Test
    public void testQueryForList(){
        String sql = "select id, last_name lastName, email from employees where id > ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> employees = jdbcTemplate.query(sql, rowMapper, 5);

        System.out.println(employees);
    }

    @Test
    public void testQueryForObject(){
        String sql = "select id, last_name lastName, email, dept_id as \"department.id\" FROM employees WHERE id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);

        System.out.println(employee);
    }

    @Test
    public void testBatchUpdate() {
        String sql = "insert into employees(last_name, email, dept_id) values (?,?,?)";

        List<Object[]> batchArgs = new ArrayList<>();

        batchArgs.add(new Object[]{"AA", "cc", 11});
        batchArgs.add(new Object[]{"BB", "cbb", 12});
        batchArgs.add(new Object[]{"CC", "ad", 13});
        batchArgs.add(new Object[]{"DD", "gainai", 14});

        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Test
    public void testUpdate(){
        String sql = "UPDATE employees set last_name = ? where id = ?";
        jdbcTemplate.update(sql, "shabi", 5);
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}
