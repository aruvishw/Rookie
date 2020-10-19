package MavenProject.AV;

import java.util.Queue;

public class BinaryTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data= data;
			left= null;
			right=null;
		}
	}
static Node root;
	static void insert(Node temp, int data){
		if(temp==null){
			root= new Node(data);
			return;
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()){
			temp= q.peek();
			q.remove();
			if(temp.left==null){
				temp.left= new Node(data);
				break;
			}
			else
				q.add(temp.left);
			
			if(temp.right==null){
				temp.right= new Node(data);
				break;
			}
			else
				q.add(temp.right);
		}
	}
static void printTree(Node temp){
		if(temp==null)
			return;
		printTree(temp.left);
		System.out.println(temp.data);
		printTree(temp.right);
		}
public static void main(String []args){
		insert(root,5);
		printTree(root);
	}
}
