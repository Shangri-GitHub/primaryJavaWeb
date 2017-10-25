package com.controller.Thread;

/**
 * 接口的另一种实现方法
 * 实现 Runnable，重写run方法
 */

public class RunableDemo implements Runnable {

    public void run() {
        System.out.println("runable");
    }
}
