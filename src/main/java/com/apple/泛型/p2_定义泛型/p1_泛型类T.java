package com.apple.泛型.p2_定义泛型;

/**
 * @Author Double_apple
 * @Date 2022/2/5 13:50
 * @Version 1.0
 */
public class p1_泛型类T {
    public static void main(String[] args) {
        p1_泛型类<String> stringAppleType = new p1_泛型类<String>();
        stringAppleType.setA("stringapple");
        p1_泛型类<Integer> integerAppleType = new p1_泛型类<Integer>();
        integerAppleType.setA(10086);
    }
}
