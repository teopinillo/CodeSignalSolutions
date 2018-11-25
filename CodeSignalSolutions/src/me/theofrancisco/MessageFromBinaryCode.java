package me.theofrancisco;

public class MessageFromBinaryCode {

	public static String messageFromBinaryCode(String code) {		
		String r="",l="";
		while(!code.isEmpty()) {
			//get the byte
			l=code.substring(0,8);
			//Subtract the byte to the original
			code = code.substring(8);
			//convert the byte string to int
			int i = Integer.parseInt(l, 2);
			//added as character to the result
			r+=Character.toString((char) i);		
	    }
		return r;	
}
}
