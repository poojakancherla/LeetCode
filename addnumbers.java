// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(0);
        ListNode p=l1, q=l2, current=head;
        int carry=0;
        while(p!=null || q!=null){
            int x,y;
            if (p!=null){
                x=p.val;
                p=p.next;
            }
            else
                x=0;
            if (q!=null){
                y=q.val;
                q=q.next;
            }
            else y=0;
            int sum=x+y+carry;
            carry=sum/10;
            current.next= new ListNode(sum%10);
            current=current.next;


        }

        if(carry>0){
            current.next= new ListNode(carry);

        }
        return head.next;
    }
}
