package xtras;

import java.util.Arrays;

public class MergeSortURecursion {
	private int[] theArray;

	public MergeSortURecursion(int size) {
		theArray = new int[size];
	}

	public void populateArray() {
		for (int j = 0; j < theArray.length; j++) {
			theArray[j] = (int) (Math.random() * 10 + 10);
		}
	}
	
	public void displayArray(){
		for (int i = 0; i < theArray.length; i++) {
			System.out.println("| "+i+" || "+theArray[i]+" |");
		}
	}
	

	public static int[] mergeSort(int[] inArray) {

		int size = inArray.length;
		int mid = size / 2;
		int[] firstHalf = new int[mid];
		int[] secondHalf = new int[size - mid];
		
		//System.out.println(firstHalf.length+" : "+secondHalf.length+" : "+mid+" : "+size);
		
		if (size <= 1) {
			return inArray;
		} else {
			for (int i = 0; i < mid; i++) {
				firstHalf[i] = inArray[i];
			}
			System.out.print(Arrays.toString(firstHalf));
			for (int j = 0 ; j < secondHalf.length; j++) {
				secondHalf[j] = inArray[mid+j];
			}
			System.out.println(Arrays.toString(secondHalf));
			return merge(mergeSort(firstHalf),mergeSort(secondHalf));
			
		}
	}

	private static int[] merge(int[] fHalf, int[] sHalf) {
		int retArray[] = new int[fHalf.length+sHalf.length];
		System.out.println(Arrays.toString(fHalf)+":"+Arrays.toString(sHalf));
		
		for (int i = 0; i < fHalf.length; i++) {
			retArray[i] = fHalf[i];
		}
		for (int i = 0; i < sHalf.length; i++) {
			retArray[fHalf.length+i] = sHalf[i];
		}
		
		return retArray;
		
	}

	public static void main(String args[]) {
		MergeSortURecursion mSort = new MergeSortURecursion(10);
		mSort.populateArray();
		System.out.println(Arrays.toString(mSort.theArray));
		System.out.println(Arrays.toString(mSort.mergeSort(mSort.theArray)));

	}

}
