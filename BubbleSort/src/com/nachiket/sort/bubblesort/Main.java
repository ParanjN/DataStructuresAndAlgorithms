package com.nachiket.sort.bubblesort;

import com.nachiket.sort.bubblesort.BubbleSort;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] sortedArr = BubbleSort.sort(arr1);
		
		for(int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}
	}

}
