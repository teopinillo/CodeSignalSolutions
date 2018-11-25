package me.theofrancisco;

import java.util.Arrays;

//https://app.codesignal.com/arcade/intro/level-8/rRGGbTtwZe2mA8Wov
/*Find the leftmost digit that occurs in a given string.

Example

    For inputString = "var_1__Int", the output should be
    firstDigit(inputString) = '1';
    For inputString = "q2q-q", the output should be
    firstDigit(inputString) = '2';
    For inputString = "0ss", the output should be
    firstDigit(inputString) = '0'.*/

public class FirstDigit {
	char firstDigit(String inputString) {
		
		Character[] num = {'0','1','2','3','4','5','6','7','8','9'};
		java.util.List<Character> digits = Arrays.asList(num);
		for (char c:inputString.toCharArray()) {
			if (digits.contains(c)) return c;
		}
		return 'e';
	}
}
