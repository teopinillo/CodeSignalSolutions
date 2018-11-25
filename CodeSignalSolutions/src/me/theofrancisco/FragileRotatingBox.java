package me.theofrancisco;

//https://app.codesignal.com/challenge/s6yCyg62daz3xpCou
public class FragileRotatingBox {

	public static int fragileRotatingBox(String[] boxWeakness, String surfaceRoughness) {
	    class Helper {
	       	public int[] get4Sides(int[][] box, int size) {

			int lastX = box.length;
			int lastY = box[0].length;		
			int [] result = new int[size];
			int i=0;
			
			while (i<size) {
			// last row
			for (int y = 0; y < lastY; y++) {
				if (i<size) result[i++] = box[lastX - 1][y];			
			}
			// last column
			for (int x = lastX - 1; x >= 0; x--) {
				if (i<size) result[i++] =box[x][lastY - 1];			
			}
			// first row in reverse
			for (int y = lastY - 1; y >= 0; y--) {
				if (i<size) result[i++] =box[0][y];			
			}
			// first column		
			for (int x = 0; x < lastX; x++) {
				if (i<size) result[i++] =box[x][0];			
			}
			}		
			return result;
		} 
	    }
	    
	    Helper helper = new Helper();
	        //convert surface roughness to int array
			int[] surface = new int[surfaceRoughness.length()];
			int i=0;
		    for (char ch:surfaceRoughness.toCharArray()) {
		    	surface[i++]=Integer.parseInt(Character.toString(ch));
		    }
		    int surfaceLength = i;
		    //convert boxWeakness to an array of array of integers
		    int [][] box = new int[boxWeakness.length][];
		     for (int j=0;j<boxWeakness.length;j++) {
		    	 box[j] = new int[boxWeakness[j].length()];
		    	 i=0;
		    	 for (char ch:boxWeakness[j].toCharArray()) {
		 	    	box[j][i++]=Integer.parseInt(Character.toString(ch));
		 	    }	    	 
		     }
		     
		     int[] boxSide = helper.get4Sides (box,surfaceLength);
		     int desgaste =0;
		     for (i=0;i<surfaceLength;i++) {
		    	 desgaste += boxSide[i]*surface[i];
		     }
		    return desgaste;
	}

	
}
