package me.theofrancisco;

public class TestTreeGenerator {

	public static void main(String[] args) {
		
		TreeGenerator tg = new TreeGenerator();
		Node<Integer> root = tg.create();
		tg.printTree(root, 1);
		System.out.println(SymmetricTree.isMirror(root, root));
	}

}
