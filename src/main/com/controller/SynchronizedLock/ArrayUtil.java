package com.controller.SynchronizedLock;


/**
 * 单例模式
 * 推荐饿汉式 - 对应的是ArrayUtil1
 *
 */
public class ArrayUtil {
    private ArrayUtil() {
    }

    private static final ArrayUtil instence = new ArrayUtil();

    public static ArrayUtil getInstence() {
        return instence;
    }

    public void sort(int[] arr) {

    }
}
