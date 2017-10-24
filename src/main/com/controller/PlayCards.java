package controller;

import java.util.*;

public class PlayCards {
    public static void main(String[] args) {
        /**
         * 组合牌
         */
        // 创建Map集合,键是编号,值是牌
        HashMap<Integer, String> cords = new HashMap<Integer, String>();
        // 创建List集合,存储编号
        ArrayList<Integer> lists = new ArrayList<Integer>();
        // 定义13个点数的数组
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        // 定义4个花色
        String[] colors = {"♥️", "♣️", "♠️", "♦️"};
        // 定义整数变量,作为键出现
        int index = 2;
        // 遍历数组,花色+点数的组合,存储到Map集合
        for (String number : numbers) {
            for (String color : colors) {
                cords.put(index, color + number);
                lists.add(index);
                index++;
            }
        }
        cords.put(0, "大王");
        cords.put(1, "小王");
        lists.add(0);
        lists.add(1);
//        System.out.println(lists);
        /**
         * 洗牌
         */
        Collections.shuffle(lists);
//        System.out.println(lists);
        /**
         * 发牌
         * 三个玩家 加底牌
         * 存取四个数组中
         */
        ArrayList<Integer> palyer1 = new ArrayList<Integer>();
        ArrayList<Integer> palyer2 = new ArrayList<Integer>();
        ArrayList<Integer> palyer3 = new ArrayList<Integer>();
        ArrayList<Integer> bottomCords = new ArrayList<Integer>();
        for (int i = 0; i < lists.size(); i++) {
            if (i < 3) {
                bottomCords.add(lists.get(i));
            } else if (i % 3 == 0) {
                palyer1.add(lists.get(i));
            } else if (i % 3 == 1) {
                palyer2.add(lists.get(i));
            } else if (i % 3 == 2) {
                palyer3.add(lists.get(i));
            }
        }

        /**
         * 排序
         * 看牌
         */
        lookCard("底牌", bottomCords, cords);
        lookCard("玩家一", palyer1, cords);
        lookCard("玩家二", palyer2, cords);
        lookCard("玩家三", palyer3, cords);
    }

    public static void lookCard(String name, ArrayList<Integer> palyer, HashMap<Integer, String> cords) {
        //先排序，后取到相对应的牌
        Collections.sort(palyer);
        System.out.print(name + ":");
        for (Integer cordsKey : palyer) {
            String cordsValue = cords.get(cordsKey);
            System.out.print(cordsValue + " ");
        }
        System.out.println();
    }
}
