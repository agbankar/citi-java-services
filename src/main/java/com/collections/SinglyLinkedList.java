package com.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<E> implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7168667266693764332L;
	Node<E> head;
	protected transient int modCount = 0;

	public SinglyLinkedList() {

	}

	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.linkFirst("a");
		list.linkLast("z");
		list.print();

	}

	private void print() {
		Node<E> last = head;
		while (last != null) {
			System.out.println(last.data);

			last = last.next;
		}

	}

	public boolean add(E e) {
		Node<E> newNode = new Node<E>(e);
		if (head == null) {
			head = new Node(e);
		} else {
			Node<E> last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;

		}
		modCount++;
		return true;

	}

	public void printlist() {

	}

	public boolean linkFirst(E e) {
		Node<E> fistNode = new Node<E>(e);
		fistNode.next = head;
		head = fistNode;
		return true;

	}

	private boolean linkLast(E e) {
		Node<E> lastNode = new Node<E>(e);

		Node<E> last = head;
		while (last.next != null) {
			last = last.next;

		}
		last.next = lastNode;
		return true;

	}

	private static class Node<E> {
		Node<E> next;
		E data;

		public Node(E e) {
			this.data = e;
			this.next = null;
		}

	}

	@Override
	public String toString() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;

		}
		return null;
	}

}
