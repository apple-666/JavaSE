package com.apple.泛型.p4_可变参数;

/**
 * @Author Double_apple
 * @Date 2022/2/6 12:21
 * @Version 1.0
 */
public class a1_可变参数 {
    public static void main(String[] args) {
        System.out.println(sum(1, 1, 1, 1, 1, 1));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(2, 2, 2, 4));

        System.out.println(sum2(1, 2, 3, 4, 5));
        System.out.println(sum2(3, 1, 2, 4, 5, 5));
    }

    public static int sum(int ... a){
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s+=a[i];
        }
        System.out.println("-----------------------------");
        return s;
    }

    //有其他独立的参数，吧可变参数写在后面就行了
    public static int sum2(int c,int ... a){
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s+=a[i];
        }
        System.out.println("-----------------------------");
        return s;
    }
}
