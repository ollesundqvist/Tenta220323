package Uppgift4;


public class BoundedDQ<E> extends DQ<E>{
	
	private int maxElements, currentElements;
	
	public BoundedDQ(int max) {
		this.maxElements = max;
		this.currentElements = 0;
	}
	
	public void addFirst(E elem) {
		if(currentElements < maxElements) {
			super.addFirst(elem);
			currentElements++;
		}else {
			throw new UnsupportedOperationException();
		}
	}
	
	public void addLast(E elem) {
		if(currentElements < maxElements) {
			super.addLast(elem);
			currentElements++;
		}else {
			throw new UnsupportedOperationException();
		}
	}
	
	public E getFirst() {
		currentElements--;
		return super.getFirst();
	}
	
	public E getLast() {
		currentElements--;
		return super.getLast();
	}
}
