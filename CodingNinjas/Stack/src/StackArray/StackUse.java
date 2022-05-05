package StackArray;

public class StackUse {

	public static void main(String[] args) throws StackEmptyExpception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays();
		int arr[] = {2,4,6,8,10};
		System.out.println(stack.isEmpty());
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
		System.out.println("Size: "+stack.size());
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.isEmpty());
		
	}

}
