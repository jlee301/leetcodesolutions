package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0019 {
  /*
   * Given a linked list, remove the nth node from the end of list and return its
   * head.
   * 
   * For example:
   * Given linked list: 1->2->3->4->5, and n = 2.
   * After removing the second node from the end, the linked list becomes
   * 1->2->3->5.
   * 
   * Note:
   * 1. Given n will always be valid.
   * 2. Try to do this in one pass.
   * 
   * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
   */
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null || n < 1)
      return head;
    
    ListNode dummy = head, current = head;
    while(current.next != null) {
      current = current.next;
      if(n != 0) 
        n--;
      else
        dummy = dummy.next;
    }
    if(n != 0) {
      return head.next;
    } else {
      dummy.next = dummy.next.next;
      return head;
    }
  }
}
