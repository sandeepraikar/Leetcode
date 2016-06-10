package algorithms.easy;

/*
 *  Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space? 
 * */
/**
 * @author Sandeep
 *
 */
public class LinkedListCycle {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		boolean foundCycle = false;
		while (slow != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (slow == null || fast == null) {
				foundCycle = false;
				break;
			}
			if (slow == fast) {
				foundCycle = true;
				break;
			}
		}
		return foundCycle;

	}
}