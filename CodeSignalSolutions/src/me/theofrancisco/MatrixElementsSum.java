package me.theofrancisco;
//https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr
//After they became famous, the CodeBots all decided to move to a new building and live together. 
//The building is represented by a rectangular matrix of rooms. Each cell in the matrix contains
//an integer that represents the price of the room. Some rooms are free (their cost is 0), 
//but that's probably because they are haunted, so all the bots are afraid of them. 
//That is why any room that is free or is located anywhere below a free room in the same column 
//is not considered suitable for the bots to live in.
//
//Help the bots calculate the total price of all the rooms that are suitable for them.

public class MatrixElementsSum {

	public static int matrixElementsSum(int[][] matrix) {
		int lx = matrix.length;
		int ly = matrix[0].length;
		int r=0;
		for ( int y=0;y<ly;y++) {
			for (int x=0;x<lx;x++) {
				if (matrix[x][y]!=0) 
					r += matrix[x][y];else break;				
			}
		}
		return r;
	}
}
