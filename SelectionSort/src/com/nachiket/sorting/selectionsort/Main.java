package com.nachiket.sorting.selectionsort;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		
		int[] arr1 = {5, 4, 3, 2, 1};
		
		int[] sortedArr = SelectionSort.sort(arr1);
		
		for(int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}
	}

}
