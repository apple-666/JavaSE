package com.apple.泛型.p1_instanceof;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Double_apple
 * @Date 2022/2/5 13:32
 * @Version 1.0
 */
public class Apple {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("apple1");
        a.add("apple2");
        a.add(888);
        Iterator iterator = a.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            if(object instanceof String){
                System.out.println((String)object);
            }else if(object instanceof Integer){
                System.out.println((Integer)object);
            }
        }

    }
}
