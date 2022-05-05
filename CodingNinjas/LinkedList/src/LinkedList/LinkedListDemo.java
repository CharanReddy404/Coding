package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node<Integer>(10);
	    Node<Integer> node2 = new Node<Integer>(20);
	    node1.next = node2;
	    increment(node1);
	    print(node1);
//		Node<Integer> head = createLinkedList();
//		print(head);
//		Node<Integer> node1 = new Node<Integer>(10);
//	    Node<Integer> node2 = new Node<Integer>(20);
//	    node2.next = node1;
//	    print(node2);
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	 public static void print(Node<Integer> head){
		    Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
		}
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return n1;
	}

}
