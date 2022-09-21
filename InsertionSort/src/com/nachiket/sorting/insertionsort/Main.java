package com.nachiket.sorting.insertionsort;

public class Main {
	
	public static void main(String[] args) {

				System.out.println("Inside main");
				
				int[] arr1 = { 12, 11, 13, 5, 6 };
				
				int[] sortedArr = InsertionSort.sort(arr1);
				
				for(int i = 0; i < sortedArr.length; i++) {
					System.out.println(sortedArr[i]);
				}
			

		}

}
