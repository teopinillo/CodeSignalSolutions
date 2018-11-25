package me.theofrancisco;

public class BishopAndPawn {
	
	public static boolean bishopAndPawn(String bishop, String pawn) {
	    boolean[][] board = new boolean[8][8];
	    int x=bishop.charAt(0)-'a';
	    int y= Integer.parseInt(bishop.substring(1))-1;
	    board[x][y]=true;
	    int x0 = x = pawn.charAt(0)-'a';
	    int y0 = y = Integer.parseInt(pawn.substring(1))-1;
	    int xd=1;
	    int yd=1;
	    int m=0;
	    while(true)
	    try {
	    	while (!board[x][y]) {
	    		System.out.println(x+", "+y);
	    		x+=(1)*xd;
	    		y+=(1)*yd;
	    	}
	    	return true;
	    }catch (IndexOutOfBoundsException e) {
	    	
	    	x=x0;
	    	y=y0;
	    	switch (m++) {
	    	 case 0:xd=-1;break;
	    	 case 1:yd=-1;break;
	    	 case 2:xd=1;break;
	    	 default: return false;
	    	}
	    	System.out.println("cambio de direcion = "+ (m-1));
	    }
	}
	
}
