package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN
//Given a rectangular matrix of characters, add a border of asterisks(*) to it.
//
//Example
//
//For
//
//picture = ["abc",
//           "ded"]
//
//the output should be
//
//addBorder(picture) = ["*****",
//                      "*abc*",
//                      "*ded*",
//                      "*****"]

public class AddBorder {
	static String[] addBorder(String[] picture) {
		int w, h;
		w = picture[0].length();
		h = picture.length;
		String[] result = new String[h + 2];
		for (int i = 0; i < h; i++) {
			result[i + 1] = "*".concat(picture[i].concat("*"));
		}
		result[0] = "";
		for (int i = 0; i < w + 2; i++) {
			result[0] = result[0].concat("*");
		}
		result[h + 1] = result[0];
		return result;
		
		
	}
}
