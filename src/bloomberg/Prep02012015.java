package bloomberg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class FibonacciGenerator {

	void usingLogic(int num) {
		int previousNumber = 0;
		int currentNumber = 1;

		while (currentNumber < num) {
			System.out.println(previousNumber);
			int temp = currentNumber;
			currentNumber = previousNumber + currentNumber;
			previousNumber = temp;

		}
		System.out.println(previousNumber);
		System.out.println();
	}

	void usingArray(int num) {
		int[] fibNum = new int[num + 1];
		fibNum[0] = 0;
		fibNum[1] = 1;
		for (int i = 2; i < fibNum.length; i++) {
			fibNum[i] = fibNum[i - 2] + fibNum[i - 1];
		}

		System.out.println(Arrays.toString(fibNum));
	}
}

class ClassicSingleton {
	private static ClassicSingleton instance = null;

	private ClassicSingleton() {
	}

	public synchronized static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
}

class SimpleSingleton {
	private static final SimpleSingleton instance = new SimpleSingleton();

	private SimpleSingleton() {

	}

	public static SimpleSingleton getInstance() {
		return instance;
	}
}

class LogicalQuestions {
	boolean isStringContainUniqueCharacters(String str) {
		boolean[] char_arr = new boolean[256]; // assume char set is ASCII
		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
			int strChar = str.charAt(i);
			// System.out.println(strChar);
			if (char_arr[strChar]) {
				return false;
			} else {
				char_arr[strChar] = true;
			}
		}
		return true;
	}

	void findUniqueCharacters(String str) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			int counter = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					++counter;
				}
			}
			if (counter == 1) {
				sb.append(str.charAt(i));
				sb.append(",");
			}
		}

		System.out.println(sb.toString());
	}

	void findDuplicateNumber(int number) {
		char[] charArr = new String(number + "").toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < charArr.length; i++) {
			int counter = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					++counter;
				}
			}
			if (counter > 1 && !charList.contains(charArr[i])) {
				charList.add(charArr[i]);
			}
		}

		for (Character c : charList) {
			System.out.println(c);
		}
	}

	void reverseString(String str) {
		char[] charArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = charArr.length - 1; i >= 0; i--) {
			sb.append(charArr[i]);
		}

		System.out.println(sb.toString());
	}

	String reverseStringRecursion(String str) {
		String revereString = "";
		if (str.length() == 1) {
			return str;
		} else {
			revereString += str.charAt(str.length() - 1)
					+ reverseStringRecursion(str.substring(0, str.length() - 1));
			System.out.println(revereString);
			return revereString;
		}
	}

	void isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			System.out.println("The number " + num + " is perfect");
		} else {
			System.out.println("Sorry the given number " + num
					+ " is not perfect");
		}
	}

	void findDuplicateChars(String str) {

		char[] chars = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < chars.length; i++) {
			int counter = 0;
			for (int j = 0; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					counter++;
				}
			}

			if (counter > 1) {
				sb.append(chars[i]);
				sb.append(",");
			}
		}
		System.out.println(sb.toString());
	}

	/*
	 * Write a program to find top two maximum numbers in the given array. You
	 * should not use any sorting functions. You should iterate the array only
	 * once. You should not use any kind of collections in java.
	 */
	void findFirstTwoMaxNumbers(int[] array) {
		int firstMax = 0;
		int secondMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (firstMax < array[i]) {
				secondMax = firstMax;
				firstMax = array[i];
			} else if (secondMax < array[i]) {
				secondMax = array[i];
			}
		}
		System.out.println("1st Max " + firstMax + ",2nd Max " + secondMax);
	}

	void swapTwoValuesWithoutTempVariable() {
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping x=" + x + ",y=" + y);
		x = x + y;
		y = x - y;
		System.out.println("After Swapping x=" + (x + y) / 2 + ",y=" + (x - y)
				/ 2);

	}

	int sum = 0;

	int findSumOfDigitsUsingRecursion(int num) {
		if (num == 0) {
			return sum;
		} else {
			sum += (num % 10);
			findSumOfDigitsUsingRecursion(num / 10);
			return sum;
		}
	}

	void checkPalindrome() {
		String original, reverse = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide String to check palindrom");
		original = scanner.nextLine();

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println(original+","+reverse);
		
		if (original.equals(reverse)) {
			System.out.println("The String given " + original
					+ " is palindrome ");
		} else {
			System.out.println("The String given " + original
					+ " is not palindrom");
		}
		
		scanner.close();

	}
	
	
	
}

class SortingAll {

	private int[] theArray;
	private int arraySize;

	SortingAll(int size) {
		arraySize = size;
		theArray = new int[arraySize];
		generateRandomArray();
	}

	private void generateRandomArray() {
		Random random = new Random();
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = random.nextInt(10) + 10;
		}
	}

	void displayArray() {
		for (int i = 0; i < arraySize-1; i++) {
			System.out.print("|0" + i + "|");
		}
		System.out.println();
		for (int i = 0; i < arraySize-1; i++) {
			System.out.print("|" + theArray[i] + "|");
		}
		System.out.println();
		System.out.println();
	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	void bubbleSort() {
		for (int i = theArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
					// displayArray();
				}
			}
		}
	}

	void selectionSort() {
		for (int i = 0; i < theArray.length; i++) {
			int minimum = i;
			for (int j = i; j < theArray.length; j++) {
				if (theArray[minimum] > theArray[j]) {
					minimum = j;
				}
			}
			swapValues(i, minimum);
		}
	}

	void insertionSort() {
		for (int i = 1; i < theArray.length; i++) {
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = toInsert;
		}
	}

	void shellSort() {
		int inner, outer, toInsert;
		int interval = theArray.length / 3 + 1;

		while (interval > 0) {
			for (outer = interval; outer < theArray.length; outer++) {
				inner = outer;
				toInsert = theArray[outer];
				while ((inner > interval - 1)
						&& (theArray[inner - interval] > toInsert)) {
					theArray[inner] = theArray[outer - interval];
					inner = inner - interval;
				}
				theArray[inner] = toInsert;
			}
			interval = (interval - 1) / 3;
		}
	}

	private int quickSortPartition(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;
		while (true) {
			while (theArray[++leftPointer] < pivot)
				;
			while (rightPointer > 0 && theArray[--rightPointer] > pivot)
				;
			if (leftPointer >= rightPointer) {
				break;
			} else {
				swapValues(leftPointer, rightPointer);
			}
		}
		swapValues(leftPointer, right);
		return leftPointer;
	}

	void quickSort(int left, int right) {
		if (right - left <= 0) {
			return; // all sorting done;
		} else {
			int pivot = theArray[right];
			int pivotLocation = quickSortPartition(left, right, pivot);
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
		}
	}
	
	void deleteItemFromArray(int value){
		int i;
		for(i=0;i<theArray.length;i++){
			if(theArray[i]==value){
				break;
			}
		}
		
		for(int k=i;k<arraySize-1;k++){
			theArray[k] = theArray[k+1];
		}
		arraySize--;
	}

}

public class Prep02012015 {
	static String str = "abcc";
	static int[] theArray = { 5, 6, 3, 7, 9, 2 };

	public static void main(String args[]) {
		
		
		 SortingAll sort = new SortingAll(10);
		 sort.displayArray();
		// sort.bubbleSort();
		// sort.selectionSort();
		// sort.insertionSort();
		// sort.shellSort();
		// sort.quickSort(0, 9);
		// sort.displayArray();

		 sort.deleteItemFromArray(15);
		 sort.displayArray();
		 
		//LogicalQuestions lc = new LogicalQuestions();
		//lc.checkPalindrome();
		// System.out.println(lc.findSumOfDigitsUsingRecursion(12));
		// lc.swapTwoValuesWithoutTempVariable();

		// lc.findFirstTwoMaxNumbers(theArray);

		// lc.findDuplicateChars(str);

		/*
		 * for (int i = 0; i < 100; i++) lc.isPerfectNumber(i);
		 */

		/*
		 * lc.reverseStringRecursion(str); System.out.println();
		 * 
		 * lc.reverseString(str); lc.findDuplicateNumber(1234364);
		 * lc.findUniqueCharacters(str); System.out.println(str + "," +
		 * lc.isStringContainUniqueCharacters(str)); System.out.println();
		 * FibonacciGenerator fibGen = new FibonacciGenerator();
		 * fibGen.usingLogic(4); fibGen.usingArray(4);
		 */
	}

}
