package me.theofrancisco;

import java.util.HashMap;

//Given two strings, find the number of common characters between them.
//
//Example
//
//For s1 = "aabcc" and s2 = "adcaa", the output should be
//commonCharacterCount(s1, s2) = 3.
//
//Strings have 3 common characters - 2 "a"s and 1 "c".
//
//Input/Output
//
//    [execution time limit] 3 seconds (java)
//
//    [input] string s1
public class CommonCharacterCount {
	
	static  int commonCharacterCount(String s1, String s2) {
		HashMap <Character,Integer> map_a = new HashMap<>();
		HashMap <Character,Integer> map_b = new HashMap<>();
		String small = s1;
		String large = s2;
		int a,b,r=0;
		 if (s1.length()>s2.length()) {
			 small=s2;
			 large=s1;
		 }
		 for (char c:large.toCharArray()) {
			 if (map_a.containsKey(c)) map_a.replace(c, map_a.get(c)+1);
			 else map_a.put(c, 1);
		 }
		 for (char c:small.toCharArray()) {
			 if (map_b.containsKey(c)) map_b.replace(c, map_b.get(c)+1);
			 else map_b.put(c, 1);
		 }
		 for (Character c: map_a.keySet()) {
			 if (map_b.containsKey(c)) {
				 a=map_a.get(c);
				 b=map_b.get(c);
				 if (a<b) r+=a;else
					 r+=b;
			 }
		 }
		 return r;
		 
	}
	
}
