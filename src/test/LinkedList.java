package test;
public class LinkedList{
	Node first;
	public LinkedList() {
		
	}
	public LinkedList(Node first) {
		this.first = first;
	}
	@Override
	public String toString() {
		String ret = "(";
		Node cur = first;
		while(cur!=null) {
			ret = ret + cur.val + ", ";
			cur = cur.next;
		}
		return ret.substring(0,ret.length()-2) +")";
	}
	
	}
