package StackLinkedList;

import StackArray.Node;

public class StackUsingLL<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(T ele) {
		Node<T> newHead = new Node<T>(ele);
		newHead.next = head;
		head = newHead;
		size++;
	}
	
	public T pop() throws StackEmptyExpception {
		if(isEmpty()) {
			throw new StackEmptyExpception(); 
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp; 
	}
	
	public T top() throws StackEmptyExpception {
		if(isEmpty()) {
			throw new StackEmptyExpception(); 
		}
		return head.data;
	}
}
