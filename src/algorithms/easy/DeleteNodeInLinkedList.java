package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sandeep
 *
 * 237. Delete Node in a Linked List
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

Subscribe to see which companies asked this question

 */
public class DeleteNodeInLinkedList {
	public class ListNode {
		int val;
		ListNode next;
	
		ListNode(int x) {
			val = x;
		}
	}

	public void deleteNode(ListNode node) {
		if (node != null && node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
		List<Integer> asd = new ArrayList<>();
		asd.clear();
	}
}