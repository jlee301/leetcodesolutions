package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode141 {
  /*
   * Given a linked list, determine if it has a cycle in it.
   * 
   * Follow up: Can you solve it without using extra space?
   * 
   * https://leetcode.com/problems/linked-list-cycle/description/
   */
  public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null)
      return false;
    
    ListNode oneStep = head;
    ListNode twoStep = head.next;
    
    while(oneStep != twoStep) {
      if(twoStep == null || twoStep.next == null) {
        // If either step is null, it means you reached the end of the linked list, so
        // there's no cycle.
        return false;
      } else {
        oneStep = oneStep.next;
        twoStep = twoStep.next.next;
      }
    }
    return true;
  }
}
