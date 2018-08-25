package me.theofrancisco;

public class SymmetricTree {
	
	public static boolean isMirror (Node<Integer> node1, Node<Integer> node2) {
		if (node1==null && node2==null) return true;
		
		if (node1!=null && node2!=null && node1.value.equals(node2.value))
			return isMirror (node1.left,node2.right) && isMirror (node1.right,node2.left);
		
		return false;
	}

}

