/*Create a class BSTNode that contains a member 'info' to store a number, with 'left' referring
to the left child and 'right' referring to the right child. Provide the necessary constructor.
Additionally, create a method to insert a node into a binary search tree.
Write a program to add methods to the binary search tree created in Q1 for traversing the
tree in pre-order, in-order, and post-order. Invoke the above methods for execution.*/

import java.util.*;
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
public class prog_1and2 
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
