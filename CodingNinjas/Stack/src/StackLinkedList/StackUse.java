package StackLinkedList;


public class StackUse {

	public static void main(String[] args) throws StackEmptyExpception {
		
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		int arr[] = {2,4,6,8,10};
		System.out.println("Empty: "+stack.isEmpty());
		System.out.println("Size: "+stack.size());
		for(int i=0; i<arr.length;i++) {
			stack.push(arr[i]);
			System.out.print(stack.top()+" ");
		}
		System.out.println();
		System.out.println("Size: "+stack.size());
		while(!stack.isEmpty()) {
			System.out.println("Removed: "+stack.top());
			stack.pop();
		}
		System.out.println("Empty: "+stack.isEmpty());
		System.out.println("Size: "+stack.size());

		
	}

}
