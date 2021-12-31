import java.util.*;
public class Creating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			Node newNode = new Node(data);  
			  
	          //Check whether tree is empty  
	          if(root == null){  
	              root = newNode;  
	              return;  
	            }  
	          else {  
	              //current node point to root of the tree  
	              Node current = root, parent = null;  
	  
	              while(true) {  
	                  //parent keep track of the parent node of current node.  
	                  parent = current;  
	  
	                  //If data is less than current's data, node will be inserted to the left of tree  
	                  if(data < current.data) {  
	                      current = current.left;  
	                      if(current == null) {  
	                          parent.left = newNode;  
	                          return;  
	                      }  
	                  }  
	                  //If data is greater than current's data, node will be inserted to the right of tree  
	                  else {  
	                      current = current.right;  
	                      if(current == null) {  
	                          parent.right = newNode;  
	                          return;  
			System.out.println("Enter 1 to for next node");
			ch=sc.nextInt();
		}while(ch==1);
	}
	              }	                  
	class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
