package com.controller;


public class RentOutRoom {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 5, 2, 8, 9};
        int[] index = new int[]{1, 4, 0, 5, 1, 1, 2, 5, 3, 3, 0};
        String tel = "";
        for (int i = index.length - 1; i >= 0; i--) {
            if ((i + 1) % 4 == 0) {
                tel += arr[index[i]] + "-";
            } else {
                tel += arr[index[i]];
            }
        }
        tel = new StringBuffer(tel).reverse().toString();
        System.out.println(tel);
    }
}
