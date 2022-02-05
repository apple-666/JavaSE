package com.apple.反射与注解.a2_自定义注解;

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
public class 自定义注解 {

    @AppleAnnotation(value = "pear")
    public static void main(String[] args) {

    }
}

/**
 * @author apple
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
//使用interface自定义注解
@interface AppleAnnotation{

    //参数：  参数类型+参数名 +()
    String value();//value必须是string
    int age() default 1;
    String name() default "apple";
}
