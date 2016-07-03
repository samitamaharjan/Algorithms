package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class PostOrderTraversal {
	
	public static void process(TreeNode node){
		if (node == null) return;
		process(node.left);
		process(node.right);
		System.out.println(node.value);
	}

}
