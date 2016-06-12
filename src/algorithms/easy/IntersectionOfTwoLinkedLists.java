package algorithms.easy;

public class IntersectionOfTwoLinkedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode currA = headA;
		ListNode currB = headB;
		while (currA != currB) {
			if (currA == null) {
				currA = headB;
			} else {
				currA = currA.next;
			}
			if (currB == null) {
				currB = headA;
			} else {
				currB = currB.next;
			}
		}
		return currA;
	}

	public static void main(String[] args) {

	}
}