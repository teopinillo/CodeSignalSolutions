package me.theofrancisco;

public class DeleteDigit {
	public static int deleteDigit(int n) {
		String numb = Integer.toString(n);
		int max=0;
		for (int i=0;i<numb.length();i++) {
			String nn = numb.substring(0,i)+numb.substring(i+1);
			if (Integer.parseInt(nn)>max) max = Integer.parseInt(nn);
		}
		return max;
	}
}
