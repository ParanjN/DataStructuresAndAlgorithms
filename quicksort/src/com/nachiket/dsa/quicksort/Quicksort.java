package com.nachiket.dsa.quicksort;

public class Quicksort {
	
	
	public int[] sort(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int pivotValue = new Partition().partition(arr, start, end);
			System.out.println("pivotValue: " + pivotValue);
			sort(arr, start, pivotValue - 1 );
			sort(arr, pivotValue + 1, end);
		}

		
		return arr;
	}

}
