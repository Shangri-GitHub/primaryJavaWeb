package com.controller;

public class callBackDemo {
    public static void main(String[] args) {
        System.out.println(calBackl(10));
    }

    public static Integer calBackl(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calBackl(n - 1);
        }
    }
}
