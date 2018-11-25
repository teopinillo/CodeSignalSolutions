package me.theofrancisco;

/*https://app.codesignal.com/arcade/intro/level-6/PWLT8GBrv9xXy4Dui
Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).

Example

For inputString = "crazy", the output should be
alphabeticShift(inputString) = "dsbaz".*/
public class AlphabeticShift {
	String alphabeticShift(String inputString) {				
		char[] l= inputString.toCharArray();
		int[]  s = new int[l.length];
		 for (int i=0;i<l.length;i++) {
			 if ((l[i]+1)>'z') s[i]='a'; else s[i]=l[i]+1;	
			 l[i]= (char)s[i];
		 }
		 return new StringBuilder().append(l).toString();
	}
}
