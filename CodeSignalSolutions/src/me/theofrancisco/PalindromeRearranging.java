package me.theofrancisco;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
	static boolean palindromeRearranging(String inputString) {
		//if the string length is odd the is false
		//if (inputString.length()%2!=0) return false;
		//make map with every character
		Map<Character,Integer> chars = new HashMap<>();
		for (char a:inputString.toCharArray()) {
			if (chars.containsKey(a)) {
				int c = chars.get(a)+1;
				chars.replace(a, c);
			}else {
				chars.put(a, 1);
			}
		}
		//check if the counted chars  are odds
		//only one could be even
		boolean oneEven=false;
		for (Character c:chars.keySet()) {
			if (chars.get(c)%2!=0) {
				if (!oneEven) oneEven=true;
				else return false;
			}
		}
		return true;
	}
}
