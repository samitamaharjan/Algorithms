package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class PreOrderTraversal {
	
	public static void process(TreeNode node){
		if (node == null) return;
		System.out.println(node.value);
		process(node.left);
		process(node.right);
	}
}
