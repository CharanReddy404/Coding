package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {

	public static int noOfNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count = 1;
		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			int childCount = noOfNodes(child);
			count+=childCount;
		}
		return count;
	}
	
	
	public static void printTree(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+": ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}
	
	public static int sumOfNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum=0;
		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			int s = sumOfNodes(child);
			sum+=s;
		}
		return sum+root.data;
	}
	public static void printLevelWise(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        
        while(true){
            int count = q.size();
            if(count==0){
                break;
            }
            while(count>0){
                TreeNode<Integer> node = q.remove();
                System.out.print(node.data+" ");
                if(node.children!=null){
                    for(int i=0; i<node.children.size();i++){
                        q.add(node.children.get(i));
                    }
                }
                count--;
            }
            System.out.println();
        }
	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		System.out.println("Enter the root data:");
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.poll();
			System.out.println("Enter The No Of Children for: "+front.data);
			int numChild = sc.nextInt();
			for(int i=0; i<numChild;i++) {
				System.out.println("Ente "+i+"th Child Data for:"+front.data);
				int childData = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				front.children.add(childNode);
				pendingNodes.add(childNode);
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);
		
		
		
		TreeNode<Integer> root = takeInput();
		printTree(root);
		System.out.println();
		System.out.println("Sum Of All Nodes: "+sumOfNodes(root));
		System.out.println("No Of Nodes: "+noOfNodes(root));
	}

}
