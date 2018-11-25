package me.theofrancisco;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

//https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
//
//Some people are standing in a row in a park. There are trees between them which cannot be moved.
//Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
//People can be very tall!

//Example

//For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
//sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

public class SortByHeight {
	static public int[] sortByHeight(int[] a) {
		int l = a.length;
		List<Integer> heights = new ArrayList<Integer>();
		for (int h : a)
			heights.add(h);
		Collections.sort(heights);
		int i = 0;
		while ((i < l) && (heights.get(i) == -1))
			i++;
		if (i == l)
			return a;
		for (int j = 0; j < l; j++) {
			if (a[j] != -1) {
				a[j] = heights.get(i++);
			}
		}
		return a;
	}
}
