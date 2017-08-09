package algorithms.easy;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 * @author Sandeep
 *
 */


public class SymmetricTree {
	   public boolean isSymmetric(TreeNode root) {
	        if(root==null){
	            return true;
	        }
	        return checkSymmetry(root.left, root.right);
	    }
	    
	    public boolean checkSymmetry(TreeNode left, TreeNode right){
	        if(left==null && right==null){
	            return true;
	        }
	        if(left==null || right == null){
	            return false;
	        }
	        return (left.val==right.val) && checkSymmetry(left.right, right.left) && checkSymmetry(left.left, right.right);
	    }
}
