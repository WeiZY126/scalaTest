package com.study.chapter05;

public class TestRecursion {
    public static void main(String[] args) {
        //计算阶乘
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    //1.循环
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //2.递归
    public static int fact(int n) {
        if (n > 0)
            return n * fact(n - 1);
        else
            return 1;
    }
}
