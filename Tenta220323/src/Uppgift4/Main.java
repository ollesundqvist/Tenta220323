package Uppgift4;


public class Main {

	public static void main(String[] args) {
		BoundedDQ<Integer> queue = new BoundedDQ<Integer>(5);
		
		queue.addFirst(2);
		queue.addFirst(1);
		queue.addLast(3);
		queue.addFirst(2);
		queue.addFirst(2);
		queue.getFirst();
		queue.addFirst(2);
		queue.printQueue();

	}

}
