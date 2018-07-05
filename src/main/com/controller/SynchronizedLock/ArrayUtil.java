package com.controller.SynchronizedLock;


/**
 * 单例模式
 * 推荐饿汉式 - 对应的是ArrayUtil1
 */

public class ArrayUtil {
    private ArrayUtil() {
    }

    private static ArrayUtil instance = new ArrayUtil();

    public static ArrayUtil getInstance() {
        return instance;
    }

    public void sort(int[] arr) {

    }
}




