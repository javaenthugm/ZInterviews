/**
 * 
 */
package xtras;

import java.util.Arrays;

/**
 * @author gopi
 *
 */
public class TheStringTest {
	
	public static void main(String args[]){
		TheStringTest test = new TheStringTest();
		
	    // Is Unique Char Test
		//System.out.println(test.isUniqueChars2("hello wrd")); 
		
		String[] words = {"h","e","l","l","o"," ","w","o","r","l","d"};
		//System.out.println(test.makeSentence(words));
		
		char[] str = {'a','b','a','b','c'};
		//removeDuplicates(str);
		//removeDuplicatesEff(str);
		
		int i = ((3+1)/3)*6;
		System.out.println(i);
		
	}
   	
 private static void removeDuplicatesEff(char[] str) {
		if(str == null) return;
		int len = str.length;
		if(len<2) return;
		
		boolean[] hit = new boolean[256];
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 0; i < len; ++i) {
			
			if(!hit[str[i]]){
				str[tail]=str[i];
				System.out.println(Arrays.toString(str));
				++tail;
				hit[str[i]]=true;
			}
			
		}
		str[tail]='-';
		System.out.println(Arrays.toString(str));
		System.out.println("Length-"+str.length);
		
	}

private static void removeDuplicates(char[] str) {
		//System.out.println(Arrays.toString(str));
		if(str==null) return;
		int len = str.length;
		if(len < 2) return;
		
		int tail=1;
		for (int i = 1; i < len; ++i) {
			int j;
			for ( j= 0; j < tail;++j) {
				//System.out.println(str[i]+":"+str[j]);
				//System.out.println(Arrays.toString(str));
				if(str[i] == str[j])
					break;
				
			}
			if(j==tail){
				str[tail] = str[i];
				++tail;
			}
		}
		//System.out.println(tail+":"+len);
		//System.out.println(Arrays.toString(str));
		if(tail<len)
			str[tail]=0;
		System.out.println(Arrays.toString(str));
		System.out.println("Length-"+str.length);
		
	}

/**
  * Implement an algoritham to determine 
  * if a string has all unique characters. 
  *  
  * @param str
  * @return boolean
  */
private static boolean isUniqueChars2(String str){
		
		boolean char_set[]  = new boolean[256];
		
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	private String makeSentence(String[] words){
		StringBuffer sentence = new StringBuffer();
		for (String w:words)sentence.append(w);
		return sentence.toString();
	}
	
	

}
