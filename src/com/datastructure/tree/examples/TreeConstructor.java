package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class TreeConstructor {

	public static TreeNode getTree() {
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(7);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(11);
		TreeNode node7 = new TreeNode(18);
		TreeNode node8 = new TreeNode(10);
		TreeNode node9 = new TreeNode(14);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node6.left = node8;
		node6.right = node9;
		
		return node1;
	}
}
