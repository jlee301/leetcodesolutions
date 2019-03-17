package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.RandomListNode;
import java.util.HashMap;

public class LeetCode0138 {
  /*
   * A linked list is given such that each node contains an additional random
   * pointer which could point to any node in the list or null.
   * 
   * Return a deep copy of the list.
   */
  public RandomListNode copyRandomList(RandomListNode head) {
    if(head == null)
      return null;
    
    // Since there is no guarantees that node.label is unique, we will store by the
    // RandomListNode object.
    HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
    
    // We first make one loop around the list to capture every node
    RandomListNode temp = head;
    while(temp != null) {
      map.put(temp, new RandomListNode(temp.label));
      temp = temp.next;
    }
    
    // Now we make another loop around the list to capture next and random.
    temp = head;
    while(temp != null) {
      map.get(temp).next = map.get(temp.next);
      map.get(temp).random = map.get(temp.random);
      temp = temp.next;
    }
    return map.get(head);
  }
}
