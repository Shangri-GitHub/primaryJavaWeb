package com.controller;

public class BisectionMethod {
    private int price;

    public BisectionMethod(int price) {
        this.price = price;
    }

    public static int serach(int k, int[] a) {
        int ret = -1;
        int l = 0;
        int r = a.length;
        while (l != r) {
            int m = (l + r) / 2;
            if (a[m] == k) {
                ret = m;
                break;
            } else if (a[m] > k) {
                r = m - 1;
            } else if (a[m] < k) {
                l = m + 1;
            }
        }
        if (l == r) {
            ret = l;
        }
        return ret;
    }

    public void sort(int[] b) {

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }


        for (int i : b) {
            System.out.print(i + ",");
        }


    }

    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 8, 10};
//        System.out.println(serach(4, a));
        BisectionMethod bm = new BisectionMethod(90);
        System.out.println(bm.price);
        int[] b = {11, 2, 3, 4, 5, 6, 8, 10};
        bm.sort(b);
    }
}
