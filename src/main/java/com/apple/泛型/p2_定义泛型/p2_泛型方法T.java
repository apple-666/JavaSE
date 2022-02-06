package com.apple.泛型.p2_定义泛型;

/**
 * @Author Double_apple
 * @Date 2022/2/6 11:28
 * @Version 1.0
 */
public class p2_泛型方法T {
    public static void main(String[] args) {
        p2_泛型方法 pearType = new p2_泛型方法();
        String apple = pearType.show("apple");
        Integer show = pearType.show(111);
        System.out.println(apple);
        System.out.println(show);
    }
}
