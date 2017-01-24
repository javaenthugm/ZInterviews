package xtras;

//Binary Search is quicker than Linear Search
//But elements in the array has to be sorted first
//Disadvantage - it doesn't work very well with the duplicate values

public class BinarySearch {

	private int[] theArray;
	private int arraySize;

	public BinarySearch(int size) {
		arraySize = size;
		theArray = new int[arraySize];
	}

	public void generateRandomValue() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10 + 10);
		}
	}

	public void printArray() {

		// System.out.println("i=" + iIndex + ",j=" + jIndex);
		System.out
		.println("------------------------------------------------------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| 0" + i + " |");
		}
		System.out.println();
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + theArray[i] + " |");
		}
		System.out.println();
		System.out
		.println("------------------------------------------------------------");

	}

	public void bubbleSort() {
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					// printArray(i, j);
					swapValues(j, j + 1);
				} else {
					// System.out.println("No Swapping");
					// printArray(i, j);
				}
			}
		}
	}

	// Binary Search is quicker than Linear Search
	// But elements in the array has to be sorted first
	// Disadvantage - it doesn't work very well with the duplicate values
	public void binarySearch(int value) {
		int lowIndex = 0;
		int highIndex = arraySize - 1;

		while (lowIndex <= highIndex) {

			int middleIndex = (highIndex + lowIndex) / 2;

			if (theArray[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			} else if (theArray[middleIndex] > value) {
				highIndex = middleIndex - 1;
			} else {
				System.out.println("Found the match " + value
						+ " at the index " + middleIndex);
				lowIndex = highIndex + 1;
			}

		}

	}

	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	public static void main(String args[]) {
		BinarySearch bSort = new BinarySearch(10);
		bSort.generateRandomValue();
		bSort.printArray();
		bSort.bubbleSort();
		System.out.println();
		bSort.printArray();
		bSort.binarySearch(15);

	}

}
