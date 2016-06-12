package algorithms.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]

 * */
/**
 * @author Sandeep
 *
 */
public class BinaryTreeLevelOrderTraversal {

	public class Solution {
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;

			TreeNode(int x) {
				val = x;
			}
		}

		public List<List<Integer>> levelOrder(TreeNode root) {
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			List<List<Integer>> traversal = new ArrayList<>();
			if (root == null) {
				return traversal;
			}
			q.add(root);

			while (!q.isEmpty()) {
				List<Integer> sub = new ArrayList<Integer>();
				int level = q.size();
				for (int i = 0; i < level; i++) {
					TreeNode node = q.poll();
					sub.add(node.val);
					if (node.left != null) {
						q.add(node.left);
					}
					if (node.right != null) {
						q.add(node.right);
					}
				}
				traversal.add(sub);
			}
			return traversal;
		}
	}
}