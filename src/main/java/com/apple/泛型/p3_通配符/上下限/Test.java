package com.apple.泛型.p3_通配符.上下限;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/2/6 12:13
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Son> sons = new ArrayList<Son>();
        List<Parent> parents = new ArrayList<Parent>();
        printList(sons);
        printList(parents);
        //printlist只能接收  Parent和它的子类的list
        //printList(object) 不能接收

        List<Parent> parents1 = new ArrayList<Parent>();
        List<Object> pobjce = new ArrayList<Object>();
        printList1(parents1);
        printList1(pobjce);
        //printlist只能接收  Parent和它的父类的list
    }

    //上限为Parent类
    public static void printList(List<? extends Parent> list){
        System.out.println("success");
    }

    //下限收尾Parenet
    public static void printList1(List<? super Parent> list){
        System.out.println("success");
    }
}
