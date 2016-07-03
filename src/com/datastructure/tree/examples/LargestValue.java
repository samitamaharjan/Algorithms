package com.datastructure.tree.examples;

import com.datastructure.tree.main.TreeNode;

public class LargestValue {

	public static void main(String[] args) {
		TreeNode node = TreeConstructor.getTree();
		int largestValue = getLargest(node);
		System.out.println("The largest value: " + largestValue);
	}
	
	public static int getLargest(TreeNode node){
		if (node == null) return 0;
		int leftLargest = getLargest(node.left);
		int rightLargest = getLargest(node.right);
		int max = Math.max(leftLargest, rightLargest);
		int largest = Math.max(max, node.value);
		return largest;
	}

}
