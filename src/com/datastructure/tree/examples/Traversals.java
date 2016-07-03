package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class Traversals {

	public static void main(String[] args){
		TreeNode node = TreeConstructor.getTree();
		
		System.out.println("*****InOrderTraversal*****");
		InOrderTraversal.process(node);
		System.out.println("*****PreOrderTraversal*****");
		PreOrderTraversal.process(node);
		System.out.println("*****PostOrderTraversal*****");
		PostOrderTraversal.process(node);
	}
}
