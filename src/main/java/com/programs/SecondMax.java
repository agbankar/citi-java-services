package com.programs;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 79, 11, 51, 50};
        int max = 10;
        int secondMax = 11;
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
            if (secondMax > max) {
                tmp = max;
                max = secondMax;
                secondMax = tmp;
            }

        }
        System.out.println("Max element "+max);
        System.out.println("Second max element "+secondMax);
    }
}
