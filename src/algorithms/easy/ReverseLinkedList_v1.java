package algorithms.easy;

/*206. Reverse Linked List
 * Reverse a singly linked list.*/
/**
 * @author Sandeep
 *
 */
public class ReverseLinkedList_v1 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;
		ListNode next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		return prev;
	}
}