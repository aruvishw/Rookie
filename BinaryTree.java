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
