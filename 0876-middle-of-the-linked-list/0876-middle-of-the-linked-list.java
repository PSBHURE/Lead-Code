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
    public ListNode middleNode(ListNode head) {
    int mid=0;
    int count=0;
    float x=0;
        
    ListNode temp=head;
    if(temp.next==null)
        return temp;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
    x=count/2;
    mid=count/2;
    if(x>mid)
        mid+=mid;
        ListNode req=head; 
    for(int i=0;i<count;i++)
    {
        req=req.next;
        if(i==mid-1)
        break;
    }
     return req;   
    }
}
