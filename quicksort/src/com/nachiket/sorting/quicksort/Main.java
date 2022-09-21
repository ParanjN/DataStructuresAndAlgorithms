package com.nachiket.sorting.quicksort;

import com.nachiket.sorting.quicksort.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		
		int[] arr1 = {5, 4, 3, 2, 1};
		
		int[] sortedArr = QuickSort.sort(arr1, 0, arr1.length - 1);
		
		for(int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}
	}
	
}
