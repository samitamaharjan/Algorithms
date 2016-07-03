package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class TreeHeight {

	public static void main(String[] args) {
		TreeNode node = TreeConstructor.getTree();
		int height = height(node);
		System.out.println("Height: " + height);
	}
	
	public static int height(TreeNode node) {
		if (node == null) return 0;
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		int maxHeight = Math.max(leftHeight, rightHeight);
		return maxHeight + 1;
		
	}
}
