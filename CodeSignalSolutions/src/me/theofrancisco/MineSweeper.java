package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM
//In the popular Minesweeper game you have a board with some mines and those cells
//that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells.
//Starting off with some arrangement of mines we want to create a Minesweeper game setup.
public class MineSweeper {
	static int[][] minesweeper(boolean[][] matrix) {
		class Helper {
			int countMines (int x, int y, boolean[][]matrix) {
				int s=0;				
				//right column
				try {if (matrix[x+1][y+1]) s++;} catch (Exception e) {};
				try {if (matrix[x-1][y+1]) s++;} catch (Exception e) {};
				try {if (matrix[x-0][y+1]) s++;} catch (Exception e) {};
				
				//left column
				try {if (matrix[x+1][y-1]) s++;} catch (Exception e) {};				
				try {if (matrix[x-1][y-1]) s++;} catch (Exception e) {};				
				try {if (matrix[x-0][y-1]) s++;} catch (Exception e) {};
				
				//center
				try {if (matrix[x-1][y]) s++;} catch (Exception e) {};
				try {if (matrix[x+1][y]) s++;} catch (Exception e) {};				
				
				return s;
			}
		}
		
		Helper helper = new Helper();
		int[][] flags = new int [matrix.length][matrix[0].length];
		 for (int x=0;x<matrix.length;x++) {
			 for (int y=0;y<matrix[0].length;y++) {
				 flags[x][y]=helper.countMines(x,y, matrix);
			 }
		 }
		return flags;
	}
}
