package xtras;

public class TheStack {

	private String[] stackArray;
	private int stackSize;

	private int topOfStack = -1; // empty Stack

	public TheStack(int size) {
		this.stackSize = size;
		stackArray = new String[stackSize];
	}

	public void printStack() {
		for (int i = topOfStack; i >= 0; i--) {
			System.out.print("| " + i + " |");
			if (stackArray[i].equals("-1")) {
				System.out.println(" |    |");
			} else {
				System.out.println(" | " + stackArray[i] + "|");
			}
		}
	}

	public void push(String newValue) {

		if (topOfStack + 1 < stackSize) {
			stackArray[++topOfStack] = newValue;
		} else {
			System.out.println("The Stack is full");
		}
	}

	public String pop() {
		if (topOfStack >= 0) {
			stackArray[topOfStack] = "-1";
			printStack();
			return stackArray[topOfStack--];
		} else {
			printStack();
			return "-1";
		}
	}

	public String peek() {
		if (topOfStack >= 0) {
			return stackArray[topOfStack];
		} else {
			return "The stack is empty";
		}

	}

	public void popAll() {
		for (int i = topOfStack; i >= 0; i--) {
			pop();
		}
	}

	public void pushMany(String manyValues) {
		String[] valueArray = manyValues.split(" ");
		for (int x = 0; x < valueArray.length; x++) {
			push(valueArray[x]);
		}
	}

	public static void main(String args[]) {
		TheStack myStack = new TheStack(10);

		myStack.push("Sindhu");
		myStack.push("Paru");
		myStack.push("Gopi");
		myStack.printStack();
		System.out.println("Peek " + myStack.peek());

		// System.out.println();
		myStack.pushMany("10 20 30 40 50 60");
		myStack.printStack();

		System.out.println("Popped item " + myStack.pop());
		System.out.println("Peek " + myStack.peek());
		System.out.println("Popped item " + myStack.pop());
		System.out.println("Peek " + myStack.peek());
		System.out.println("Popped item " + myStack.pop());
		System.out.println("Peek " + myStack.peek());

	
		/*
		 * myStack.popAll(); System.out.println("After popAll");
		 * myStack.printStack();
		 */

	}
}
