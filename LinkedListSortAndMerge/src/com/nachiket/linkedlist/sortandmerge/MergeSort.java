package com.nachiket.linkedlist.sortandmerge;

public class MergeSort {
	
	public static Node MergeSortedList(Node left, Node right) {
		
		Node result = null;
		
		if(left == null) {
			return right;
		}
		
		if(right == null) {
			return left;
		}
		
		if(left.data <= right.data) {
			result = left;
			result.next = MergeSortedList(left.next, right);
		}
		else {
			result = right;
			result.next = MergeSortedList(left, right.next);
		}
		
		return result;
		
	}
	
	public static Node mergeSort(Node node) {
		
		if(node == null || node.next == null) {
			return node;
		}
		
		Node middle = findMiddle(node);
		Node nextOfMiddle = middle.next;
		
		middle.next = null;
		
		Node left = mergeSort(node);
		Node right = mergeSort(nextOfMiddle);
		
		Node sortedList = MergeSortedList(left, right);
		
		return sortedList;
		
	}
	
	
	private static Node findMiddle(Node node) {
		
		if(node == null) {
			return node;
		}
		
		Node s = node;
		Node f = node;
		
		while(f.next != null && f.next.next != null) {
			s = s.next;
			f = f.next.next;
		}
		
		return s;
		
	}

}
