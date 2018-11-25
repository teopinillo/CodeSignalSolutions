package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi
//Given two cells on the standard chess board, determine whether they have the same color or not.
//
//Example
//
//    For cell1 = "A1" and cell2 = "C3", the output should be
//    chessBoardCellColor(cell1, cell2) = true.
public class ChessBoardCellColor {
	static boolean chessBoardCellColor(String cell1, String cell2) {
		class Helper {
			int getColor (String cell){
				
				int x = cell.charAt(0)-'A';
				int y = cell.charAt(1)-1;
				int c;
				if ((x%2)==0)  {
					if ((y%2)==0) c=1;else c=0;
				}else {
					if (((y%2)==0)) c=0;else c=1;					
			    }
				System.out.println(cell+" c: "+c);
				return c;

			}
		}
	 Helper helper = new Helper();		
	 return helper.getColor(cell1)==helper.getColor(cell2);	
	}
	
	static int depositProfit(int deposit, int rate, int threshold) {
	    int y=0;
	    double r=rate/100.0;
	    float d=deposit;
	    while (d<threshold){
	        d += d*r;
	        y++;
	    }
	    return y;
	}
	
}
