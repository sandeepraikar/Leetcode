package algorithms.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class FindLargestValueInEachTreeRow {

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return result;
		}
		queue.add(root);

		while (!queue.isEmpty()) {
			int len = queue.size();
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < len; i++) {
				TreeNode node = queue.poll();
				max = Math.max(max, node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			result.add(max);

		}
		return result;
	}
}