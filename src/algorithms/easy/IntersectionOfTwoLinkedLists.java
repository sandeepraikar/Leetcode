package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

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
	
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<Integer> temp = new HashSet<>();
        if(headA==null || headB==null){
            return null;
        }
        while(headA!=null){
            temp.add(headA.val);
            headA= headA.next;
        }
        while(headB!=null){
            if(temp.contains(headB.val)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

	public static void main(String[] args) {

	}
}