package com.datastructure.search;

public class BinarySearch {
	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		// System.out.println(factorial(5));

		System.out.println(searchElementInSortedArray(9));
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
			end = mid - 1;
			return searchElementInSortedArray(start, mid, n);
		}
		if (n > arr[mid]) {
			start = mid + 1;
			return searchElementInSortedArray(start, end, n);
		}

		return mid;
	}
}
