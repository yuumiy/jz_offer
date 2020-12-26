package medium.JZ15;

class ListNode{
    int val;
    ListNode next=null;
    public ListNode(int val){
        this.val=val;
    }
}

public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode after=null;
        while(head!=null){
            after=head.next;
            head.next=pre;
            pre=head;
            head=after;
        }
        return pre;
    }
}
