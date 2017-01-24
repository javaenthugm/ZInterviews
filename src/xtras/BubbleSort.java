package xtras;

public class BubbleSort {

	private int[] theArray;
	private int arraySize;

	public BubbleSort(int size) {
		arraySize = size;
		theArray = new int[arraySize];
	}

	public void generateRandomValue() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10 + 10);
		}
	}

	public void printArray(int iIndex, int jIndex) {

		System.out.println("i=" + iIndex + ",j=" + jIndex);
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
					printArray(i, j);
					swapValues(j, j + 1);
				} else {
					System.out.println("No Swapping");
					printArray(i, j);
				}
			}
		}
	}



	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	public static void main(String args[]) {
		BubbleSort bSort = new BubbleSort(10);
		bSort.generateRandomValue();
		bSort.printArray(0, 0);
		bSort.bubbleSort();
		System.out.println();
		bSort.printArray(0, 0);
		

	}

}
