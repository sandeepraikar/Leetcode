package algorithms.easy;

/**
 * @author Sandeep
 *
 *100. Same Tree
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value. 
 */
public class SameTree {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }else{
            boolean leftSubTree = isSameTree(p.left, q.left);
            boolean rightSubTree = isSameTree(p.right, q.right);
            if(p.val==q.val && leftSubTree && rightSubTree){
                return true;
            }else{
                return false;
            }
        }
    }
}
