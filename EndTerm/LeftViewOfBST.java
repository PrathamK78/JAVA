package EndTerm;

import java.util.*;

class TreeNode{
    TreeNode left,right;
    int value;
    public TreeNode(){}
    public TreeNode(int val){
        this.value = val;
    }
    TreeNode root;
    public void insertRoot(int value){
        root = insertNodes(root,value);
    }
    private TreeNode insertNodes(TreeNode node, int value){
        if(node == null) return new TreeNode(value);

        if(value < node.value){
            node.left = insertNodes(node.left,value);
        }else{
            node.right = insertNodes(node.right,value);
        }
        return node;
    }
}

public class LeftViewOfBST {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for left view
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        ArrayList<Integer> list = new ArrayList<>();
        leftView(tree.root, list, 1);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
    static void leftView(TreeNode root, ArrayList<Integer> list, int level) {
        if (root == null) return;
        if (level > list.size()) list.add(root.value);

        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1);
    }
}


