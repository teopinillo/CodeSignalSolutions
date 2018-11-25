package me.theofrancisco;

public class IsMAC48Address {
	boolean isMAC48Address(String inputString) {
		String pattern="([0-9A-F]{2})-([0-9A-F]{2})-([0-9A-F]{2})-([0-9A-F]{2})-([0-9A-F]{2})-([0-9A-F]{2})";
		return inputString.matches(pattern);
	}
}
