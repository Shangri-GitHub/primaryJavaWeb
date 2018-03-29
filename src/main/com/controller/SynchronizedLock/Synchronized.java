package com.controller.SynchronizedLock;

/**
 * ====解决线程安全的问题=====
 * 方式1 同步代码块、
 * 方式2 同步方法、
 * 方式3 锁机制（Lock）、
 */

class Apple1 implements Runnable {
    static int num = 50;


    public void run() {
        // 同步锁 this是该对象的资源
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "吃了" + num-- + "个苹果");  // getName()获取Thread的名称
                }
            }
        }
    }
}

public class Synchronized {
    public static void main(String[] args) {
        Apple1 apple1 = new Apple1();
        //  三个线程用的是同一个对象
        new Thread(apple1, "小A").start();
        new Thread(apple1, "小B").start();
        new Thread(apple1, "小C").start();
    }
}
