package javacodes.dsa.module6.linkedlist;

public class MyLinkedList {

	Node head;

	int length = 0;

	public void add(int data) {
		if (head == null) {
			this.head = new Node(data);
		} else {
			Node newNodeToAdd = new Node(data);
			Node tempNode = this.head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			{
				tempNode.next = newNodeToAdd;
			}
		}
		length = length + 1;
	}

	public void insertNode(int data, int position) {
		Node tempNode = this.head;
		Node tempPrevious = tempNode;
		int index = 1;

		if (position > this.length)
			throw new IndexOutOfBoundsException("Original list size is : " + this.length);

		if (position == 1) {
			Node newNodeToInsert = new Node(data);
			newNodeToInsert.next = this.head;
			this.head = newNodeToInsert;
		} else {
			while (index != position) {

				index++;
				tempPrevious = tempNode;
				tempNode = tempNode.next;
			}

		}

		if (index == position) {
			Node newNodeToInsert = new Node(data);
			newNodeToInsert.next = tempNode;
			tempPrevious.next = newNodeToInsert;
			this.length++;
		}
	}

	public void printElements() {
		Node tempNode = this.head;

		if (tempNode != null && tempNode.next != null) {
			while (tempNode.next != null) {
				System.out.println(tempNode.data);
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.data);
		} else {
			System.out.println(tempNode.data);
		}
	}

	public int length() {
		return this.length;
	}

	public void midOfLinkedList() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Slow.data : " + slow.data);
	}

	public void reverseLinkedList() {
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		Node tempNode = prev;

		if (tempNode != null && tempNode.next != null) {
			while (tempNode.next != null) {
				System.out.println(tempNode.data);
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.data);
		} else {
			System.out.println(tempNode.data);
		}
	}

	public void checkForPalindrome() {
		// Step 1 Getting mid point
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// Now slow has mid element

		// Step 2 Reverse the second half of the list
		Node prev = null;
		Node current = slow;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		// Now prev is pointing to other end of list till middle

		// Step 3 now start comparing from head and prev the elements till prev is not
		// null
		Node leftHead = this.head;
		Node rightHead = prev;
		while (rightHead != null) {
			if (leftHead.data != rightHead.data) {
				System.out.println("Linked list is not palindrome");
				return;
			} else {
				leftHead = leftHead.next;
				rightHead = rightHead.next;
			}
		}
		System.out.println("Linked list is palindrome");
	}

	public void swapConsecutivePairs() {

		if (head.next == null) {
			System.out.println("List has only one element : " + head.data);
			return;
		}

		if (head.next != null && head.next.next == null) {
			System.out.println("List has only two elements : " + head.data);

			System.out.println("Original linked list");

			printElements();

			System.out.println();
			Node temp = null;
			Node node1 = head;
			Node node2 = head.next;
			temp = node2;
			temp.next = node2.next;
			node2.next = node1;
			node1.next = null;
			System.out.println("After swaping elements in list");

			temp = node2;
			while (temp.next != null) {
				System.out.println(temp.data);
				temp = temp.next;
				if (temp.next == null)
					System.out.println(temp.data);
			}

			return;
		}

//		Node newHead = null;
//		Node node1 = this.head;
//		Node node2 = this.head;
//		Node temp = this.head;
//
//		boolean firstFlag = true;
//
//		System.out.println("There are more than 2 elements in the list");
//		printElements();
//		System.out.println();
//
//		while (node1 != null && node1.next != null) {
//			node2 = node2.next;
//			temp = node2.next;
//			node2.next = node1;
//			node1.next = temp;
//
//			if (firstFlag) {
//				newHead = node2;
//				this.head = newHead;
//				firstFlag = false;
//			}
//			if (node1.next != null) {
//				node1 = node1.next;
//				node2 = node1;
//			}
//		}
//		System.out.println("After swaping the elements");
//		printElements();

		Node currentNode = this.head;
		Node nextNode = this.head;
		Node tempNode = this.head;
		boolean firstFlag = true;
		
		while(currentNode!=null && currentNode.next!=null) {
			
			if(currentNode.next.next!=null)
				tempNode = currentNode.next.next;
			else
				tempNode = null;
			
			nextNode = currentNode.next;
			nextNode.next = currentNode;
			currentNode.next = tempNode;
			
			if(firstFlag) {
				this.head = nextNode;
				firstFlag = false;
			}
			
			if(tempNode==null){
				break;
			}else {
				currentNode = tempNode;
			}
		}
		System.out.println(this.head);
		
		printElements();
	}

}
