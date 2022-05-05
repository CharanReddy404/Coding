package StackArray;

public class StackUsingArrays {
	private int[] data;
	private int topIndex;
	
	public StackUsingArrays() {
		data = new int[2];
		topIndex = -1;
	}
//	public StackUsingArrays(int size) {
//		data = new int[size];
//		topIndex = -1;
//	}
	
	public int size() {
		return topIndex+1;
	}
	
	public void push(int ele) {
		if(topIndex==data.length-1) {
			doubleCapacity();
		}
		topIndex++;
		data[topIndex] = ele;
	}
	
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[temp.length*2];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
		
	}
	public int pop() throws StackEmptyExpception {
		if(topIndex==-1) {
			throw new StackEmptyExpception();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	public int top() throws StackEmptyExpception {
		if(topIndex==-1) {
			throw new StackEmptyExpception();
		}
		return data[topIndex];
	}
	
	public boolean isEmpty() {
		return topIndex==-1;
	}
}
