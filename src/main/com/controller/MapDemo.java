package controller;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
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

        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entryset.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "..." + value);
        }

        for(Map.Entry<String, Integer> entry:map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "..." + value);
        }



    }
}
