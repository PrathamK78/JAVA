package EndTerm;

import java.util.*;

public class HeightOfBST {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
       int ans= height(tree.root);

            System.out.println(ans);

    }
    static int height(TreeNode node){
        if(node==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
}
