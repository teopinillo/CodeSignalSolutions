package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg/comments

public class ArrayChange {
	
	public int arrayChange(int[] inputArray) {
		int c = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			while (inputArray[i+1] <= inputArray[i]) {
				inputArray[i + 1]++;
				c++;
			}
		}
		return c;
	}
}
