package com.datastructure.examples;

import com.datastructure.linkedlist.main.LinkedListNode;

public class LinkedListConstructor {
	
	public static LinkedListNode getLinkList(){
		LinkedListNode node1  = new LinkedListNode(9);
		LinkedListNode node2 = new LinkedListNode(2);
		LinkedListNode node3 = new LinkedListNode(17);
		LinkedListNode node4 = new LinkedListNode(32);
		LinkedListNode node5 = new LinkedListNode(7);
		LinkedListNode node6 = new LinkedListNode(11);
		LinkedListNode node7 = new LinkedListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		return node1;
	}

}
