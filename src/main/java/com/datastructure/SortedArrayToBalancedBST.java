package com.datastructure;

public class SortedArrayToBalancedBST {

	// A binary tree node 
	/*
	 * 1) Get the Middle of the array and make it root.
	2) Recursively do same for left half and right half.
	      a) Get the middle of left half and make it left child of the root
	          created in step 1.
	      b) Get the middle of right half and make it right child of the
	          root created in step 1.
	 */

	 public static void main(String[] args) {
	  new SortedArrayToBalancedBST();
	 }
	 
	 public SortedArrayToBalancedBST(){
	  int[] arr = new int[]{1,2,3,4,5,6,7};
	  Node balancedBST = sortedArrayToBST(arr, 0, arr.length-1);
	  printTreeInOrder(balancedBST);
	 }
	 
	 private Node sortedArrayToBST(int[] arr, int start, int end){
	  if(start>end){
	   return null;
	  }
	   
	  int mid = start + (end-start)/2;
	   
	  Node temp = new Node(arr[mid]);
	  temp.setLeft(sortedArrayToBST(arr, start, mid-1));
	  temp.setRight(sortedArrayToBST(arr, mid+1, end));
	   
	  return temp;
	 }
	 /*
	   * 4
	   * /\
	   	2   6
	   	/\   /\
	   	1 3  5 7
	   */
	 private void printTreeInOrder(Node rootNode){
	  if(rootNode==null)
	   return;
	  printTreeInOrder(rootNode.getLeft());
	  System.out.print(rootNode.getData() + " ");
	  printTreeInOrder(rootNode.getRight());
	  
	 
	 }
	}
	                     