package test;


public class TestingLinked {
	public static void main(String args[]) {
		LinkedList list = new LinkedList(new Node(-1));
		Node cur = list.first;
		for(int i =0; i<10;i++) {
			Node temp = new Node(i);
			cur.next = temp;
			cur = cur.next;
		}
		cur = list.first;
		while(cur!=null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
		cur = list.first;
		while(cur.next!=null) {
			System.out.println(cur.val);
				cur = cur.next;
		}
		
		cur.next = new Node(10);
		
		System.out.print(list);
		
		
		
		
	}
}
