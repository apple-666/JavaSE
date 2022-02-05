package com.apple.反射与注解.a1_元注解;

import java.lang.annotation.*;

/**
 * 元注解
 *
 * @Author Double_apple
 * @Date 2022/2/5 11:13
 * @Version 1.0
 *
 * 元注解：管理注解（范围，作用）
 */
public class 元注解 {

    public static void main(String[] args) {

    }
}

//注解 范围在方法，类
@Target(value = {ElementType.METHOD,ElementType.TYPE})

//注解 在运行时有效
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)

//表示能将注解生成在javadoc中
@Documented

//表示注解能被子类继承
@Inherited

//使用interface自定义注解
@interface AppleAnnotation{

}
