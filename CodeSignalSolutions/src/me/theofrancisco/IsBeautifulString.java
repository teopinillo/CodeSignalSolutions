package me.theofrancisco;

public class IsBeautifulString {

	boolean isBeautifulString(String inputString) {
	    int[] c = new int[27];
	    for (char ch :inputString.toCharArray())
	        c[ch-'a']++;
	    for (int i=0;i<26;i++){
	        if (c[i+1]>c[i]) return false;
	    }
	    return true;
	}

	
}
