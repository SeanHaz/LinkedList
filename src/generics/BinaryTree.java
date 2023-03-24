package generics;

public class BinaryTree {
	TreeNode<Integer> root;
	
	
	public void PrintInOrderTraversal()
	{
		
	}

	public void InsertNode(Integer newVal)
	{
		if(root==null) root.val = newVal;
		
		else
		{
			TreeNode <Integer> cur = root;
			while(true)
			{
				if(newVal>=cur.val && cur.right == null)
				{
					cur.right = new TreeNode<Integer>(newVal);
					break;
				}
				else if(newVal<cur.val && cur.left == null) 
				{
					cur.left = new TreeNode<Integer>(newVal);
					break;
				}
				else
				{
					cur = (newVal>=cur.val) ? cur.right :  cur.left;
				}
			}
		}
	}
}
