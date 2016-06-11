package algorithms.easy;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * */
/**
 * @author Sandeep
 *
 */
public class MergeTwoSortedLists_v2 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}
		ListNode newList = new ListNode(0);
		ListNode node = newList;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				node.next = l1;
				l1 = l1.next;
			} else {
				node.next = l2;
				l2 = l2.next;
			}
			node = node.next;
		}

		if (l1 != null) {
			node.next = l1;
		}

		if (l2 != null) {
			node.next = l2;
		}
		return newList.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}