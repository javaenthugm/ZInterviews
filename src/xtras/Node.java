package xtras;

public class Node {

	private String bookName;
	private int millionSold;
	private Node next;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getMillionSold() {
		return millionSold;
	}

	public void setMillionSold(int millionSold) {
		this.millionSold = millionSold;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(String bookName, int millionSold) {
		this.bookName = bookName;
		this.millionSold = millionSold;
	}

	public void display() {
		System.out.println(this.getBookName() + ":" + this.getMillionSold()
				+ ",000,000");
	}

	public String toString() {
		return getBookName();
	}

	public static void main(String args[]) {

		Head head = new Head();
		System.out.println(head.isEmpty());

		head.insertNode("Book-1", 1);
		head.insertNode("Book-2", 2);
		head.insertNode("Book-3", 3);
		head.insertNode("Book-4", 4);
		System.out.println(head.isEmpty());

		head.displayNodes();
		System.out.println();
		/*head.removeFirstNode();
		System.out.println();
		head.displayNodes();*/

		System.out.println("FIND " + head.find("Book-1"));
		System.out.println();
		System.out.println("Remove " + head.removeNode("Book-6"));
		System.out.println();
		head.displayNodes();
	}
}

class Head {
	Node firstNode;

	public Head() {
		firstNode = null;
	}

	public boolean isEmpty() {
		return (firstNode == null);
	}

	public void insertNode(String bookName, int millionSold) {
		Node newNode = new Node(bookName, millionSold);
		newNode.setNext(firstNode);
		firstNode = newNode;
	}

	public void displayNodes() {

		Node nodeRef = firstNode;

		while (nodeRef != null) {
			nodeRef.display();
			System.out.println("Next Node is " + nodeRef.getNext());
			nodeRef = nodeRef.getNext();
		}

	}

	public void removeFirstNode() {
		Node nodeRef = firstNode;
		if (!isEmpty()) {
			firstNode = nodeRef.getNext();
		} else {
			System.out.println("List is empty");
		}

	}

	public Node find(String bookName) {

		Node nodeRef = firstNode;
		if (!isEmpty()) {
			while (!bookName.equalsIgnoreCase(nodeRef.getBookName())) {
				if (nodeRef.getNext() == null) {
					return null;
				} else {
					nodeRef = nodeRef.getNext();
				}
			}
		} else {
			System.out.println("Empty list");
		}

		return nodeRef;
	}

	public Node removeNode(String bookName) {

		Node currentNode = firstNode;
		Node previousNode = firstNode;

		if (!isEmpty()) {

			while (!bookName.equalsIgnoreCase(currentNode.getBookName())) {
				if (currentNode.getNext() != null) {
					previousNode = currentNode;
					currentNode = currentNode.getNext();
				}else{
					System.out.println("Didn't find a node with the name " + bookName +" to remove");
					return null;
				}
			}

		} else {
			System.out.println("Empty list");
		}
		
		if(currentNode ==previousNode){
			currentNode = currentNode.getNext();
		}else{
			System.out.println("FOUND match");
			System.out.println("Current Node "+currentNode);
			System.out.println("Previous Node "+previousNode);
			previousNode.setNext(currentNode.getNext());
		}

		return currentNode;

	}

}