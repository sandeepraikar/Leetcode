package algorithms.easy;

/*206. Reverse Linked List
 * Reverse a singly linked list.*/
/**
 * @author Sandeep
 *
 */
public class ReverseLinkedList_v2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode recursiveReverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode newHead = recursiveReverse(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
}