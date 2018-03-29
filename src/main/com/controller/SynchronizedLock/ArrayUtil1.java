package com.controller.SynchronizedLock;


/**
 * 单例模式 - 懒汉式
 * 存在线程不安全问题，解决办法加synchronized,
 * 尽量减少使用synchronized,影响性能
 */
public class ArrayUtil1 {
    private ArrayUtil1() {
    }

    private static ArrayUtil1 instance = null;
    // 此时同步箭头的是（ArrayUtil1.class）
    synchronized public static ArrayUtil1 getInstance() {
        // C
        if (instance == null) {
            // A B 有可能都给进来，不安全
            instance = new ArrayUtil1();
        }
        return instance;
    }

    public void sort(int[] arr) {

    }

}
