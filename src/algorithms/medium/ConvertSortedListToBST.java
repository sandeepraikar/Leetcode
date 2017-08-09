package algorithms.medium;

/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * 
 * 
 * @author Sandeep
 *
 */
public class ConvertSortedListToBST {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		return toBST(head, null);
	}

	public TreeNode toBST(ListNode head, ListNode tail) {

		if (head == tail) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;

		while (fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = toBST(head, slow);
		root.right = toBST(slow.next, tail);
		return root;

	}
}
