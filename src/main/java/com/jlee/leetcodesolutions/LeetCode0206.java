package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0206 {
  /*
   * Reverse a singly linked list.
   * 
   * Input: 1 -> 2 -> 3
   * Output: 3 -> 2 -> 1
   * 
   * https://leetcode.com/problems/reverse-linked-list/description/
   */
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while(head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}
