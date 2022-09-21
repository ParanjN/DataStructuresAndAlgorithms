package com.nachiket.sorting.selectionsort;

public class SelectionSort {
	
	public static int[] sort(int[] arr1) {
		
		for(int i = 0; i < arr1.length; i++) {
			
			int indexOfSmallestValue = i;
			
			for(int j = i + 1; j < arr1.length; j++) {
				
				if(arr1[indexOfSmallestValue] > arr1[j]) {
					indexOfSmallestValue = j;
				}
				
			}
			
			int tempValue = arr1[i];
			arr1[i] = arr1[indexOfSmallestValue];
			arr1[indexOfSmallestValue] = tempValue;
			
		}
		
		return arr1;
	}

}
