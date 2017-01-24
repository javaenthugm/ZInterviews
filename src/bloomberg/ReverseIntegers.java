package bloomberg;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 *Write a method that takes an int as input and outputs 
 *an int with the digits of the input in reverse, i.e. 12345 -> 54321. 
 */

public class ReverseIntegers {

	public static void main(String args[]) {

		//usingLogic(12454);
		//usingStack(534);
		//usingStringBuilder(124);
		usingCharArry(1234);
	}

	public static void usingLogic(int num) {
		
		int result = 0;
		while (num != 0) {
			result = result * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(result);
	}

	
	public static void usingCharArry(int num){
		String strNum = String.valueOf(num);
		char[] charArr = strNum.toCharArray();
		
		for(int i=(charArr.length-1); i>=0;i--){
			System.out.println(charArr[i]);
		}
		
	}
	

	public static void usingStringBuilder(int num){
		String numStr = String.valueOf(num);
		System.out.println(numStr.length());
		StringBuilder sb = new StringBuilder();
		for(int i=numStr.length();i>0;i--){
			sb.append(numStr.substring(i-1, i));
		}
		System.out.println(Integer.parseInt(sb.toString()));
	}
	
	
	
	public static void usingStack(Integer num) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(6);
		System.out.println(stack.element());
		StringBuffer sb = new StringBuffer();
		while (!stack.isEmpty()) {
			sb.append(stack.pollFirst());
		}
		System.out.println(sb.toString());
	}
}
