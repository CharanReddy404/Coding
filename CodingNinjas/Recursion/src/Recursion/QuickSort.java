package Recursion;

import java.util.Scanner;

public class QuickSort {

	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input, 0, input.length-1);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static int partition(int a[],int si,int ei){
		int pivotIndex = a[si];
		int count = 0;
		for(int i=si+1; i<=ei;i++) {
			if(a[i]<pivotIndex) {
				count++;
			}
		}
		int temp = a[si+count];
		a[si+count]= pivotIndex;
		a[si] = temp;
		int i=0, j=0;
		while(i<j) {
			if(a[i]<pivotIndex) {
				i++;
			}
			else if(a[j]>=pivotIndex) {
				j--;
			}
			else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return si+count;
    }
	
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei) {
        	return;
        }
        int pivotIndex = partition(a,si,ei);
        quickSort(a,si,pivotIndex-1);
        quickSort(a, pivotIndex+1, ei);
    }

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

}
