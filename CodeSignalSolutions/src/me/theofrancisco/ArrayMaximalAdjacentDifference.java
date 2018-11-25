package me.theofrancisco;

//me.theofrancisco.ArrayMaximalAdjacentDifference
//
//Given an array of integers, find the maximal absolute difference 
//between any two of its adjacent elements.
//
//Example
//
//For inputArray = [2, 4, 1, 0], the output should be
//arrayMaximalAdjacentDifference(inputArray) = 3.

public class ArrayMaximalAdjacentDifference {
	static int arrayMaximalAdjacentDifference(int[] inputArray) {
	 int maxD=0;
	  for (int i=0;i<inputArray.length-1;i++) {
		  int d = Math.abs(inputArray[i]-inputArray[i+1]);
		  if (d>maxD) maxD=d;
	  }
	  return maxD;
	}
}
