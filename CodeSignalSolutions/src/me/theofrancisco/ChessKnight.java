package me.theofrancisco;

public class ChessKnight {
	
	int chessKnight(String cell) {
		int[] jumpx = {-2,-1,1,2, 2, 1,-1,-2};
	    int[] jumpy = { 1, 2,2,1,-1,-2,-2,-1};
	    int x = cell.charAt(0)-'a';
	    int y = Integer.parseInt(cell.substring(1))-1;	   
	    int r=0;
	    boolean [][] board = new boolean[8][8];
	    for (int i=0;i<8;i++) {
	    	try {
	    		r++;
	    		boolean b=board[x+jumpx[i]][y+jumpy[i]];
	    	}catch (IndexOutOfBoundsException e) {
	    		r--;
	    	}
	    }
	    return r;
	}
	
}
