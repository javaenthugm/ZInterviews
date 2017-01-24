package xtras;

public class Recursion {

	public static void main(String args[]) {
		//System.out.print(getTriangularNumber(6));
		getTriangularNumber(6);
		System.out.println("----------");
		System.out.println(getFactorial(1));
	}

	public static int getTriangularNumber(int num) {
		if (num == 1) {
			return 1;
		} else {
			return (num + getTriangularNumber(num - 1));
		}
	}
	
	public static int getFactorial(int num){
		if(num==1){
			return 1;
		}else{
			return (num*getFactorial(num-1));
		}
	}

}
