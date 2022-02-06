package com.apple.泛型.p3_通配符;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/2/6 11:47
 * @Version 1.0
 */
public class a1_通配符 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("apple");
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(10086);

        //使用泛型通配符
        printList(arrayList);
        printList(arrayList1);

    }

    public static void printList(List<?> l){
        System.out.println(l.get(0));
    }
}
