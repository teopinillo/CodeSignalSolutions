package me.theofrancisco;


public class DigitDegree {
	
	public static int digitDegree(int n) {
		int c=0;
		while (n>=10) {			
			String s = Integer.toString(n);
			n=0;
			for (char ch:s.toCharArray()) {
				n+= Integer.parseInt(Character.toString(ch));				
			}
			c++;
		}
		return c;
		
	}
	
	
}
