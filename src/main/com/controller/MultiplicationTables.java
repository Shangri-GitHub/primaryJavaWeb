package com.controller;

public class MultiplicationTables {


    public static void calc() {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "*" + i + "=" + (i * k < 10 ? i * k + "  " : i * k + " "));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MultiplicationTables m = new MultiplicationTables();
        m.calc();
    }
}
