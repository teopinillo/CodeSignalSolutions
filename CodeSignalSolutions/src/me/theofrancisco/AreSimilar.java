package me.theofrancisco;

import java.util.ArrayList;
import java.util.Collections;

/*https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP/description
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

    For a = [1, 2, 3] and b = [1, 2, 3], the output should be
    areSimilar(a, b) = true.

    The arrays are equal, no need to swap any elements.

    For a = [1, 2, 3] and b = [2, 1, 3], the output should be
    areSimilar(a, b) = true.

    We can obtain b from a by swapping 2 and 1 in b.

    For a = [1, 2, 2] and b = [2, 1, 1], the output should be
    areSimilar(a, b) = false.

    Any swap of any two elements either in a or in b won't make a and b equal.
*/

public class AreSimilar {
	boolean areSimilar(int[] a, int[] b) {
	    //Arrays must be the same length, if not return false.  
	    if(a.length!=b.length) return false;
	    //b)There can only be a maximum of 2 elements that are not equal when comparing the arrays .
	    int diff=0;
	      for (int i=0;i<a.length;i++){
	        if (a[i]!=b[i]){
	          diff++;
	          if (diff>2) return false;
	        }
	      }
	    ArrayList<Integer> na = new  ArrayList<>();
	    ArrayList<Integer> nb = new ArrayList<>();
	     int ta=0;
	     int tb = 0;
		   for ( int n:a) {
	       na.add(n);
	       ta+=n;
	     }
		for ( int n:b) {
	       nb.add(n);
	       tb+=n;
	     } 
		    Collections.sort(na);
		    Collections.sort(nb);
	      //All elements of one array must exist in the other array.
		    if (!na.equals(nb)) return false;
	      // Array sum of elements must match as well (Solved problematic hidden test 19/20)
	      if (ta!=tb)return false;
	      return true;
	}
}
