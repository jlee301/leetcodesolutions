package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode203 {
  /*
   * Remove all elements from a linked list of integers that have value val.
   * 
   * Input: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
   * Output: 1 --> 2 --> 3 --> 4 --> 5
   * 
   * https://leetcode.com/problems/remove-linked-list-elements/description/
   */
  public ListNode removeElements(ListNode head, int val) {
    if(head == null)
      return null;
    
    head.next = removeElements(head.next, val);
    if (head.val == val)
      return head.next;
    else
      return head;
  }
}
