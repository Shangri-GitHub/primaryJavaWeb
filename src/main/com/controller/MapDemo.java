package com.controller;


import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap <String, Integer>();
        // 添加值
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        // 删除值
        map.remove("c");
        System.out.println(map);
        // 获取值
        System.out.println(map.get("a"));

        /**
         * 1.调用map的ketset方法所有的集合存到set集合中
         * 2。遍历set，获取每个元素
         * 3。调用get方法，获取每个对应的值
         */
//        Set<String> set = map.keySet();
//        System.out.println(set.getClass());
//        Iterator<String> it = set.iterator();
//
//        while (it.hasNext()) {
//            String key = it.next();
//            Integer value = map.get(key);
//            System.out.println(key + "..." + value);
//        }
//        for (String i : map.keySet()) {
//            Integer value = map.get(i);
//            System.out.println(i + "..." + value);
//        }


        /**
         * 1。调用map中的entrySet将集合中的集合映射关系，存储到Set集合
         * 2。迭代set集合
         * 3。获取集合元素是映射关系
         * 4。通过映射对象方法getkey,getValue获取健值对
         */
//
//        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> it = entryset.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, Integer> entry = it.next();
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + "..." + value);
//        }
//
//        for(Map.Entry<String, Integer> entry:map.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + "..." + value);
//        }


        /**
         * map 四种遍历方法
         * 增强for循环遍历 keySet()   entrySet()
         * 迭代器遍历  使用keySet()遍历  使用entrySet()遍历
         */

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));  // 31 ms
        }

        for (Map.Entry <String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());  // 20 ms
        }

        Iterator <String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + ":" + value);   //17 ms
        }

        Iterator <Map.Entry <String, Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry <String, Integer> entry = iterator1.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());  //10ms
        }


        Map <String, String> map1 = new HashMap <String, String>();
        map1.put("d", "d");
        map1.put("a", "c");
        map1.put("b", "b");
        map1.put("c", "a");
        // 通过ArrayList构造函数把map.entrySet()转换成list
        List <Map.Entry <String, String>> list = new ArrayList <Map.Entry <String, String>>(map1.entrySet());
        // 排序
        Collections.sort(list, new Comparator <Map.Entry <String, String>>() {
            public int compare(Map.Entry <String, String> mapping1, Map.Entry <String, String> mapping2) {
                return mapping1.getKey().compareTo(mapping2.getKey());
            }
        });
        for (Map.Entry <String, String> entry : list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }


    }
}
