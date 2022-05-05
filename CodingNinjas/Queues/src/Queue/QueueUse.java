package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException{
//		QueueUsingArray q = new  QueueUsingArray();
		QueueUsingLL<Integer> q = new QueueUsingLL<>();
		int[] arr = {2,4,6,8,10};
		System.out.println("Size: "+q.size());
		for(int i: arr) {
			q.enqueue(i);
			System.out.println("Added: "+i);
		}
		System.out.println("Size: "+q.size());
		while(!q.isEmpty()) {
			try {
				System.out.println("Removed: "+q.dequeue());
			}catch(QueueEmptyException e) {
				
			}
		}
//		q.enqueue(1);
//		q.enqueue(2);
//		System.out.println("Front: "+q.front());
//		q.enqueue(3);
//		System.out.println("Size: "+q.size());
//		System.out.println("Removed: "+q.dequeue());
//		System.out.println("Front: "+q.front());
//		q.enqueue(4);
//		System.out.println("Removed: "+q.dequeue());
//		System.out.println("Front: "+q.front());
//		System.out.println("Removed: "+q.dequeue());
//		System.out.println("Front: "+q.front());
//		System.out.println("Size: "+q.size());
	}

}
