package generics;

public class Node <E> {
	public E val;
	public Node<E> next;
	
	public Node(){}
	
	public Node(E val) {
		this.val = val;
	}
	
	public Node(E val, Node<E> next) {
		this.val  = val;
		this.next = next;
	}
}
