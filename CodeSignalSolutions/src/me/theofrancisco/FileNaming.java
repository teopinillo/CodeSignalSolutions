package me.theofrancisco;

import java.util.ArrayList;
import java.util.List;

public class FileNaming {
public static String[] fileNaming2(String[] names) {
	List<String> files = new ArrayList<>();
	 files.add(names[0]);
      for (int i=1;i<names.length;i++) {
    	  int c=1;
    	  String n=names[i];
    	  while (files.contains(n)) {
    		 n=names[i]+"("+c+")";
    		 c++;
    	  }
    	  files.add(n);
  }
      return files.toArray( new String[0]);
}
}