package trees;

public class Binary_Tree {
	Node root;

	public Binary_Tree(int key)
	{
		root = new Node(key);
	}
	public Binary_Tree()
	{
		root=null;
	}
	
	public static void main(String[] args)
	{
		Binary_Tree tree = new Binary_Tree();
		
		tree.root = new Node(5);
		tree.root.left = new Node(3);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		
	}
}
