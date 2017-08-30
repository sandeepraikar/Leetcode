package algorithms.medium;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note: You may assume that duplicates do not exist in the tree.
 * 
 * @author Sandeep
 *
 */

// Definition for a binary tree node.
// class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
// }
public class ConstructBinaryTreeFromPreorderAndInOrder {

	class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return helper(0, 0, inorder.length - 1, preorder, inorder);
	}

	TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder,
			int[] inorder) {
		if (preStart > preorder.length - 1 || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int inIndex = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == root.val) {
				inIndex = i;
				break;
			}
		}
		root.left = helper(preStart + 1, inStart, inIndex - 1, preorder,
				inorder);
		root.right = helper(preStart + 1 + inIndex - inStart, inIndex + 1,
				inEnd, preorder, inorder);
		return root;
	}

}
