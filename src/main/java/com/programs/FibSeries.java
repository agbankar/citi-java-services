package com.programs;

public class FibSeries {
	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

	public static void main(String[] args) {

		// System.out.println(factorial(5));
		 fibseriesRecursion(0, 1, 10);

		System.out.println(searchElementInSortedArray(9));
	}

	public static void fibseries() {
		int firstVal = 0;
		int nextVal = 1;
		int fibVal = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(firstVal + " ");
			fibVal = firstVal + nextVal;
			firstVal = nextVal;
			nextVal = fibVal;

		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public static void fibseriesRecursion(int firstval, int secondVal, int n) {
		if (n == 0)

		{
			return;
		}
		System.out.println(firstval);
		int fibval = firstval + secondVal;
		firstval = secondVal;
		secondVal = fibval;
		n = n - 1;
		fibseriesRecursion(firstval, secondVal, n);

	}

	private static int searchElementInSortedArray(int n) {
		return searchElementInSortedArray(0, arr.length - 1, n);
	}

	private static int searchElementInSortedArray(int start, int end, int n) {

		int mid = (start + end) / 2;
		if (arr[mid] == n) {
			return mid;
		}
		if (n < arr[mid]) {
			end = mid-1;
			return searchElementInSortedArray(start,mid,n);
		}
		if (n > arr[mid]) {
			start = mid+1;
			return searchElementInSortedArray(start,end,n);
		}
			
		return mid;
	}
}
