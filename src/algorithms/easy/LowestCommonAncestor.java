package algorithms.easy;


/*
 *  Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5

 * */
/**
 * @author Sandeep
 *
 */
public class LowestCommonAncestor {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		if (p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}
	}
	
	 public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null){
	            return root;
	        }
	        if(root == p || root== q){
	            return root;
	        }
	        TreeNode left = lowestCommonAncestor(root.left,p,q);
	        TreeNode right = lowestCommonAncestor(root.right,p,q);
	        if(left!=null && right!=null){
	            return root;
	        }
	        if(left==null){
	            return right;
	        }else{
	            return left;
	        }
	    }
}