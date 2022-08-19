package com.nachiket.dsa.quicksort;

public class Partition {
	
	public int partition(int[] arr, int start, int end) {
		
		System.out.println("*****************************");
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		
		int pivot = arr[end];
		int replaceWithPivotIndex = start;
		
		System.out.println("pivot: " + pivot);
		
		for(int i = start; i < end; i++) {
			System.out.println("arr[i} : " + arr[i]);
			if(arr[i] <= pivot) {
				System.out.println("i" + i);
				int val1 = arr[i];
				arr[i] = arr[replaceWithPivotIndex];
				arr[replaceWithPivotIndex] = val1;
				
				replaceWithPivotIndex++;
				
				printArray(arr);
				
			}
			
		}
		
		int val2 = arr[end];
		System.out.println("replaceWithPivotIndex: " + replaceWithPivotIndex);
		arr[end] = arr[replaceWithPivotIndex];
		arr[replaceWithPivotIndex] = val2;
		
		printArray(arr);
		return replaceWithPivotIndex;
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
