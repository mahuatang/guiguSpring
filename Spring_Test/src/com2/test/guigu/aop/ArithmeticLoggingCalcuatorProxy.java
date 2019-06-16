package com2.test.guigu.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticLoggingCalcuatorProxy {
    private ArithmeticCalcuator target;

    public ArithmeticLoggingCalcuatorProxy(ArithmeticCalcuator arithmeticCalcuator) {
        super();
        this.target = arithmeticCalcuator;
    }

    public ArithmeticCalcuator getLoggingProxy() {
        ArithmeticCalcuator proxy = null;

        ClassLoader loader = target.getClass().getClassLoader();
        Class [] interfaces = new Class[]{ArithmeticCalcuator.class};
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //打印日志
                System.out.println("[before] The method " + methodName + " begins with " + Arrays.asList(args));

                //调用目标方法
                Object result = null;

                try {
                    //前置通知
                    result = method.invoke(target, args);
                    //返回通知, 可以访问到方法的返回值
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    //异常通知, 可以访问到方法出现的异常
                }

                //后置通知. 因为方法可以能会出异常, 所以访问不到方法的返回值

                //打印日志
                System.out.println("[after] The method ends with " + result);

                return result;
            }
        };

        /**
         * loader: 代理对象使用的类加载器。
         * interfaces: 指定代理对象的类型. 即代理代理对象中可以有哪些方法.
         * h: 当具体调用代理对象的方法时, 应该如何进行响应, 实际上就是调用 InvocationHandler 的 invoke 方法
         */
        proxy = (ArithmeticCalcuator) Proxy.newProxyInstance(loader, interfaces, invocationHandler);

        return proxy;
    }
}
