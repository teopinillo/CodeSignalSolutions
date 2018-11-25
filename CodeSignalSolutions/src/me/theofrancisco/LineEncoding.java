package me.theofrancisco;

public class LineEncoding {
	public static String lineEncoding(String s) {	
		s=s.concat("@");
	    StringBuilder sb = new StringBuilder();
	    int start=0;
	    for (int i=0;i<s.length()-1;i++){
	        if (! (s.charAt(i)==s.charAt(i+1)) )
	         {
	        	String m = s.substring(start,i+1);
	        	 if (m.length()==1) sb.append(m.substring(0,1));else
	        	 sb.append(m.length() + m.substring(0,1));
	        	 start=i+1;
	        }
	   }
	 return sb.toString();
 }
}
