package prog_7;
class Node
{
	int info;
	Node left;
	Node right;
	
	public Node(int info) 
	{
		this.info=info;
	}
}
public class prog_7
{
	public static Node Insert(Node root,int data)
	{
		if(root==null)
		{
			Node newnode=new Node(data);
			root=newnode;
			return root;
		}
		else if(root.info>data)
		{
			root.left=Insert(root.left, data);
		}
		else
		{
			root.right=Insert(root.right, data);
		}
		
		return root;
	}
	
	public static void Inorder(Node root)
	{
		if(root==null) {return;}
		Inorder(root.left);
		System.out.print(root.info+" ");
		Inorder(root.right);
	}
	
	public static void Preorder(Node root)
	{
		if(root==null) {return;}
		System.out.print(root.info+" ");
		Preorder(root.left);
		Preorder(root.right);
	}
	
	public static void Postorder(Node root)
	{
		if(root==null) {return;}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.info+" ");
	}
	
	public static Node delete(Node root,int val)
	{
		if(root.info<val)
		{
			root.right=delete(root.right, val);
		}
		else if(root.info>val)
		{
			root.left=delete(root.left, val);
		}
		else
		{
			if(root.left==null && root.right==null)//case-1
			{
				return null;
			}
			
			if(root.left==null)//case-2
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
			//case-3
			Node IS = InorderSuccessor(root.right);
			root.info=IS.info;
			delete(root.right, val);
		}
		return root;
	}
	
	public static Node InorderSuccessor(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		
		return root;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {1,4,21,76,3,9};
		
		Node root=null;
		
		for(int i=0;i<a.length;i++)
		{
			root=Insert(root, a[i]);
		}
		
		System.out.println("Inorder:");
		Inorder(root);
		System.out.println("\nPreorder:");
		Preorder(root);
		System.out.println("\nPostorder:");
		Postorder(root);
	}
}
