package me.theofrancisco;

import java.util.HashSet;

public class Sudoku {
	public static boolean sudoku(int[][] grid) {
		class Helper{
			boolean isValid (int[][] grid,int y, int x){
				HashSet<Integer> n = new HashSet<>();
				n.add(grid[y][x]);
				n.add(grid[y][x+1]);
				n.add(grid[y][x+2]);
				n.add(grid[y+1][x]);
				n.add(grid[y+1][x+1]);
				n.add(grid[y+1][x+2]);
				n.add(grid[y+2][x]);
				n.add(grid[y+2][x+1]);
				n.add(grid[y+2][x+2]);
				System.out.printf ("y:%d x:%d set:%d%n",y,x,n.size());
				return n.size()==9;
			}			
		}
		Helper helper = new Helper();
		HashSet<Integer> nums = new HashSet<>();
		// check every row
		for (int r = 0; r < 9; r++) {
			nums.clear();
			for (int c = 0; c < 9; c++) {
				nums.add(grid[r][c]);
			}
			if (nums.size()!=9) return false;
		}
		// check every col
				for (int c = 0; c < 9; c++) {
					nums.clear();
					for (int r = 0; r < 9; r++) {
						nums.add(grid[r][c]);
					}
					if (nums.size()!=9) return false;
				}
		
		// check every subset
		for (int r = 0; r < 9; r += 3)
			for (int c = 0; c < 9; c += 3) {
				if (!helper.isValid(grid, r, c))
					return false;
			}
		return true;
	}

}
