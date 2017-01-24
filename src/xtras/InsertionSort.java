package xtras;

public class InsertionSort {

	private int[] theArray;
	private int arraySize;

	public InsertionSort(int size) {
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

	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	public void insertionSort() {
		
		for (int i = 1; i < arraySize; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;
				printArray();
				System.out.println(i+","+j);
			}
			theArray[j] = toInsert;
			printArray();
			System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = "
					+ theArray[j] + " toInsert = " + toInsert + "\n");

		}

	}

	public static void main(String args[]) {
		InsertionSort iSort = new InsertionSort(10);
		iSort.generateRandomValue();
		iSort.printArray();
		System.out.println();
		//sSort.selectionSort();
		iSort.insertionSort();
		iSort.printArray();

	}

}
