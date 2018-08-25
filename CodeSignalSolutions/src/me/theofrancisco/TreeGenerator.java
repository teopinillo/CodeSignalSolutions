package me.theofrancisco;

import java.util.HashMap;

public class TreeGenerator {

	private HashMap<Integer, String> lines = new HashMap<>();
	private int maxLevel = 0;

	public void setValue(Node<Integer> node, Integer value) {
		node.value = value;
	}

	public Node<Integer> create() {
		Node<Integer> root = new Node<>(1);
		root.setChilds(root, 2, 2);
		root.setChilds(root.left, 3, 4);
		root.setChilds(root.right, 4, 3);
		root.setChilds(root.left.left, 5, 6);
		root.setChilds(root.left.right, 6, 5);
		root.setChilds(root.right.left, 5, 6);
		root.setChilds(root.right.right, 6, 5);
		return root;
	}

	private void preparePrint(Node<Integer> node, int l) {
		if (l>maxLevel) maxLevel = l;
		
		if (node==null) return;
		
			if (!lines.containsKey(l)) {
				lines.put(l, node.value.toString());
			} else {
				String o = lines.get(l) + " " + node.value.toString();
				lines.put(l, o);
			}
			if (node.left != null)
				preparePrint(node.left, l+1);
			if (node.right != null)
				preparePrint(node.right, l+1);
			
			
		}
	

	public void printTree(Node<Integer> node, int l) {
		
		
		preparePrint(node, l);
		System.out.println("Max Level= "+maxLevel);
		for (Integer i : lines.keySet()) {
			System.out.println(lines.get(i));
		}
	}

}
