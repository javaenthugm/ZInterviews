package goldmansaachs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class GoldManSaachsApp {

	public static void main(String args[]) {
		
		//isAnagram("malayalasm");
		
		int number = 1000000000;
		for(int i=1;i<number;i++){
			System.out.println(fibonaaciNumbers(i)+" ");
		}
		//reverseString();
		// phoneNumbers();
		// countWords();

	}
	
	private static void isAnagram(String s){
		
		StringBuilder rev = new StringBuilder(s);
		rev = rev.reverse();
		System.out.println("Reverse :"+rev);
		if(s.equalsIgnoreCase(rev.toString()))
			System.out.println("Anagram: "+s);
		else
			System.out.println("Not anagram");
			
	}
	
	private static int fibonaaciNumbers(int n){
		int returnNumber = 1;
		if(n<=2)
			returnNumber= 1;
		else
			returnNumber= fibonaaciNumbers(n-1)+fibonaaciNumbers(n-2);
		//System.out.println(returnNumber);
		return returnNumber;
	}

	private static void reverseString() {
		String input = "tac";

		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void phoneNumbers() {

		Map<String, String> num = new HashMap<String, String>();
		num.put("ABc", "123");
		num.put("bcd", "345");
		num.put("cda", "523");
		num.put("abc", "678");

		for (String key : num.keySet()) {
			System.out.println(key + "-" + num.get(key));
		}
	}

	private static void countWords() {

		String[] str = { "cat", "CAT", "Dog", "Dog", "Cow", "Cow", "Tiger" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String st : str) {
			if (map.containsKey(st.toLowerCase())) {
				map.put(st.toLowerCase(), map.get(st.toLowerCase()) + 1);
			} else {
				map.put(st.toLowerCase(), 1);
			}
		}

		for (String word : map.keySet()) {
			System.out.println(word + "-" + map.get(word));
		}

	}

}
