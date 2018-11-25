package me.theofrancisco;

public class DigitsProduct {

	public static int digitsProduct(int product) {
		 int test=1;
		 int min=-1;
		  while (test<9999) {
			  String n = Integer.toString(test);
			  if (!n.contains("0")&&(!n.contains("1"))) {				  
				  int prod=1;
				  for (int i =n.length()-1;i>=0;i-- ) 
					  prod*=Integer.parseInt(n.substring(i,i+1));
					
				  if (prod==product) {
					  System.out.printf("test %d prod %d min %d%n",test,prod,min);
					  if (min==-1) 
							 min=test;
						 else 
							 if (test<min)min=test;						 
				  }
			  }
			  test++;
		  }
		 return min;
	}
}
