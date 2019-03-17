package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0141 {
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
    
    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
      if(slow == fast)
        return true;
      
      slow = slow.next;
      fast = fast.next.next;
    }
    return false;
  }
}
