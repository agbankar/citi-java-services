package com.datastructure;

class Node { 
	
	int data; 
	Node left;
	Node right; 
	
	Node(int d) { 
		data = d; 
		left =null;
		right = null; 
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
} 
