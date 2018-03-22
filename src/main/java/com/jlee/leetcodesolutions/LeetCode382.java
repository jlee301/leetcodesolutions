package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.Random;

public class LeetCode382 {
  /*
   * Given a singly linked list, return a random node's value from the linked
   * list. Each node must have the same probability of being chosen.
   * 
   * Follow up:
   * What if the linked list is extremely large and its length is unknown to you?
   * Could you solve this efficiently without using extra space?
   * 
   * https://leetcode.com/problems/linked-list-random-node/description/
   */
  private ListNode head;
  
  /**
   * @param head
   *          The linked list's head. Note that the head is guaranteed to be not
   *          null, so it contains at least one node.
   */
  public LeetCode382(ListNode head) {
    this.head = head;
  }
  
  /** Returns a random node's value. */
  public int getRandom() {
    int result = 0, count = 1;
    ListNode node = head;
    //   one node, 1/1 prob, count = 1, replace if count = 0
    //   two node, 1/2 prob, count = 2, replace if count = 1. Hence 1/2 we leave value alone.
    // three node, 1/3 prob, count = 3, replace if count = 2. Hence 2/3 we leave value alone.
    while(node != null) {
      Random rand = new Random();
      if(rand.nextInt(count) == count-1)
        result = node.val;
      count++;
      node = node.next;
    }
    return result;
  }  
}
