package com.apple.反射与注解.a3_反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Double_apple
 * @Date 2022/2/5 12:36
 * @Version 1.0
 */
public class 动态创建对象 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.apple.反射与注解.a3_反射.User");

        //构造一个对象-----
        User user = (User) c.newInstance();
        System.out.println(user);

        //通过反射获取一个方法
        Method conuser = c.getDeclaredMethod("setName",String.class);
        conuser.invoke(user,"apple");
        System.out.println(user.getName());

        //通过反射操作属性
        Field name = c.getDeclaredField("name");
        //不能操作priavte属性 通过关闭程序的安全监测
        name.setAccessible(true);
        name.set(user,"pear");;
        System.out.println(user.getName());


    }
}
