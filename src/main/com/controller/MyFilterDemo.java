package com.controller;

import com.filter.DirectoryDome;

import java.io.File;

public class MyFilterDemo {
    public static void main(String[] args) {
        getAllJava(new File("/Users/shangri-la/Sites"));
    }

    public static void getAllJava(File dir) {
        File[] files = dir.listFiles(new DirectoryDome()); //添加过滤器
        for (File f : files) {
            if (f.isDirectory()) {
                getAllJava(f);
            } else {
                if ("b.java".equals(f.getName()))
                    System.out.println(f.getName());
            }
        }
    }
}
