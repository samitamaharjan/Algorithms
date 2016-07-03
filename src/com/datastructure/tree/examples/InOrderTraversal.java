package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class InOrderTraversal {
	
	public static void process(TreeNode node){
		if (node == null) return;
		process(node.left);
		System.out.println(node.value);
		process(node.right);
	}
}

