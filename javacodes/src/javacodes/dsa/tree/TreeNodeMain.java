package javacodes.dsa.tree;

public class TreeNodeMain {

	public static void main(String[] args) {

		TreeNode rootNode = null;
		
		rootNode = TreeNode.insert(rootNode, 1);
		rootNode = TreeNode.insert(rootNode, 2);
		rootNode = TreeNode.insert(rootNode, 3);
		rootNode = TreeNode.insert(rootNode, 4);
		rootNode = TreeNode.insert(rootNode, 5);
		rootNode = TreeNode.insert(rootNode, 6);
		rootNode = TreeNode.insert(rootNode, 7);
		rootNode = TreeNode.insert(rootNode, 8);
		rootNode = TreeNode.insert(rootNode, 9);
		rootNode = TreeNode.insert(rootNode, 10);
		rootNode = TreeNode.insert(rootNode, 11);
		rootNode = TreeNode.insert(rootNode, 12);
		rootNode = TreeNode.insert(rootNode, 13);
		rootNode = TreeNode.insert(rootNode, 14);
		rootNode = TreeNode.insert(rootNode, 15);
		
		System.out.println();
		System.out.println("Printing the contents of the tree with out recursion PreOrder");
		rootNode.preOrderTraverseWithOutRecursion(rootNode);

		System.out.println();
		System.out.println("Printing the contents of the tree with recursion PreOrder");
		rootNode.preOrderTraverseWithOutRecursion(rootNode);
		
		System.out.println();
		System.out.println("Printing the contents of the tree with out recursion PostOrder");
		rootNode.postOrderTraverseWithOutRecursion(rootNode);
		
		System.out.println();
		System.out.println("Printing the contents of the tree with recursion PostOrder");
		rootNode.postOrderTraverseWithOutRecursion(rootNode);
	}

}

