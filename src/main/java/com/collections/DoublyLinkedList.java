package com.collections;

public class DoublyLinkedList<E> {
	Node<E> head;
	int modCount = 0;

	public boolean add(E e) {
		if (head == null) {
			head = new Node<E>(null, null, e);
		} else {
			Node<E> last = head;
			while (last.next != null) {
				last = last.next;
			}
			Node<E> newNode = new Node<E>(last, null, e);
			last.next = newNode;
		}

		modCount++;
		return true;

	}

	public static void main(String[] args) {
		DoublyLinkedList<String> l = new DoublyLinkedList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.toString();

		System.out.println(l.modCount);
	}

	public void print() {

	}

	private static class Node<E> {
		Node<E> prev;
		Node<E> next;
		E data;

		public Node(Node<E> prev, Node<E> next, E data) {
			super();
			this.prev = prev;
			this.next = next;
			this.data = data;
		}

	}

	@Override
	public String toString() {
		Node<E> last = head;
		while (last != null) {
			System.out.println(last.data);
			last = last.next;

		}

		return null;
	}

}
