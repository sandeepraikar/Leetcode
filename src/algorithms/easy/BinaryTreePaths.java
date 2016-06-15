package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sandeep
 *
 *
 *
 *         Given a binary tree, return all root-to-leaf paths.
 * 
 *         For example, given the following binary tree:
 * 
 *         1 / \ 2 3 \ 5
 * 
 *         All root-to-leaf paths are:
 * 
 *         ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		DFS(root, "", result);
		return result;
	}

	public void DFS(TreeNode root, String path, List<String> result) {

		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			result.add(path + root.val);
		}
		if (root.left != null) {
			DFS(root.left, path + root.val + "->", result);
		}
		if (root.right != null) {
			DFS(root.right, path + root.val + "->", result);
		}
	}
}