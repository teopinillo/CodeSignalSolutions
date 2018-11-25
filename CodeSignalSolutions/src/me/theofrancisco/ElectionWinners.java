package me.theofrancisco;
 
import java.util.ArrayList;
import java.util.Collections;

public class ElectionWinners {

	public static int electionsWinners(int[] votes, int k) {
	    int max=0;
		for (int i = 0; i < votes.length; i++){
	        if (votes[i]>max) max=votes[i];
	        votes[i] += k;
	    }
		
			ArrayList<Integer> v = new ArrayList<>();
			for (int i : votes)
				v.add(i);
			Collections.sort(v);
			Collections.reverse(v);
			
			int c = 0, i = 0;
			//in case no voter left, then just find the winner
			if (k==0) {
				while ((i<votes.length) && (v.get(i++)==max))
					c++;
				 if (c>1) return 0;
				
			}else {
				while ((i<votes.length) && (v.get(i++)>max))
					c++;
			}
			return c;
	}
}
