package algorithms.easy;

import java.util.Stack;

/**/
/**
 * @author Sandeep
 *
 *
 *         Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		Stack<Integer> stack = new Stack<Integer>();
		if (head == null) {
			return true;
		}
		while (fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			slow = slow.next;
		}
		while (slow != null) {
			int top = stack.pop();
			if (slow.val != top) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}