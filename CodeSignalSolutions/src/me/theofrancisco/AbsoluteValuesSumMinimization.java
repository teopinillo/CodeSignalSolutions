package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq/description
//Given a sorted array of integers a, find an integer x from a such that the value of

/*abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)

is the smallest possible (here abs denotes the absolute value).
If there are several possible answers, output the smallest one.

Example

For a = [2, 4, 7], the output should be
absoluteValuesSumMinimization(a) = 4.*/

public class AbsoluteValuesSumMinimization {
	static int absoluteValuesSumMinimization(int[] a) {
      int s=0;
      int r=1;
      int min=Integer.MAX_VALUE;
	  for (int t:a) {
		  for (int n:a) {
			  s += Math.abs(n-t);
		  }
		  if (s<min) {min=s;r=t;}
		  System.out.println("t: "+t+" = "+s);
		  s=0;
	  }
	  System.out.println("r: "+r);
	  return r;
	}
}
