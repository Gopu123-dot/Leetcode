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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        return head;
        ListNode temp=head;
        int c=1;
        while(temp.next!=null) {
            c++;
            temp=temp.next;
        }
        k=k%c;
        for(int i=1;i<=k;i++) {
            ListNode prev=null;
            temp=head;
            while(temp.next!=null) {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}