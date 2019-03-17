package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0203 {
  /*
   * Remove all elements from a linked list of integers that have value val.
   * 
   * Input: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
   * Output: 1 --> 2 --> 3 --> 4 --> 5
   * 
   * https://leetcode.com/problems/remove-linked-list-elements/description/
   */
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while(head != null) {
      if(head.val != val) {
        curr.next = head;
        curr = curr.next;
      }
      head = head.next;    
    }
    curr.next = head;
    return dummy.next;
  }
}
