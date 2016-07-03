package com.datastructure.examples;

import com.datastructure.linkedlist.main.LinkedListNode;

public class Traversal {
	
	public static void main(String[] args){
		LinkedListNode node = LinkedListConstructor.getLinkList(); 
		
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}

}
