
// program to find the longest path between root and leaf nodes in a binary tree
package com.gl.dsa;

import java.util.ArrayList;

public class longPath{
		
	
	static class Node
	{
		Node left;
		Node right;
		int data;
	};

	static Node newNode(int data)
	{
		Node temp = new Node();

		temp.data = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	public static ArrayList<Integer> longestPath(Node root)
	{
		
		if(root == null)
		{
			return new ArrayList<>();
			
		}
	
		ArrayList<Integer> right = longestPath(root.right);
		ArrayList<Integer> left = longestPath(root.left);

		if(right.size() < left.size())
		{
			left.add(root.data);
		}
		else
		{
			right.add(root.data);
		}
		
		return (left.size() >
				right.size() ? left : right);
	}

	// Driver Code
	public static void main(String[] args)
	{
		
		Node root = newNode(100);
		root.left = newNode(20);
		root.right = newNode(130);
		root.left.left = newNode(10);
		root.left.right = newNode(50);
		root.right.left= newNode(110);
		root.right.right= newNode(140);
		root.left.left.left = newNode(5);
		
		ArrayList<Integer> output = longestPath(root);
		int n = output.size();
		
		
		System.out.println("Longest path:");
		System.out.print(output.get(n - 1));
		
		for(int i = n - 2; i >= 0; i--)
		{
			System.out.print(" -> " + output.get(i));
		}
	}
}

