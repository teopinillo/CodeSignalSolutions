package me.theofrancisco;

public class IsIPv4Address {
	boolean isIPv4Address(String inputString) {
		 String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		 return inputString.matches(pattern);
		}
}
