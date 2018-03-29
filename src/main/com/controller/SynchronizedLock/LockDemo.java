package com.controller.SynchronizedLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 创建Lock
 * 同步锁机制-最经典的写法
 */
class Apple implements Runnable {
    public static Lock lock = new ReentrantLock(); // 创建一个所对象
    static int num = 500;

    public void run() {
        for (int i = 0; i < 500; i++) {
            eat();
        }
    }

    private void eat() {
        // 进入方法，立马加锁
        lock.lock();
        if (num > 0) {
            try {
                System.out.println(Thread.currentThread().getName() + "吃了" + num + "个苹果");  // getName()获取Thread的名称
                Thread.sleep(10);
                num--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 开门走人
                lock.unlock();
            }
        }

    }
}

public class LockDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //  三个线程用的是同一个对象
        new Thread(apple, "小C").start();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
    }

}
