package algorithms.easy;
/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 * @author Sandeep
 *
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
     
         int leftHeight = getHeight(root.left);
         int rightHeight = getHeight(root.right);
         
         int leftDiameter = diameterOfBinaryTree(root.left);
         int rightDiameter = diameterOfBinaryTree(root.right);
         
         int diameter = Math.max(leftHeight+rightHeight, Math.max(leftDiameter,rightDiameter));
         return diameter;
     }
     
     public int getHeight(TreeNode root){
         if(root == null){
             return 0;
         }
         return Math.max(getHeight(root.left), getHeight(root.right))+1;
     }
}
