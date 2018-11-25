package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9
//
//Several people are standing in a row and need to be divided into two teams. 
//The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
//
//You are given an array of positive integers - the weights of the people. 
//Return an array of two integers, where the first element is the total weight of team 1, 
//and the second element is the total weight of team 2 after the division is complete.
//
//Example
//
//For a = [50, 60, 60, 45, 70], the output should be
//alternatingSums(a) = [180, 105].
public class AlternatingSums {
	int[] alternatingSums(int[] a) {
		int wa,wb,i;
		i=wa=wb=0;
		 while (i<a.length) {
			wa += a[i++];
			if (i<a.length) {
				wb +=a[i++];
			}else
				break;
		 }
		int r[] = {wa,wb};
		return r; 
	}
}
