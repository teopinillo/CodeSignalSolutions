package me.theofrancisco;

public class Node<T> {
	Node<T> left;
	Node<T> right;
	T value;
	
	public Node (T value) {
		left = null;
		right = null;
		this.value = value;
	}
	
	public Node (T value, T lValue, T rValue) {
		 Node<T> node = new Node<>(value);
		 node.left = new Node<>(lValue);
		 node.right = new Node<>(rValue);
	}
	
	public void setChilds (Node<T> node, T lValue, T rValue) {
		node.left = new Node<T> (lValue);
		node.right = new Node<T> (rValue);
	}
}
