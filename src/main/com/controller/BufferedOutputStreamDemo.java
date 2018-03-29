package com.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/shangri-la/d.txt"));
        bos.write(90);
        bos.flush();
        byte[] bytes = "hello".getBytes();    // 字符串转换成byte类型并且存入一个byte数组中 new String(bytes)还原
        bos.write(bytes);
        bos.write(bytes, 0, 2);
        bos.close();
    }
}
