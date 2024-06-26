package javacodes.dsa.tree;

public class BinaryTree {

	Node root;
	
	public static void main(String[] args) {
		
		BinaryTree bt = createBinaryTree();

		
		System.out.println("Binary tree created" + bt);

	}
	
	

	
	private static BinaryTree createBinaryTree() {
	    BinaryTree bt = new BinaryTree();

	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);

	    return bt;
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
}

