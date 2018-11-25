package me.theofrancisco;
//https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
//Given an array of strings, return another array containing all of its longest strings.
//
//Example
//
//For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
//allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
//
//Input/Output
//
//  [execution time limit] 3 seconds (java)
//
//  [input] array.string inputArray
//
//  A non-empty array.
//
//  Guaranteed constraints:
//  1 ≤ inputArray.length ≤ 10,
//  1 ≤ inputArray[i].length ≤ 10.
//
//  [output] array.string
//      Array of the longest strings, stored in the same order as in the inputArray.
import java.util.ArrayList;

public class AllLongestStrings {
	String[] allLongestStrings(String[] inputArray) {
		int maxL=0;
		 for ( String s:inputArray) {
			if (s.length()>maxL) maxL= s.length();
		  }
		 ArrayList<String> list = new ArrayList<>();
		 for ( String s:inputArray) {
				if (s.length()==maxL) list.add(s);
		}
               String[] result = new String[list.size()];
		return  list.toArray(result);
	}
}

