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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1)
        return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pg=dummy;
        ListNode curr=head;
        int c=0;
        while(curr!=null) {
            curr=curr.next;
            c++;
        }
        curr=dummy.next;
        while(c>=k) {
            ListNode prev=null;
            ListNode next=null;
            ListNode temp=curr;
            for(int i=0;i<k;i++) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            pg.next=prev;
            temp.next=curr;
            pg=temp;
            c-=k;
        }
        return dummy.next;
    }
}