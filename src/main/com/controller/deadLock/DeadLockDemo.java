package com.controller.deadLock;

import com.controller.deadLock.DeadLock;

public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread t1 = new Thread(deadLock);
        Thread t2 = new Thread(deadLock);
        t1.start();
        t2.start();
    }
}
