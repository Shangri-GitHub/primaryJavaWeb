package com.controller.ComparatorAndComparable;


import java.util.*;

public class test {

    public static void main(String[] args) {


//        Map<Integer, String> map = new HashMap <>();
//
//        map.put(null, null);
//        map.put(1, "33");
//
//        map.replace(1,"3333");

        List <CurseComparable> list = new ArrayList <>();
        list.add(new CurseComparable(3, "Aiyi"));
        list.add(new CurseComparable(2, "Bi2"));
        for (CurseComparable curse : list) {
            System.out.println(curse.getIndex() + ":" + curse.getName());
        }
        Collections.sort(list);
        System.out.println("----排序后----");
        for (CurseComparable curse : list) {
            System.out.println(curse.getIndex() + ":" + curse.getName());
        }
        System.out.println("----按照姓名排序----");
        Collections.sort(list,new CourseComparator());
        for (CurseComparable curse : list) {
            System.out.println(curse.getIndex() + ":" + curse.getName());
        }
    }
}
