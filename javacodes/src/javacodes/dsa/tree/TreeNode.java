package javacodes.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {

	int val;
	TreeNode leftNode;
	TreeNode rightNode;
	
	public TreeNode(int val) {
		this.val = val;
		leftNode = rightNode = null;
	}
	
	/*
	 * Insert operation on treenode
	 */
	public static TreeNode insert(TreeNode rootNode, int val) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(rootNode==null) {
			rootNode = new TreeNode(val);
			return rootNode;
		}
		
		queue.offer(rootNode);
		
		while(!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			
			if(tempNode.leftNode==null) {
				tempNode.leftNode = new TreeNode(val);
				break;
			}else {
				queue.offer(tempNode.leftNode);
			}
			
			if(tempNode.rightNode==null) {
				tempNode.rightNode = new TreeNode(val);
				break;
			}else {
				queue.offer(tempNode.rightNode);
			}
		}
		
		return rootNode;
		
	}

	/*
	 * Preorder traversal with out recursion 
	 */
	public static void preOrderTraverseWithOutRecursion(TreeNode rootNode) {
		
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(rootNode);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.print(node.val + " ");
			if(node.rightNode!=null)
				stack.push(node.rightNode);
			if(node.leftNode!=null)
				stack.push(node.leftNode);
		}
	}
	
	/*
	 * Preorder traversal with recursion 
	 */
	public static void preOrderTraverseWithRecursion(TreeNode rootNode) {
		
		if(rootNode==null)
			return;
		
		System.out.print(rootNode.val);
		
		preOrderTraverseWithRecursion(rootNode.leftNode);
		
		preOrderTraverseWithRecursion(rootNode.rightNode);
		
	}
	
	/*
	 * Postorder traversal with out recursion
	 */
	public static void postOrderTraverseWithOutRecursion(TreeNode rootNode) {
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(rootNode);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			
			System.out.print(node.val + " ");
			
			if(node.leftNode!=null)
				stack.push(node.leftNode);
			
			if(node.rightNode!=null)
				stack.push(node.rightNode);
			
		}
	}
	
	/*
	 * Postorder traversal with recursion
	 */
	public static void postOrderTraverseWithRecursion(TreeNode rootNode) {
	
		if(rootNode==null)
			return;
		
		System.out.println(rootNode.val + " ");
		
		postOrderTraverseWithOutRecursion(rootNode.rightNode);
		
		postOrderTraverseWithRecursion(rootNode.leftNode);
	}
}






















