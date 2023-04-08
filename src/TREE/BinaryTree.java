package TREE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private TreeNode root;
    private int count =0;
    private class TreeNode {
        private int data;
         TreeNode left;
         TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    private int calcHeight(TreeNode temp){
        if(temp==null){
            return 0;
        }else{
            return Math.max(calcHeight(temp.left),calcHeight(temp.right))+1;
        }
    }

    public void nodeAtK(int k){
        System.out.println("Nodes at distance "+k+" from root => ");
        ArrayList<Integer> arr = new ArrayList<>();
        printNodesAtK(root,k, arr);
        System.out.println(arr);
    }

    private ArrayList<Integer> printNodesAtK(TreeNode temp, int k, ArrayList<Integer> arr) {
        if(temp==null){
            return arr;
        }
        if(k==0){
            arr.add(temp.data);
        }else{
            printNodesAtK(temp.left,k-1,arr);
            printNodesAtK(temp.right,k-1,arr);
        }

        return arr;
    }

    public int height(){
        return calcHeight(root);
    }

    public void addNode(int data){
        if(root==null){
            TreeNode newNode = new TreeNode(data);
            root = newNode;
        }else{
            TreeNode temp = root;
            insertNode(data, temp);
        }
        count=count+1;
    }

    private void insertNode(int data, TreeNode temp) {
        if(temp.left==null && data<=temp.data){
            temp.left = new TreeNode(data);
            return;
        }

        if(temp.right==null && data>temp.data){
            temp.right = new TreeNode(data);
            return;
        }

        if(data < temp.data){
            insertNode(data, temp.left);
        }else {
            insertNode(data, temp.right);
        }
    }

    public void traverse(){
        System.out.print("PreOrder => ");
        ArrayList<Integer> pre = new ArrayList<>();
        preOrderTraversal(root, pre);
        System.out.println(pre);

        System.out.print("InOrder => ");
        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrderTraversal(root, inOrder);
        System.out.println(inOrder);

        System.out.print("PostOrder => ");
        ArrayList<Integer> post = new ArrayList<>();
        PostOrderTraversal(root, post);
        System.out.println(post);

        System.out.println("Level Order => ");
        ArrayList<Integer> levelorder = levelOrderTraversal(root);
//        System.out.println(levelorder);
    }
    private void preOrderTraversal(TreeNode temp, ArrayList<Integer> arr){
        if(temp==null){
            return;
        }
        arr.add(temp.data);
        preOrderTraversal(temp.left, arr);
        preOrderTraversal(temp.right, arr);

    }
    private void inOrderTraversal(TreeNode temp, ArrayList<Integer> arr){
        if(temp==null){
            return;
        }
        inOrderTraversal(temp.left, arr);
        arr.add(temp.data);
        inOrderTraversal(temp.right, arr);

    }
    private void PostOrderTraversal(TreeNode temp, ArrayList<Integer> arr){
        if(temp==null){
            return;
        }
        PostOrderTraversal(temp.left, arr);
        arr.add(temp.data);
        PostOrderTraversal(temp.right, arr);

    }

    private ArrayList<Integer> levelOrderTraversal(TreeNode temp){
        ArrayList<Integer> in = new ArrayList<>();
        if(temp==null)return in;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(temp);
        qu.add(null);

        while(qu.size()>1){
            TreeNode curr = qu.poll();

            if(curr==null){
                qu.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.data+" ");
            in.add(curr.data);
            if(curr.left!=null){
                qu.add(curr.left);
            }
            if(curr.right!=null){
                qu.add(curr.right);
            }
        }
        System.out.println();
        return in;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrderTraversal(p, arr1);
        inOrderTraversal(q, arr2);
        return arr2.equals(arr1);
    }

}
