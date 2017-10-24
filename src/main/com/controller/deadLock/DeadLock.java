package com.controller.deadLock;

import controller.deadLock.LockA;
import controller.deadLock.LockB;

public class DeadLock implements Runnable {
    private int i = 0;

    public void run() {
        while (true) {
            if (i % 2 == 0) {
                synchronized (LockA.locka) {
                    System.out.println(" 先进入A再进入B   LockA");
                    synchronized (LockB.lockb) {
                        System.out.println(" 先进入A再进入B   LockB");
                    }
                }
            } else {
                synchronized (LockB.lockb) {
                    System.out.println(" 先进入B再进入A  LockB");
                    synchronized (LockA.locka) {
                        System.out.println(" 先进入B再进入A   LockA");
                    }
                }
            }
            i++;
        }

    }
}
