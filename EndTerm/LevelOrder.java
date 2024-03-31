package EndTerm;

//import com.sun.source.tree.Tree;

import java.util.*;
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        ArrayList<Integer> ans = levelOrder(tree.root,1);
        for(int  list : ans){
            System.out.print(list +" ");
        }
    }
    static ArrayList<Integer> levelOrder(TreeNode root,int level){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans.get(0);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                list.add(curr.value);
            }
            ans.add(list);
        }
        return ans.get(level);
    }
}