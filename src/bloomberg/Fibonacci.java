package bloomberg;

import java.util.Arrays;

class FibNumGenerator {

	public void generateFibNum(int num) {
		int prevNum = 0;
		int currentNum = 1;
		while (currentNum < num) {
			System.out.println(prevNum);
			int temp = currentNum;
			currentNum = prevNum + currentNum;
			prevNum = temp;
		}
		System.out.println(prevNum);
		System.out.println();
	}

	public void generateFibNumUisingArray(int num) {
		int[] fibNum = new int[num + 1];
		fibNum[0] = 0;
		fibNum[1] = 1;
		for (int i = 2; i < fibNum.length; i++) {
			fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
		}
		System.out.println(Arrays.toString(fibNum));
		System.out.println();
	}

}

public class Fibonacci {

	public static void main(String args[]) {
		FibNumGenerator fGen = new FibNumGenerator();
		fGen.generateFibNum(4);
		fGen.generateFibNumUisingArray(4);
	}

}