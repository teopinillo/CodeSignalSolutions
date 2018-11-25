package me.theofrancisco;

import java.util.HashSet;

public class DifferentSquare {
	int differentSquares(int[][] matrix) {
		int h=matrix.length;
		int w=matrix[0].length;
		HashSet<Integer> matrixSet = new HashSet<>();
		 for (int i=0;i<h;i++) {
			 for (int j=0;j<w;j++) {
				 try {
					int a = matrix[i][j] *1000;
					int b = matrix[i+1][j]*100;
					int c = matrix[i][j+1]*10;
					int d = matrix[i+1][j+1];
					matrixSet.add(a+b+c+d);
				 }catch (IndexOutOfBoundsException e){
					 break;
				 }
			 }
		 }
		 return matrixSet.size();
	}
}
