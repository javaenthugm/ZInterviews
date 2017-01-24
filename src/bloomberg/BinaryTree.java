package bloomberg;

public class BinaryTree {
	Node root; // Every Tree will have a root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name); // Create a new node;

		if (root == null) {
			root = newNode; // If there are no root this becomes the root;
		} else {
			Node focusNode = root; // We will start from the root;
			Node parent; // future Parent node;
			while (true) {
				parent = focusNode; // root is the parent - so start from there;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return; // All done;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}

				}
			}
		}
	}

	private void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	private void preOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}

	private void postOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}

	private Node findNode(int key) {
		Node focusNode = root;

		while (focusNode.key != key) {
			if (key < focusNode.key) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}

			if (focusNode == null) {
				return null;
			}
		}

		return focusNode;

	}

	public static void main(String args[]) {
		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

		// Different ways to traverse binary trees

		theTree.inOrderTraverseTree(theTree.root);
		System.out.println();

		theTree.preOrderTraverseTree(theTree.root);
		System.out.println();

		theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		System.out.println("\nNode with the key 75");
		System.out.println(theTree.findNode(50));

	}
}

class Node {
	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public String toString() {
		return name + " has a key of " + key;
	}
}