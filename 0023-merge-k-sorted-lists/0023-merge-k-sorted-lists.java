/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode r=null;
        for(int i=0;i<lists.length;i++) {
            ListNode dummy=new ListNode(0);
            ListNode temp=dummy;
            ListNode l1=r;
            ListNode l2=lists[i];
            while(l1!=null && l2!=null) {
                if(l1.val>l2.val) {
                    temp.next=l2;
                    l2=l2.next;
                }
                else {
                    temp.next=l1;
                    l1=l1.next;
                }
                temp=temp.next;
            }
            if(l1!=null)
            temp.next=l1;
            else
            temp.next=l2;
            r=dummy.next;
        }
        return r;
    }
}