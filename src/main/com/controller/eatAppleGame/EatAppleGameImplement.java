package com.controller.eatAppleGame;

/**
 * 案例：总共有50个苹果，分三个人吃，使用多线程技术实现谁吃的多
 * 方式1，继承thread方式来实现、
 * 方案二方式好
 */

class Apple implements Runnable {
    static int num = 50;

    public void run() {
        for (int i = 0; i < num; i++) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了" + num-- + "个苹果");  // getName()获取Thread的名称
            }
        }
    }
}

public class EatAppleGameImplement {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //  三个线程用的是同一个对象
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();

    }
}
