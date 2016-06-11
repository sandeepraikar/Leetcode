package algorithms.easy;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * */
/**
 * @author Sandeep
 *
 */
public class MergeTwoSortedLists_v1 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	//recursive solution
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2 ==null){
            return l1==null?l2:l1;
        }
        ListNode newList;
        if(l1.val<=l2.val){
            newList=l1;
            newList.next=mergeTwoLists(l1.next,l2);
        }else{
            newList=l2;
            newList.next=mergeTwoLists(l1,l2.next);
        }
        return newList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}