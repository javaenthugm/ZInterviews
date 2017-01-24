package xtras;

public class LinearSearchAndArrayStructures {

	private int[] theArray = new int[50];
	private int arraySize = 10;

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10 + 10);
		}
	}

	public void printArray() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
		}
	}

	public int getValueAtIndex(int index) {
		if (index < arraySize) {
			return theArray[index];
		} else {
			return 0;
		}
	}

	public boolean doesArrayContainsThisValue(int value) {

		boolean arrayContainsValue = false;

		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				arrayContainsValue = true;
				break;
			}
		}
		return arrayContainsValue;

	}

	public void deleteThisIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < arraySize - 1; i++) {
				theArray[i] = theArray[i + 1];
			}
		} else {
			System.out.println("Index is out of range");
		}
		arraySize--;
	}

	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize++] = value;
			// arraySize++;
		}
	}

	public void linearSearch(int value) {
		String indexValues = "";
		for (int i = 0; i < arraySize; i++) {
			if(theArray[i]==value)
				indexValues+=i+" ";
		}
		System.out.println("Index Values " +indexValues);
	}

	public static void main(String args[]) {
		LinearSearchAndArrayStructures arrayStructures = new LinearSearchAndArrayStructures();
		arrayStructures.generateRandomArray();
		arrayStructures.printArray();
		System.out.println();
		System.out.println(arrayStructures.getValueAtIndex(4));
		System.out.println(arrayStructures.doesArrayContainsThisValue(11));
		arrayStructures.deleteThisIndex(5);
		arrayStructures.printArray();
		System.out.println();
		arrayStructures.insertValue(55);
		arrayStructures.printArray();
		
		arrayStructures.linearSearch(17);
	}

}
