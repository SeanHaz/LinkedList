package generics;

public class TreeNode <E> {
	public TreeNode<E> left;
	public E val;
	public TreeNode<E> right;
	
	public TreeNode(){}
	
	public TreeNode(E val) {
		this.val = val;
	}
	
	public TreeNode(E val, TreeNode<E> left, TreeNode<E> right) {
		this.val  = val;
		this.left = left;
		this.right = right; 
	}
}
