package com2.test.guigu.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService22 {
    @Autowired
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void serviceSave() {
        userDao.daoSave();
    }
}
