package trees;

public class Binary_Search_tree {

	public Node search(Node root, int key)
	{
		if(root==null || root.data==key)
		{
			return root;
		}
		else if(root.data>key)
		{
			return search(root.left,key);
		}

		return search(root.right,key);

	}
}
