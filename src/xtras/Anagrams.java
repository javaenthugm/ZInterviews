package xtras;

public class Anagrams {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="listen",t="silent";

		System.out.println(isAnagram(s, t));

	}

	private static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars=0;
		int num_completed_t=0;
		
		char[] s_array=s.toCharArray();
		
		for(char c : s_array){
			System.out.println(c+":"+letters[c]+":"+(int)c);
			if(letters[c]==0){
				++num_unique_chars;
			}else{
				System.out.println(c+":"+letters[c]+":"+(int)c);
			}
			++letters[c];
			System.out.println(c+":"+letters[c]+":"+(int)c);
			System.out.println(num_unique_chars);
		}
		
		for(int i=0;i<t.length();++i){
			int c = (int)t.charAt(i);
			
			if(letters[c]==0){
				return false;
			}
			--letters[c];
			if(letters[c]==0){
				++num_completed_t;
				System.out.println(num_unique_chars+":"+num_completed_t);
				if(num_completed_t==num_unique_chars){
					return i==t.length()-1;
				}
			}
		}
		
		
		return false;
		
	}

}
