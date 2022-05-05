package StackLinkedList;

import java.util.*;

public class StackUsingQueue {

    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;
    private int size;

    public StackUsingQueue() {
        //Implement the Constructor
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        size++;
        q2.add(element);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1=q2;
        q2=q;
    }

    public int pop() {
        //Implement the pop() function
        if(q1.isEmpty()){
            return -1;
        }
        int temp = q1.peek();
        q1.remove();
        size--;
        return temp;
    }
    public int top() {
        //Implement the top() function
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}