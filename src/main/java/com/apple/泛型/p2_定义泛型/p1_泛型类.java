package com.apple.泛型.p2_定义泛型;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Double_apple
 * @Date 2022/2/5 13:48
 * @Version 1.0
 */
public class p1_泛型类<A> {
    private A a;

    public A getA(){
        return a;
    }

    public void setA(A a){
        this.a = a;
    }

}
