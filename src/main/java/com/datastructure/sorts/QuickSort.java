package com.datastructure.sorts;

//Java program for implementation of QuickSort 
class QuickSort {
	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	int partition(int arr[], int start, int end) {

		// int arr[] = {10, 7, 8, 9, 1, 5};
		// int arr[] = {0, 1, 2, 3, 4, 5};
		int partitianIndex = start;
		int pivot = arr[end];
		for (int i = 0; i < end; i++) {
			if (arr[i] < pivot) {
				swap(i, partitianIndex, arr);
				partitianIndex++;
			}

		}
		swap(partitianIndex, end, arr);

		return partitianIndex;

	}

	private void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	void sort(int arr[], int start, int end) {
		if (start < end) {
			int partitionIndex = partition(arr, start, end);
			sort(arr, start, partitionIndex - 1);
			sort(arr, partitionIndex + 1, end);
		}
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		System.out.println(arr);
	}
}
/* This code is contributed by Rajat Mishra */
