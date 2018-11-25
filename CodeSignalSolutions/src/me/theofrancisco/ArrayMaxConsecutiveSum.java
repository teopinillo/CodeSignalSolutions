package me.theofrancisco;

public class ArrayMaxConsecutiveSum {

	public static int arrayMaxConsecutiveSum(int[] inputArray, int k) {	    
	    int s=0;
	    int max=0;
	    
	    for (int n=0;n<inputArray.length-k+1;n++){
	        
	        for (int i=n; i<n+k;i++){
	            s+=inputArray[i];
	        }
	        if (s>max) max=s;
	        s=0;
	   }
	    return max;
	}
}
