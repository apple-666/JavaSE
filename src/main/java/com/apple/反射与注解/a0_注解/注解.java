package com.apple.反射与注解.a0_注解;

/**
 * @Author Double_apple
 * @Date 2022/2/5 11:02
 * @Version 1.0
 */
@SuppressWarnings("all")
public class 注解 extends Object {

    @Override
    public String toString(){
        return "";
    }

    /**
     * Deprecated 表示不推荐使用，或者有更好的方法
     * 测试
     */
    @Deprecated
    public static void testDeprecated1(){
        System.out.println("apple come on");
    }

    public void testDeprecated2(){
        testDeprecated1();//会显示删除线，表示不推荐使用
    }

}
