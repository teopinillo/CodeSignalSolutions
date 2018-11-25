package me.theofrancisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuildPalindrome {

	
	public static String buildPalindrome(String st) {
		class Helper{
			boolean isPalindrome (String s){
				StringBuilder sb = new StringBuilder(s);
				sb.reverse();
				return s.equals(sb.toString());
			}
		}
		Helper helper = new Helper();
		//find the part that is palindrome
	    int s=0;
	    String t = st;
	    while (!helper.isPalindrome(t)) {
	    	s++;
	    	//if the index is in the last char, then exits
	    	if (s==st.length()-1) break;
	    	t=st.substring(s);	    	
	    }
	    t=st;
	    for (int i=s-1;i>=0;i--) {
	    	t=t.concat(st.substring(i,i+1));
	    }
		return t;
	}
	
	int electionsWinners(int[] votes, int k) {

	    for (int i=0;i<votes.length;i++)
	        votes[i]+=k;
	    ArrayList<Integer> v = new ArrayList<>();
	     for (int i:votes) v.add(i);
	    Collections.sort(v);
	    Collections.reverse(v);
	    int c=1,i=1;
	    int m=v.get(0);
	    while (m!=v.get(i++))c++;
	    return c;
	}
	
}
