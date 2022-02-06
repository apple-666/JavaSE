package com.apple.泛型.p2_定义泛型;

/**
 * @Author Double_apple
 * @Date 2022/2/6 11:41
 * @Version 1.0
 */
public class p3_泛型接口T {
    public static void main(String[] args) {
        p3_泛型接口Impl<String> p3_泛型接口 = new p3_泛型接口Impl();
        String apple_come_on = p3_泛型接口.show("apple come on");
        System.out.println(apple_come_on);
    }
}
