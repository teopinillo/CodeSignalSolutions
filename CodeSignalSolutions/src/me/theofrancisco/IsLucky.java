package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ
//Ticket numbers usually consist of an even number of digits. 
//A ticket number is considered lucky if the sum of the first
// half of the digits is equal to the sum of the second half.
//
//Given a ticket number n, determine if it's lucky or not.
//
//Example
//
//    For n = 1230, the output should be
//    isLucky(n) = true;
//    For n = 239017, the output should be
//    isLucky(n) = false.
public class IsLucky {

	static boolean isLucky(int n) {
		String digits = Integer.toString(n);
		char[] digit = digits.toCharArray();
		
		int m = digits.length() / 2;
		int left = 0;
		int right = 0;
		
		for (int i=0;i<digits.length();i++) {
			if (i<m) {
				left += Integer.parseInt(Character.toString(digit[i]));
			}else {
				right += Integer.parseInt(Character.toString(digit[i]));
			}
		}		
		return left==right;
	}
}
