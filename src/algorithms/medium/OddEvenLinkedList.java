package algorithms.medium;

/*328. Odd Even Linked List
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL. */
/**
 * @author Sandeep
 *
 */

public class OddEvenLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}