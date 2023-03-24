package generics;

public class TestingQueue {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<>();
		list.first = new Node<Integer>(-1);
		for(int i = 0;i<10;i++) {
			list.enqueue(i);
		}
		while(!list.isEmpty()) { 
			System.out.println(list.dequeue());
		}
	}
}
