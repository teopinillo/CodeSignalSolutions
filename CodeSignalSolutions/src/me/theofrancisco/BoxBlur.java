package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-5/5xPitc3yT3dqS7XkP
/*Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
 *  You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: 
Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. 
All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.

Example

For

image = [[1, 1, 1], 
         [1, 7, 1], 
         [1, 1, 1]]

the output should be boxBlur(image) = [[1]].*/
public class BoxBlur {
	
	static int[][] boxBlur(int[][] image) {
		
		class Helper {
			int getAverage (int x, int y, int[][]matrix) {
				return (matrix[x+0][y+0]+matrix[x+0][y+1]+matrix[x+0][y+2]+
						matrix[x+1][y+0]+matrix[x+1][y+1]+matrix[x+1][y+2]+
						matrix[x+2][y+0]+matrix[x+2][y+1]+matrix[x+2][y+2] )/9;
			}
		}
		
		int[][] blur = new int[image.length-2][image[0].length-2];
		int bx=0;
		int by=0;
		int pixel;
		Helper helper = new Helper();
		for (int x=0;x<image.length-2;x++) {
			for (int y=0;y<image[0].length-2;y++) {
				pixel = helper.getAverage(x, y, image);
				//System.out.println ( x+", "+y+" => "+pixel+" =>"+bx+", "+by);
				System.out.print(pixel+" ");
				 blur[bx][by++]=pixel;
			}
			bx++;by=0;
			System.out.println(x);
		}
		return blur;
	}
}
