package com.nachiket.linkedlist.sortandmerge;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		
		LinkedListC linkL1 = new LinkedListC();
		LinkedListC linkL2 = new LinkedListC();
		
		linkL1.addToList(new Node(1));
		linkL1.addToList(new Node(2));
		linkL1.addToList(new Node(4));
//		linkL1.addToList(new Node(25));
		
		linkL2.addToList(new Node(1));
		linkL2.addToList(new Node(3));
		linkL2.addToList(new Node(4));
//		linkL2.addToList(new Node(5));
		
		Node sortedList1 = MergeSort.mergeSort(linkL1.giveNode());
		Node sortedList2 = MergeSort.mergeSort(linkL2.giveNode());
		
		printList(sortedList1);
		System.out.println("\n");
		printList(sortedList2);
		System.out.println("\n");		
		Node mergedList = MergeSort.MergeSortedList(sortedList1, sortedList2);
		printList(mergedList);		
		
	}
	
	 static void printList(Node headref)
	    {
	        while (headref != null) {
	            System.out.print(headref.data + " ");
	            headref = headref.next;
	        }
	    }

}
