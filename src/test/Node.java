package test;

public class Node{
	int val;
	Node next;
	public Node(int n, Node next) {
		this.val = n;
		this.next = next;
	}
	public Node(int n) {
		this.val = n;
	}
	public Node() {}
}