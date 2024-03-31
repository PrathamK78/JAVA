package DSA;

//import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Scanner;

class TreeNode{
    TreeNode left,right;
    int value;
    public TreeNode(){}
    public TreeNode(int val){
        this.value=val;
    }
    TreeNode root ;
    public void insertRoot(int value){
        root=insert(root,value);
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null) return new TreeNode(value);
        if(value<root.value){
            root.left= insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }
}

public class Trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int value= sc.nextInt();
            tree.insertRoot(value);
        }
        ArrayList<Integer> list = new ArrayList<>();

    }
}