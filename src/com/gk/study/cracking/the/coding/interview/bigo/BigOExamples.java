package com.gk.study.cracking.the.coding.interview.bigo;

/**
 * @author javaenthu
 *
 */
public class BigOExamples {
	
	public static void main (String args[]){
		//isPrime
		System.out.println(isPrime(4));
		
	}
	
	private static boolean isPrime(int n){
		
		for(int i=2;i <= Math.sqrt(n);i++){
			System.out.println(i);
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
		
	}

}
