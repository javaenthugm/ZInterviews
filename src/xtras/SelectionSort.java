package xtras;

public class SelectionSort {

	private int[] theArray;
	private int arraySize;

	public SelectionSort(int size) {
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

	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time

	public void selectionSort() {

		for (int i = 0; i < arraySize - 1; i++) {
			int minimum = i;
			for (int j = i; j < arraySize - 1; j++) {
				if (theArray[minimum] > theArray[j]) {
					swapValues(minimum, j);
					printArray();
					System.out.println("Swapping " + i + "," + j);
					System.out.println();
				} else {
					printArray();
					System.out.println("No Swapping " + i + "," + j);
					System.out.println();
				}
			}

		}
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
		SelectionSort sSort = new SelectionSort(10);
		sSort.generateRandomValue();
		sSort.printArray();
		System.out.println();
		sSort.selectionSort();
		sSort.printArray();

	}

}
