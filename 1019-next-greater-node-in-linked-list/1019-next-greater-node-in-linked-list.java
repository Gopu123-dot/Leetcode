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
    public int[] nextLargerNodes(ListNode head) {
        int c=0;
        ListNode temp=head;
        if(head==null)
        return null;
        while(temp!=null) {
            temp=temp.next;
            c++;
        }
        int arr[]=new int[c];
        int i=0;
        temp=head;
        while(temp!=null) {
            arr[i]=0;
            ListNode curr=temp.next;
            while(curr!=null) {
                if(temp.val<curr.val) {
                    arr[i]=curr.val;
                    break;
                }
                curr=curr.next;
            }
            temp=temp.next;
            i++;
        }
        return arr;
    }
}