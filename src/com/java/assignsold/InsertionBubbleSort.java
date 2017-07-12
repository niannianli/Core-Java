package com.java.assignsold;

public class InsertionBubbleSort {

	// sort array using bubble sort or insertion sort

	public static void main(String[] args) {

		int[] arr = { 45, 35, 75, 85, 95, 25, 65, 15 };

		System.out.println("This is our first array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// bubble sort array
		bubbleSort(arr);

		System.out.println("Sorted array using bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] arr2 = { 47, 37, 87, 57, 97, 27, 67, 17 };

		System.out.println("This is second our array: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// insertion sort array
		insertionSort(arr2);

		System.out.println("Sorted array using insertion sort:");
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	// bubble sort
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {

					// if not in order, swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			} // for
		} // for

	}

	// insertion sort
	static void insertionSort(int[] arr2) {
		int n = arr2.length;
		for (int j = 1; j < n; j++) {
			int key = arr2[j];
			int i = j - 1;
			while ((i > -1) && (arr2[i] > key)) {
				arr2[i + 1] = arr2[i];
				i--;
			}
			arr2[i + 1] = key;
		}

	}

}