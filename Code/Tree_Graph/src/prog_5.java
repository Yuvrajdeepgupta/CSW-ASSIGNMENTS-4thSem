import java.util.*;

class BSTNODE
{
	int data;
	BSTNODE left;
	BSTNODE right;
	
	public BSTNODE(int data) 
	{
		this.data=data;
	}
}

public class prog_5 
{
	public static BSTNODE Insert(BSTNODE root,int data)
	{
		if(root==null)
		{
			BSTNODE newnode=new BSTNODE(data);
			root=newnode;
			return root;
		}
		else if(root.data>data)
		{
			root.left=Insert(root.left, data);
		}
		else 
		{
			root.right=Insert(root.right, data);
		}
		
		return root;
	}
	
	public static void Inorder(BSTNODE root)
	{
		if(root==null) {return;}
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	
	public static void main(String[] args) 
	{
		int a[]={10, 20, 30, 40, 50,60, 70, 80, 90, 100};
		
		BSTNODE root=null;
		
		for(int i=0;i<a.length;i++)
		{
			root=Insert(root, a[i]);
		}
		
		System.out.println("Inorder:");
		Inorder(root);
	}
}
