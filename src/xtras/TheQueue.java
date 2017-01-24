package xtras;

public class TheQueue {

	private String[] qArray;
	private int qSize;

	private int front, rear, numberOfItems = 0;

	public TheQueue(int size) {
		qSize = size;
		qArray = new String[qSize];
	}

	public void printStack() {
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print("| " + i + " |");
			if (qArray[i].equals("-1")) {
				System.out.println(" |   |");
			} else {
				System.out.println(" | " + qArray[i] + "|");
			}
		}
	}

	public void enQueue(String input) {
		if (numberOfItems + 1 < qSize) {
			qArray[rear] = input;
			rear++;
			numberOfItems++;
		}else{
			System.out.println("Queue is full");
		}
	}
	
	public void deQueue(){
		if(numberOfItems>0){
			qArray[front]="-1";
			front++;
		}
	}
	
	public String peek(){
		if(numberOfItems>0){
			return qArray[front];
		}else{
			return "Queue is Empty";
		}
	}

	public static void main(String args[]) {
		TheQueue q = new TheQueue(10);
		q.enQueue("10");
		q.enQueue("30");
		q.enQueue("15");
		System.out.println(q.peek());
		q.printStack();
		System.out.println();
		q.deQueue();
		q.printStack();
		System.out.println();
		q.deQueue();
		q.printStack();
		System.out.println(q.peek());

	}
}
