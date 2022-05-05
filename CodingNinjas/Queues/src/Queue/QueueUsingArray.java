package Queue;

public class QueueUsingArray {
	private int[] data;
	private int front, rare, size;
	
	public QueueUsingArray() {
		data = new int[3];
		front = -1;
		rare = -1;
		size = 0;
	}
	
	public QueueUsingArray(int n) {
		data = new int[n];
		front = -1;
		rare = -1;
		size = 0;
	}
	
	private void doubleCap() {
		int[] temp = data;
		data = new int[temp.length*2];
		int index = 0;
		for(int i=front; i<temp.length; i++) {
			data[index++] = temp[i];
		}
		for(int i=0; i<front-1; i++) {
			data[index++]= temp[i];
		}
		front =0;
		rare = temp.length-1;
	}
	
	public void enqueue(int ele) {
		if(size==data.length) {
			doubleCap();
//			throw new QueueFullException();
		}
		if(size==0) {
			front++;
		}
//		rare++;
//		if(rare==data.length) {
//			rare=0;
//		}
		rare = (rare+1)%data.length;
		data[rare] = ele;
		size++;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp = data[front];
//		front++;
//		if(front==data.length) {
//			front = 0;
//		}
		front =(front+1)%data.length;
		size--;
		if(size==0) {
			front= -1;
			rare = -1;
		}
		return temp;
	}
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
}
