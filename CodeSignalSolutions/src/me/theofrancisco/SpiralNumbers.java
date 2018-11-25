package me.theofrancisco;

//Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, 
//starting from top-left and in clockwise direction.

public class SpiralNumbers {

	public static int[][] spiralNumbers(int n) {
		
		int nn=n*n;
		int direction = 0; //0 right, 1 down, 2 left, 3 up 
		int [][] board = new int [n][n];
		
		 int x=0, y=0;
		 board[0][0]=1;
		 int c=2;
		 while (c<=nn) {
			 try {
				 switch (direction) {
				 case 0: x=x+1;break;
				 case 1: y=y+1;break;
				 case 2: x=x-1;break;
				 case 3: y=y-1;
				 }
				 if ((board[y][x])==0) board[y][x]=c++;
				 else {
					 //if the next if already visited, then move backward buy 1
					 //and change direction
					 switch (direction) {
					 case 0: x=x-1;break; //right
					 case 1: y=y-1;break;//down
					 case 2: x=x+1;break;//left
					 case 3: y=y+1; //up
					 }
					 if (direction==3) direction=0; else direction++;
				 }
			 }catch (IndexOutOfBoundsException e){
				//if the next if already visited, then move backward buy 1
				 //and change direction
				 switch (direction) {
				 case 0: x=x-1;break; //right
				 case 1: y=y-1;break;//down
				 case 2: x=x+1;break;//left
				 case 3: y=y+1; //up
				 }
				 if (direction==3) direction=0; else direction++;
			 }
		 }
		 return board;
	}
	
}
