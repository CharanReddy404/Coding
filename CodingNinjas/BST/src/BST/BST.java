package BST;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if(node==null) {
			return false;
		}
		if(node.data==x) {
			return true;
		}
		if(node.data>x) {
			return isPresentHelper(node.left,x);
		}else {
			return isPresentHelper(node.right,x);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if(node==null){
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
            return newRoot;
        }
        if(x>=node.data){
            node.right = insertHelper(node.right,x);
        }else{
            node.left = insertHelper(node.left,x);
        }
        return node;
    }
	
	public void insert(int x) {
		root = insertHelper(root,x);
		size++;
	}
	
	private static BSTDeletedReturn deleteHelper(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return new BSTDeletedReturn(null,false);
		}
		if(root.data<x) {
			BSTDeletedReturn outputRight = deleteHelper(root.right,x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		if(root.data>x) {
			BSTDeletedReturn outputleft = deleteHelper(root.left,x);
			root.left = outputleft.root;
			outputleft.root = root;
			return outputleft;
		}
		
		if(root.left==null && root.right==null) {
			return new BSTDeletedReturn(null,false);
		}
		
		if(root.left!=null && root.right==null) {
			return new BSTDeletedReturn(root.left,true);
		}
		
		if(root.left==null && root.right!=null) {
			return new BSTDeletedReturn(root.right,true);
		}
		
		int rightMax = largest(root.right);
		root.data = rightMax;
		BSTDeletedReturn outputRight = deleteHelper(root.right, rightMax);
		root.right = outputRight.root;
		return new BSTDeletedReturn(root,true);
	}
	
	public boolean delete(int x) {
		BSTDeletedReturn output = deleteHelper(root, x); 
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	private static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data,Math.max(largestLeft, largestRight));
	}
	
	public int size() {
		return size;
	}
	
	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+":");
		if(node.left!=null) {
			System.out.print("L:"+node.left.data+",");
		}
		if(node.right!=null) {
			System.out.print("R:"+node.right.data);
		}
		System.out.println();
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
}
