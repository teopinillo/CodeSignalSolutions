package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-5/XC9Q2DhRRKQrfLhb5

/*You are given an array of integers representing coordinates of
 *  obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right.
You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example
For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.*/

public class AvoidObstacles {

	static int avoidObstacles(int[] inputArray) {
		int sum = 1;

		for(int i = 0; i < inputArray.length; i++)
		{
		    if(inputArray[i] % sum == 0)
		    {
		        i = -1;
		        sum++;
		    }
		}
		return sum;
	}
	
}
