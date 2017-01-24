package bloomberg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MiscQuestions {
	int sum = 0;

	private int[] theArray = { 1, 2, 1, 3, 6, 4, 3 };

	public static void main(String args[]) {
		

		// System.out.println(calculateRun("aaabc"));
		// findMiddleIndex(theArray);
				
		
		
		// findUniqueCharacater("eabac");
		// findDuplicateNumber(theArray);
		// createSingleTon();
		// reverseString("abc");
		/*
		 * for(int i =0;i<=100;i++){ isPerfectNumber(i); }
		 */
				
		// System.out.println(revereStringUsingRecursion("abc"));
		
		// findDuplicateCharactors("abccd");

		// findTwoMaxNumbersFromArray(theArray);

		// swapTwoValuesWithoutUsingTempVariable();

		// fibonacciSeries(4);

		/*
		 * MiscQuestions misc = new MiscQuestions();
		 * System.out.println(misc.findSumOfDigitsUsingRecursion(12));
		 */

		// System.out.println(isPrime(12));

		// isBinary(110101010);

		/*
		 * MiscQuestions misc = new MiscQuestions(); misc.bubbleSort();
		 * misc.printArray(); System.out.println(); System.out.println();
		 * misc.insertionSort(); misc.selectionSort(); misc.printArray();
		 */

		// findDistinctElements();

		// stringToNumber();
		sumOfPrims(7);

	}

	/*
	 * Write a program to find the sum of the first 1000 prime numbers. - See
	 * more at:
	 * http://www.java2novice.com/java-interview-programs/prime-sum/#sthash
	 * .avEjRK1i.dpuf
	 */
	public static void sumOfPrims(int nums){
		/*int num = 8;
		int primeSum=0;
		boolean isPrime=true;
		for(int i =2;i<num/2;i++){
			if(num%i==0){
				isPrime=false;
			}
		}
		if(isPrime){
			System.out.println(num+ " is prime");
		}else{
			System.out.println(num+ " is not prime");
		}
		*/
		/*int primeCounter = 0;
		int startPrimeCheck = 2;
		while(true){
			boolean isPrimeNumber=true;
			for(int i=2;i<startPrimeCheck/2;i++){
				if(startPrimeCheck%i==0){
					isPrimeNumber=false;
				}
			}
			if(isPrimeNumber){
				primeCounter++;
				System.out.print(startPrimeCheck+" ");
				startPrimeCheck++;
			}
			if(primeCounter>10){
				break;
			}
		}*/
		
	}
	
	

	/*
	 * convert string format of a number to number without calling
	 * Integer.parseInt() method. We can do this by converting each character
	 * into ascii format and form the number. - See more at:
	 * http://www.java2novice
	 * .com/java-interview-programs/string-to-number/#sthash.8hUjmpvG.dpuf
	 */
	public static void stringToNumber() {
		String input = "abc";
		char[] charArray = input.toCharArray();
		int strNumber = 0;
		for (char c : charArray) {
			strNumber += (int) c;
		}

		System.out.println(strNumber);
	}

	/*
	 * The below example shows how to avoid duplicate elements from an array and
	 * disply only distinct elements. Please use only arrays to process it. -
	 * See more at:
	 * http://www.java2novice.com/java-interview-programs/distinct-elements
	 * /#sthash.GU5CVaR9.dpuf
	 */
	public static void findDistinctElements() {
		int[] numArray = { 1, 3, 2, 1, 4 };

		for (int i = 0; i < numArray.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (numArray[i] == numArray[j]) {
					isDistinct = true;
					break;
				}
			}

			if (!isDistinct) {
				System.out.print(numArray[i] + " ");
			}
		}

		/*
		 * Character[] chars = {'a','b','a','c'}; Map<Character, Integer> map =
		 * new HashMap<Character, Integer>(); for(Character c:chars){
		 * if(map.containsKey(c)){ map.put(c, map.get(c)+1); }else{ map.put(c,
		 * 1); } } Set<Character> set = map.keySet(); for(Character c:set){
		 * System.out.println(c+":"+map.get(c)); }
		 */
	}

	// { 1,2, 1, 3, 6, 4, 3 };

	public void selectionSort() {
		for (int i = 0; i < theArray.length; i++) {
			int minimum = i;
			for (int j = i; j < theArray.length; j++) {
				if (theArray[minimum] > theArray[j]) {
					swapValues(minimum, j);
				}
			}

		}

	}

	public void insertionSort() {
		for (int i = 1; i < theArray.length; i++) {
			int j = i;
			int toInsertValue = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsertValue)) {
				theArray[j - 1] = theArray[j];
				j--;
			}
			theArray[j] = toInsertValue;
		}
	}

	public void printArray() {
		for (int i = 0; i < theArray.length; i++) {
			System.out.print("| 0" + i + " |");
		}
		System.out.println();
		for (int i = 0; i < theArray.length; i++) {
			System.out.print("|  " + theArray[i] + " |");
		}
	}

	public void bubbleSort() {
		for (int i = theArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (theArray[j] < theArray[j + 1]) {
					swapValues(j, j + 1);
				}
		}

	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		// /printArray();
	}

	public static void isBinary(int num) {
		boolean isBinary = true;
		while (true) {
			if (num == 0) {
				break;
			} else if (num % 10 > 1) {
				isBinary = false;
				break;
			} else {
				num = num / 10;
			}
		}

	}

	/*
	 * A prime number (or a prime) is a natural number greater than 1 that has
	 * no positive divisors other than 1 and itself. A natural number greater
	 * than 1 that is not a prime number is called a composite number. For
	 * example, 5 is prime, as only 1 and 5 divide it, whereas 6 is composite,
	 * since it has the divisors 2 and 3 in addition to 1 and 6. The fundamental
	 * theorem of arithmetic establishes the central role of primes in number
	 * theory: any integer greater than 1 can be expressed as a product of
	 * primes that is unique up to ordering. This theorem requires excluding 1
	 * as a prime. - See more at:
	 * http://www.java2novice.com/java-interview-programs
	 * /is-prime-number/#sthash.ectNwA70.dpuf
	 */

	public static boolean isPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	/*
	 * Below example shows how to find out sum of each digit in the given number
	 * using recursion logic. For example, if the number is 259, then the sum
	 * should be 2+5+9 = 16. - See more at:
	 * http://www.java2novice.com/java-interview
	 * -programs/number-sum-recursive/#sthash.QEikHLGa.dpuf
	 */

	public int findSumOfDigitsUsingRecursion(int num) {

		System.out.println(num);

		if (num == 0) {
			return sum;
		} else {
			System.out.println("mod(10) " + num % 10);
			sum += num % 10;
			System.out.println("by(10) " + num / 10);
			findSumOfDigitsUsingRecursion(num / 10);
			return sum;
		}

	}

	// 0,1,1,2,3,5,8,13
	public static void fibonacciSeries(int num) {

		int[] fib = new int[num];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		System.out.println(Arrays.toString(fib));
	}

	/*
	 * Write a program to swap or exchange two numbers. You should not use any
	 * temporary or third variable to swap.
	 * http://www.java2novice.com/java-interview
	 * -programs/swap-two-numbers/#sthash.sTQPx3n7.dpuf
	 */
	public static void swapTwoValuesWithoutUsingTempVariable() {
		int x = 10;
		int y = 20;
		System.out.println("Before Swap X=" + x + " and Y=" + y);
		x = x + y;
		y = x - y;

		System.out.println("After Swap X=" + (x + y) / 2 + " and Y=" + (x - y)
				/ 2);

	}

	/*
	 * Write a program to find top two maximum numbers in the given array. You
	 * should not use any sorting functions. You should iterate the array only
	 * once. You should not use any kind of collections in java.
	 * http://www.java2novice
	 * .com/java-interview-programs/two-max-numbers-in-array
	 * /#sthash.bEYnyfm9.dpuf
	 */
	public static void findTwoMaxNumbersFromArray(int[] inArray) {
		int firstMax = 0;
		int secondMax = 0;

		for (int i = 0; i < inArray.length; i++) {
			System.out.println(i + " " + inArray[i] + " " + firstMax + ","
					+ secondMax);
			if (firstMax < inArray[i]) {
				secondMax = firstMax;
				firstMax = inArray[i];
			} else if (secondMax < inArray[i]) {
				secondMax = inArray[i];
			}
		}

		System.out.println(firstMax + " : " + secondMax);
	}

	/*
	 * Write a program to find out duplicate or repeated characters in a string,
	 * and calculate the count of repeatation.
	 * http://www.java2novice.com/java-interview
	 * -programs/duplicate-string-character-count/#sthash.vlbz6U7l.dpuf
	 */
	public static void findDuplicateCharactors(String str) {
		Map<Character, Integer> dupChar = new HashMap<Character, Integer>();
		char[] charArrays = str.toCharArray();
		for (char c : charArrays) {
			if (dupChar.containsKey(c)) {
				dupChar.put(c, dupChar.get(c) + 1);
			} else {
				dupChar.put(c, 1);
			}
		}

		Set<Character> chr = dupChar.keySet();
		for (Character c : chr) {
			if (dupChar.get(c) > 1) {
				System.out.println("Character " + c + "  =>" + dupChar.get(c));
			} else {
				System.out.println("No Duplicates");
			}
		}
	}

	/*
	 * A perfect number is a positive integer that is equal to the sum of its
	 * proper positive divisors, that is, the sum of its positive divisors
	 * excluding the number itself. Equivalently, a perfect number is a number
	 * that is half the sum of all of its positive divisors. The first perfect
	 * number is 6, because 1, 2 and 3 are its proper positive divisors, and 1 +
	 * 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all its
	 * positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6.
	 * http://www.java2novice.com/java
	 * -interview-programs/perfect-number/#sthash.OXfCoqxm.dpuf
	 */

	public static boolean isPerfectNumber(int num) {
		boolean isPerfect = false;
		int temp = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp += i;
			}
		}

		if (temp == num) {
			System.out.println(num + " is a perfect number");
			isPerfect = true;
		} else {
			// System.out.println(num +"  is not a perfect number");
		}

		return isPerfect;

	}

	/*
	 * Write a program to reverse a string using recursive methods. You should
	 * not use any string reverse methods to do this.
	 * http://www.java2novice.com/
	 * java-interview-programs/string-reverse-recursive/#sthash.f0ixDB3t.dpuf
	 */
	public static String revereStringUsingRecursion(String s) {
		String reverse = "";
		if (s.length() == 1) {
			return s;
		} else {
			reverse += s.charAt(s.length() - 1)
					+ revereStringUsingRecursion(s.substring(0, s.length() - 1));
			;
			return reverse;
		}

	}

	public static void reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length(); i > 0; i--) {
			sb.append(s.substring(i - 1, i));
		}
		System.out.println(sb.toString());
	}

	public static void createSingleTon() {
		SingletonClassic s = SingletonClassic.getInstance();
		s.testSingleton("Are you alive?");

	}

	/*
	 * You are given an array of numbers. Find out the array index or position
	 * where sum of numbers preceeding the index is equals to sum of numbers
	 * succeeding the index.
	 * http://www.java2novice.com/java-interview-programs/find
	 * -middle-index/#sthash.zB0hzYN4.dpuf
	 */

	public static void findMiddleIndex(int[] inArray) {

		for (int index = 0; index < inArray.length - 1; index++) {
			if (getMiddleIndex(inArray, 0, index) == getMiddleIndex(inArray,
					index + 1, inArray.length - 1))
				System.out.println("MiddleIndex :" + index + ".");
		}

	}

	private static int getMiddleIndex(int[] array1, int i, int index) {
		if (i > index)
			return 0;
		else
			return array1[i] + getMiddleIndex(array1, i + 1, index);
	}

	/*
	 * You have got a range of numbers between 1 to N, where one of the number
	 * is repeated. You need to write a program to find out the duplicate
	 * number.
	 * http://www.java2novice.com/java-interview-programs/duplicate-number
	 * /#sthash.V0y5llhQ.dpuf
	 */
	public static void findDuplicateNumber(int[] inArray) {

		int dupVal = 0;
		int counter = 0;
		for (int i = 0; i < inArray.length; i++) {

			for (int j = 0; j < inArray.length; j++) {
				if (inArray[i] == inArray[j]) {
					counter++;
					if (counter > 1) {
						System.out.println("Duplicate found for the number "
								+ inArray[i]);
						break;
					}
				}
			}
			counter = 0;

		}

	}

	public static void findUniqueCharacater(String s) {

		int counter = 0;
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			System.out.println("checking " + s.charAt(i));
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					counter++;
					System.out.println("Found Match " + s.charAt(j)
							+ "-Counter " + counter);
					if (counter > 1) {
						System.out.println("More than one occurance for "
								+ s.charAt(i) + "- Counter " + counter);
						break;
					}
				}
			}
			if (counter == 1) {
				System.out.println(s.charAt(i) + " is Unique");
				sb.append(s.charAt(i));
				sb.append(",");
				break; // first uniqe character
			}
			counter = 0;
		}
		System.out.println("Unique Characters are "
				+ sb.toString().substring(0, (sb.length() - 1)));

	}

	public static String calculateRun(String s) {
		char runChar = s.charAt(0);
		int maxRun = 1;
		int currentRun = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				if (currentRun > maxRun) {
					runChar = s.charAt(i - 1);
					maxRun = currentRun;
				}
				currentRun = 1;
			} else {
				currentRun++;
			}

			if (currentRun > maxRun) {
				runChar = s.charAt(i - 1);
				maxRun = currentRun;
			}
		}

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < maxRun; i++) {
			res.append(runChar);
		}
		return res.toString();
	}

}
