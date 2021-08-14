package com.programs;


import java.util.Arrays;


public class Duplicates {
    private static String name;

    public Duplicates(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 4, 1, 1, 6,2, 1, 1, 0,0,1,8,12,11,8};
        Arrays.sort(data);
        int val;
        val = data[0];
        int prev =Integer.MAX_VALUE;
        for (int i = 0; i < data.length - 1; i++) {
            if (val == data[i + 1] && val!=prev) {
                prev=val;
                System.out.println(data[i] + " is duplicate");
            }
            val = data[i + 1];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
