package com.programs;

import java.util.Arrays;

public class MinAmplituteTomtom {
    public int solution(int[] A, int k) {
        int minApmlitude = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {
            int[] ints = removeElements(A, i,i+k-1,k);
            int apmplitude = findApmplitude(ints);
            if (apmplitude < minApmlitude) {
                minApmlitude = apmplitude;
            }
        }
        return minApmlitude;
    }

    public static void main(String[] args) {
       // int[] arr = new int[]{5, 3, 6, 1, 3};
       int[] arr = new int[]{8,8,4,3};
        //int[] arr = new int[]{5, 3, 6, 1, 3};
        MinAmplituteTomtom s = new MinAmplituteTomtom();
        int minApmplitude = s.solution(arr, 2);
        System.out.println("minApmplitude = " + minApmplitude);

    }


    private int findApmplitude(int[] A) {
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        return max - min;
    }

    public static int[] removeElements(int[] A, int start , int end, int k){
        int[] ampArray = new int[A.length-k];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if ((i<start || i>end)&& j<ampArray.length) {
                ampArray[j] = A[i];
                j++;
            }
        }
        printArray(ampArray);
        return ampArray;
    }
    public  static void printArray(int[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
    }

}
