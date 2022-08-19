package com.nachiket.dsa.quicksort;

public class Main {
	
	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		
		int[] sorted = new Quicksort().sort(arr, 0, arr.length - 1);
		System.out.println("after sorting: " + sorted);
		
		printArray(sorted);
	}
	
	  /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
