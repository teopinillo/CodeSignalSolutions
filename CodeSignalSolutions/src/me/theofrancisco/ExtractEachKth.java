package me.theofrancisco;

/*Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, 
the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
https://app.codesignal.com/arcade/intro/level-8/3AgqcKrxbwFhd3Z3R
*/

public class ExtractEachKth {
	public static int[] extractEachKth(int[] inputArray, int k) {
		int l = inputArray.length - (inputArray.length/k);
		int[] r = new int[l];
		int c=1;
		int p =0;
		for (int i=0;i<inputArray.length;i++) {
			if (c!=k) {
				r[p++]=inputArray[i];
				c++;
			}else {
				c=1;
			}
		}
		return r;
	}
}
