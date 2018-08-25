package me.theofrancisco;

import java.util.ArrayList;

public class AlmostEncreasingSequence {

	static boolean almostIncreasingSequence(int[] sequence) {
		int c=0;
		 for (int i=0; i<sequence.length-1;i++) {
			 if (sequence[i]>=sequence[i+1]) c++;
			 if ( (i+2<sequence.length) && (sequence[i]>=sequence[i+2])) c++;
			if (c>2) return false; 
		 }
		return true;
	}

	public static void main(String[] args) {
		int[] test = { 10, 1, 2 }; // ok
		int[] test2 = { 1, 10, 2 };// ok
		int[] test3 = { 1, 2, 10 };// ok
		int[] test4 = { 1, 3,2,1 };// false
		int[] test5 = { 1, 1 };// no ok
		int[] test6 = { 1, 5, 67, 98, 3 };// ok
		// System.out.println(almostIncreasingSequence(test3));
		// System.out.println(almostIncreasingSequence(test4));
		// System.out.println(almostIncreasingSequence(test5));
		System.out.println(almostIncreasingSequence(test4));
	}

}
