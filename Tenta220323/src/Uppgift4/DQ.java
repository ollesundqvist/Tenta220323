package Uppgift4;


public class DQ<E> {
private Node head, tail;
	
	public DQ() {
		this.tail = new Node(null, null, null);
		this.head = new Node(null, tail, null);
		tail.prev = head;
	}
	
	
	
	private class Node{
		Node next, prev;
		E data;
		
		Node(E data, Node next, Node prev){
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void addFirst(E elem) {
		Node backNode = head.next;
		Node newNode = new Node(elem, backNode, head);
		backNode.prev = newNode;
		head.next = newNode;
	}
	
	public void addLast(E elem) {
		Node frontNode = tail.prev;
		Node newNode = new Node(elem, tail, frontNode);
		frontNode.next = newNode;
		tail.prev = newNode;
	}
	
	public E getFirst() {
		if(head.next == tail) {
			throw new RuntimeException("Queue is empty!");
		}else {
			Node removedNode = head.next;
			Node backNode = removedNode.next;
			head.next = backNode;
			backNode.prev = head;
			return removedNode.data;
		}
	}
	
	public E getLast() {
		if(head.next == tail) {
			throw new RuntimeException("Queue is empty!");
		}else {
			Node removedNode = tail.prev;
			Node frontNode = removedNode.prev;
			frontNode.next = tail;
			tail.prev = frontNode;
			return removedNode.data;
		}
	}
	
	public boolean isEmpty() {
		return (head.next == tail ? true : false);
	}
	
	public void printQueue() {
		if(isEmpty()) {
			throw new RuntimeException();
		}else {
			Node currentNode = head.next;
			System.out.print("(");
			while(true) {
				if(currentNode.next == tail) {
					System.out.print(currentNode.data + ")");
					break;
				}else {
					System.out.print(currentNode.data + ", ");
					currentNode = currentNode.next;
				}
			}
		}
	}
}
