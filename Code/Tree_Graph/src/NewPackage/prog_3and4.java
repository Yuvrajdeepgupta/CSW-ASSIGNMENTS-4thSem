package NewPackage;
/*Create a class Country containing members for name and population, along with a
constructor and necessary methods. Additionally, create a class BNode with a member 'info' to
store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide
the required constructor. Finally, create another class BST with a member 'root', along with the
necessary constructor and a method to insert a node into the binary search tree.
Extend the BST created in Q3 by adding methods to traverse the tree in level order, find
the node with the maximum population (find-max), and find the node with the minimum
population (find-min). Invoke these methods for execution.*/

class Country
{
	String name;
	int population;
	
	public Country(String name,int population) 
	{
		this.name=name;
		this.population=population;
	}
	
	public int getPopulation() {
		return population;
	}
	
	@Override
	public String toString() 
	{
		return "Country-Name:"+name+" |Population:"+population;
	}
}

class Node 
{
	Country info;
	Node left;
	Node right;
	
	public Node(Country info) 
	{
		this.info=info;
	}
}

class BST
{
	Node root;
	
	public BST() 
	{
		this.root=null;
	}
	
	public void insert(Country info)
	{
		root=insertNode(root,info);
	}
	
	public Node insertNode(Node root,Country info)
	{
		if(root==null)
		{
			Node newnode=new Node(info);
			root=newnode;
			return root;
		}
		else if(info.getPopulation()<root.info.getPopulation())
		{
			root.left=insertNode(root.left, info);
		}
		else
		{
			root.right=insertNode(root.right, info);
		}
		
		return root;
	}
	
	public void Inorder()
	{
		Inordertraversal(root);
	}
	
	public void Inordertraversal(Node root)
	{	if(root==null) {return;}
		Inordertraversal(root.left);
		System.out.println(root.info);
		Inordertraversal(root.right);
	}
	
	public void MaxNode()
	{
		Node temp=findMax(root);
		System.out.println("Maximum Population:"+temp.info.getPopulation());
	}
	
	public Node findMax(Node root)
	{
		if(root==null) {return null;}
		else if(root.right==null)
		{
			return root;
		}
		return findMax(root.right);
	}
	
	public void MinNode()
	{
		Node temp=findMin(root);
		System.out.println("Minimum Population:"+temp.info.getPopulation());
	}
	
	public Node findMin(Node root)
	{
		if(root==null) {return null;}
		else if(root.left==null)
		{
			return root;
		}
		return findMin(root.left);
	}
}

public class prog_3and4
{
	public static void main(String[] args) 
	{
			BST tree = new BST();
	        tree.insert(new Country("CountryA", 1000000));
	        tree.insert(new Country("CountryB", 2000000));
	        tree.insert(new Country("CountryC", 500000));

	        // Print the BST in-order
	        tree.Inorder();
	        
	        //Maximum Node in BST
	        tree.MaxNode();
	        
	        //Minimum Node in BST
	        tree.MinNode();
	}
}
