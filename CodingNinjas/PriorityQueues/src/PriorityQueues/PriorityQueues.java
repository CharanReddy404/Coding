package PriorityQueues;

import java.util.ArrayList;

public class PriorityQueues<T> {
	
	private ArrayList<Elements<T>> heap;
	
	public PriorityQueues() {
		heap = new ArrayList<>();
	}
	
	public void insert(T value, int priority) {
		Elements<T> e = new Elements<T>(value, priority);
		heap.add(e);
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while(childIndex>0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Elements<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return;
			}
		}
		
	}
	
	public T getMin() throws PriorityQueuesException {
		if(isEmpty()) {
			throw new PriorityQueuesException();
		}
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueuesException {
		if(isEmpty()) {
			throw new PriorityQueuesException();
		}
		Elements<T> remove = heap.get(0);
		T ans = remove.value;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		int midIndex = parentIndex;
		while(leftChildIndex<heap.size()) {
			if(heap.get(leftChildIndex).priority < heap.get(midIndex).priority) {
				midIndex = leftChildIndex;
			}
			if(rightChildIndex<heap.size() && heap.get(rightChildIndex).priority < heap.get(midIndex).priority) {
				midIndex = rightChildIndex;
			}
			if(midIndex==parentIndex) {
				break;
			}
			Elements<T> temp = heap.get(midIndex);
			heap.set(midIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex = midIndex;
			leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
		}
		
		return ans;
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return heap.size()==0;
	}
}
