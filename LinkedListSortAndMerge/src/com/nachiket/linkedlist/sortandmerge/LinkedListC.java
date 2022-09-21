package com.nachiket.linkedlist.sortandmerge;

public class LinkedListC {
	
	Node head = null;
	
	public void addToList(Node node) {
		
//		node.next = head;
//		head = node;
		
		if(head == null) {
			head = node;
		}
		else {
			
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = node;
			
		}
	}
	
	public Node giveNode() {
		return head;
	}
	

}
