/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            
            if(curr.left!=null){
                queue.add(curr.left);
    
                if(curr.left.left==null && curr.left.right==null){
                    sum+=curr.left.val;
                }
            }

            if(curr.right!=null){
                queue.add(curr.right);
            }
        }

        return sum;
    }
}