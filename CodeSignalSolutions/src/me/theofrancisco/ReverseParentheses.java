package me.theofrancisco;
import java.util.LinkedList;

//https://app.codesignal.com/arcade/intro/level-3/3o6QFqgYSontKsyk4
//You have a string s that consists of English letters, punctuation marks,
//whitespace characters, and brackets. It is guaranteed that the parentheses
//in s form a regular bracket sequence.
//
//Your task is to reverse the strings contained in each pair of matching parentheses,
//starting from the innermost pair. The results string should not contain any parentheses.
//
//Example
//
//For string s = "a(bc)de", the output should be
//reverseParentheses(s) = "acbde"

public class ReverseParentheses {

	// should be called like this, abc) without the start parenthesis

	public String reverseParentheses(String s) {
		char[] a = s.toCharArray();
		int i = 0;
		int st = 0;
		LinkedList<Character> stack = new LinkedList<>();
		boolean startover;
		while (i < a.length) {
			startover = false;
			if (a[i] == '(') {
				// start reversing char
				st = i;
				i++; // ignore (
				while (a[i] != ')') {
					if (a[i] == '(') {
						stack.clear();
						startover = true;
						break;
					} else {
						stack.push(a[i]);
						i++; // next
					}
				}
				if (!startover) {
					int end = i; // here is )
					i = st; // write over the (
					while (!stack.isEmpty()) {
						a[i++] = stack.pop();
					}
					StringBuilder sb = new StringBuilder(new String(a));
					sb.deleteCharAt(end - 1);
					sb.deleteCharAt(end - 1);
					a = sb.toString().toCharArray();
					System.out.println(sb);
					i = 0;
				}
			} else {
				i++;
			}
		}
		return new String(a);
	}
}
