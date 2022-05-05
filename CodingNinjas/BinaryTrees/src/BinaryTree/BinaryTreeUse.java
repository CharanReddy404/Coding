package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		Scanner sc = new Scanner(System.in);
		if(isRoot) {
			System.out.println("Enter root data:");
		}else {
			if(isLeft) {
				System.out.println("Enter Left child of "+parentData);
			}else {
				System.out.println("Enter Right child of "+parentData);
			}
		}
		
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rootRight = takeTreeInputBetter(false,rootData,false);
		root.left = rootLeft;
		root.right = rootRight;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takeTreeInput();
		BinaryTreeNode<Integer> rootRight = takeTreeInput();
		root.left = rootLeft;
		root.right = rootRight;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root== null) {
			return;
		}
		System.out.print(root.data+": ");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+" , ");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null) {
			return;
		}
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root== null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1+leftNodeCount+rightNodeCount;
	}
	
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		return root.data + leftSum + rightSum;
	}
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return numLeaves(root.left)+numLeaves(root.right);
	}
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	
	public static BinaryTreeNode<Integer> removeLev(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		root.left = removeLev(root.left);
		root.right = removeLev(root.right);
		return root;
	}
	
	public static BinaryTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height = 0;
			boolean isBal = true;
			BinaryTreeReturn ans = new BinaryTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BinaryTreeReturn leftOutput = isBalancedBetter(root.left);
		BinaryTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height,rightOutput.height);
		if(Math.abs(leftOutput.height-rightOutput.height)>1) {
			isBal =false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BinaryTreeReturn ans = new BinaryTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(Math.abs(leftHeight-rightHeight)>1) {
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		return isLeftBalanced && isRightBalanced;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChild.add(root);
		
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChild.poll();
			System.out.println("Enter the left Child of "+front.data);
			int left = sc.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChild.add(leftChild);
			}
			System.out.println("Enter the right Child of "+front.data);
			int right = sc.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChild.add(rightChild);
			}
		}
		return root;
	}
	
	public static void printTreeLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> front = queue.poll();
			System.out.print(front.data+":");
			if(front.left!=null) {
				System.out.print("L:"+front.left.data+",");
				queue.add(front.left);
			}else {
				System.out.print("L:-1,");
			}
			if(front.right!=null) {
				System.out.print("R:"+front.right.data);
				queue.add(front.right);
			}else {
				System.out.print("R:-1");
			}
			System.out.println();
		}
		
	}
	
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int pre[], int in[], int siPre, int eiPre, int siIn, int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootData = pre[siPre]; 												//0=1, 1=2
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData); 	//1,2
		
		int rootIndex = -1;  													// 
		for(int i =siIn; i<= eiIn; i++) {										//0-6,0-2,
			if(in[i]==rootData) {
				rootIndex = i;  												// 3,1
				break;
			}
		}
		
		int siPreLeft = siPre+1;												//1,2
		int	siInLeft = siIn;													//0,0
		int eiInLeft =  rootIndex - 1;											//2,0
		int siInRight = rootIndex +1;											//3,2
		int eiPreRight = eiPre;													//6,3
		int eiInRight = eiIn;													//6,2
		
		int leftSubTreeLength = eiInLeft - siInLeft +1;							//3,1
		
		int eiPreLeft = siPreLeft + leftSubTreeLength -1;						//3,2
		int	siPreRight = eiPreLeft +1;											//4,3
		
		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right =buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight); 
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]){
		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre,in,0,pre.length-1,0,in.length);
		return root;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//		root.right = rootRight;
//		root.left = rootLeft;
//		BinaryTreeNode<Integer> rootLeftLeft = new BinaryTreeNode<>(4);
//		rootLeft.left = rootLeftLeft;
//		BinaryTreeNode<Integer> rootRightRight = new BinaryTreeNode<>(5);
//		rootRight.right = rootRightRight;
//		BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTreeLevelWise(root);
//		printTreeDetailed(root);
//		System.out.println("NoOfNodes: "+numNodes(root));
//		System.out.println("SumOfNodes: "+sumOfNodes(root));
//		inOrder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.println();
//		preOrder(root);
//		System.out.println();
//		System.out.println("NoOfLeaves : "+numLeaves(root));
//		System.out.print("Enter Depth : ");
//		int k = sc.nextInt();
//		printAtDepthK(root,k);
//		sc.close();
		
//		BinaryTreeNode<Integer> newRoot = removeLev(root);
//		System.out.println("NoOfNodes: "+numNodes(newRoot));
//		System.out.println("SumOfNodes: "+sumOfNodes(newRoot));
//		inOrder(newRoot);
//		System.out.println();
//		postOrder(newRoot);
//		System.out.println();
//		preOrder(newRoot);
//		System.out.println();
//		System.out.println("NoOfLeaves : "+numLeaves(newRoot));
//		System.out.println("isBalanced : "+isBalancedBetter(root).isBalanced);
	}
}
