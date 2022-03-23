package Uppgift5;

import java.util.Iterator;

public class BlackBox<E> implements Iterable<E>{
	
	private Node<E> head, tail;
	
	public BlackBox() {
		this.tail = new Node<E>(null, null);
		this.head = new Node<E>(tail, null);
	}

	private class Node<A>{
		Node<A> next;
		A element;
		
		Node(Node<A> next, A element){
			this.next = next;
			this.element = element;
		}
	}
	
	public void add(E elem) {
		Node<E> backNode = head.next;
		Node<E> newNode = new Node<E>(backNode, elem);
		head.next = newNode;
	}
	
	public int size() {
		if(head.next == tail) {
			return 0;
		}else {
			Node<E> currentNode = head.next;
			int count = 1;
			while(true) {
				if(currentNode.next == tail) {
					return count;
				}else {
					count++;
					currentNode = currentNode.next;
				}
			}
		}
	}
	
	public String toString() {
		Iterator<E> it = this.iterator();
		String res = "[ ";
		while(it.hasNext()) {
			res += it.next() + " ";
		}
		res+= "]";
		return res;
	}
	
	private class BlackBoxIterator implements Iterator<E>{

		private int currentIndex;
		
		private BlackBoxIterator() {
			this.currentIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (currentIndex < size() ? true : false);
		}

		@Override
		public E next() {
			currentIndex++;
			Node<E> currentNode = head.next;
			int count = 1;
			while(true) {
				if(count == currentIndex) {
					return currentNode.element;
				}else {
					count++;
					currentNode = currentNode.next;
				}
			}
		}
		
		public void remove() {
			throw new RuntimeException();
		}
		
		
		
	}
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new BlackBoxIterator();
	}
	
	

}
