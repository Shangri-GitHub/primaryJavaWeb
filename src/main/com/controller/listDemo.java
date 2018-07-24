package com.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listDemo {
    private static final int COUNT = 100000;

    private static List <Integer> list = new ArrayList();
    private static LinkedList linkedList = new LinkedList <>();
    private static Vector vector = new Vector <>();

    public static void main(String[] args) {
        System.out.println("------插入所消耗的时间-------");
        insertSort(list);      // 667
        insertSort(linkedList);  // 13
        insertSort(vector); // 846
        System.out.println("------读取所消耗的时间-------");
        readList(list);      // 4
        readList(linkedList);  // 5555
        readList(vector); // 7
        System.out.println("------删除所消耗的时间-------");
        deleteList(list);      // 313
        deleteList(linkedList);  // 2377
        deleteList(vector); // 307
    }

    private static void deleteList(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("删除所消耗的时间" + (endTime - startTime));
    }

    private static void readList(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("读取所消耗的时间" + (endTime - startTime));
    }

    private static void insertSort(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("插入所消耗的时间" + (endTime - startTime));
    }
}
