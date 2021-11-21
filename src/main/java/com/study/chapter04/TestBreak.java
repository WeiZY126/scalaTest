package com.study.chapter04;

public class TestBreak {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
//                    break;
                    throw new Exception();
                }
                System.out.println(i);
            }
        } catch (Exception e) {
            //什么都不做，退出循环
        }
        System.out.println("循环外方法");
    }
}
