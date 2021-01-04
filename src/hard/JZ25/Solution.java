package hard.JZ25;

import java.util.*;
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        Map<RandomListNode,RandomListNode> map=new HashMap<>();
        RandomListNode node=pHead;
        while(node!=null){
            RandomListNode Node=new RandomListNode(node.label);
            map.put(node,Node);
            node=node.next;
        }
        node=pHead;
        while(node!=null){
            RandomListNode Node=map.get(node);
            Node.next=map.get(node.next);
            Node.random=map.get(node.random);
            node=node.next;
        }
        return map.getOrDefault(pHead,null);
    }
}
