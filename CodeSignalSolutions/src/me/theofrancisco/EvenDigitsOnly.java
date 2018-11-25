package me.theofrancisco;

/*https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW
Check if all digits of the given integer are even.

Example

    For n = 248622, the output should be
    evenDigitsOnly(n) = true;
    For n = 642386, the output should be
    evenDigitsOnly(n) = false.*/

public class EvenDigitsOnly {
	static boolean evenDigitsOnly(int n) {		
		while (n>0) {
			if ((n % 2)!=0) return false;
			n = n/10;
			//System.out.println(n+","+d);
		}
		return true;
	}

}
