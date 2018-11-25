package me.theofrancisco;

//https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL
//Call two arms equally strong if the heaviest weights they each are able to lift are equal.
//
//Call two people equally strong if their strongest arms are equally strong
//(the strongest arm can be both the right and the left), and so are their weakest arms.
//Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

public class AreEquallyStrong {
	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		int t;
		 if (yourLeft>yourRight) {
			 t=yourRight;
			 yourRight=yourLeft;
			 yourLeft=t;			 
		 }
		 if (friendsLeft>friendsRight) {
			 t=friendsRight;
			 friendsRight=friendsLeft;
			 friendsLeft=t;			 
		 }
		 return (yourLeft==friendsLeft) && (yourRight==friendsRight);
	}
}
