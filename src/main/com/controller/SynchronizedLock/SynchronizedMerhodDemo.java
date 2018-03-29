package com.controller.SynchronizedLock;

/**
 * synchronized 的好与坏
 * 好处：保证了多线程多并发的同步操作，避免安全问题
 * 坏处：性能不高
 */

class Apple2 implements Runnable {
    static int num = 50;


    public void run() {
        // 同步锁 this是该对象的资源
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }

    // 同步的方法提出来
    synchronized private void eat() {
        if (num > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "吃了" + num-- + "个苹果");  // getName()获取Thread的名称
        }
    }
}

public class SynchronizedMerhodDemo {
    public static void main(String[] args) {
        Apple2 apple = new Apple2();
        //  三个线程用的是同一个对象
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}
