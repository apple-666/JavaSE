package com.apple.反射与注解.a3_反射;

import java.applet.Applet;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author Double_apple
 * @Date 2022/2/5 11:57
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        Class c = Class.forName("com.apple.反射与注解.a3_反射.User");
//        System.out.println(c.getName());

        //得到类的方式：
//        getClassName();

        //得到类 具体信息
        getClassMes();


    }

    /**
     * 得到类 具体信息
     */
    private static void getClassMes() throws NoSuchFieldException {
        User user = new User(1, "apple");
        Class c = user.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        //获得参数
        Field[] f = c.getFields();//只能找到public修饰的参数
        f = c.getDeclaredFields();//所有参数
        for(Field fi:f){
            System.out.println(fi);
        }
        Field name = c.getDeclaredField("name");//得到相应类
        System.out.println(name);

        //获得内部的方法
        System.out.println("=======================================");
        Method[] m = c.getMethods();
        m = c.getDeclaredMethods();
        for(Method mi:m){
            System.out.println(mi);
        }

        //获得构造器
        System.out.println("=======================================");
        Constructor[] co = c.getConstructors();
        co = c.getDeclaredConstructors();
        for(Constructor ci:co){
            System.out.println(ci);
        }

    }

    /**
     * 得到类名的方式
     */
    private static void getClassName() throws ClassNotFoundException {
        //1:通过对象
        User user = new User();
        Class c1 =user.getClass();
        System.out.println(c1.getName());
        //2:forname获得
        Class c2 = Class.forName("com.apple.反射与注解.a3_反射.User");
        System.out.println(c2.getName());
        //3:类名.class获得
        Class c3 = User.class;
        System.out.println(c2.getName());
    }


}
