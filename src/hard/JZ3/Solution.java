package hard.JZ3;

import java.util.*;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<ListNode> stack=new Stack<>();
        if(listNode==null)
            return list;
        while(listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}
