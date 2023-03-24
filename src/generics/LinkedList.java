package generics;

public class LinkedList<E> implements Queue{
	Node<E> first;
	@Override
	public int size() {
		int count = 0;
		Node<E> cur = first;
		while(cur!=null) {
			count++;
			cur = cur.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void enqueue(Object e) {
		Node<E> cur = first;
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = new Node<>((E)e);
	}

	@Override
	public Object first() {
		return first.val;
	}

	@Override
	public Object dequeue() {
		E ret = first.val;
		first = first.next;
		return ret;
	}

}
