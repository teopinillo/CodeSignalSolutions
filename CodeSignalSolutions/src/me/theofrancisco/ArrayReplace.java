package me.theofrancisco;

/*https://app.codesignal.com/arcade/intro/level-6/mCkmbxdMsMTjBc3Bm
Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Example

For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].*/

public class ArrayReplace {
	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		for (int i=0;i<inputArray.length;i++) {
			if (inputArray[i]==elemToReplace) inputArray[i]=substitutionElem;
		}
		return inputArray;
	}
}
