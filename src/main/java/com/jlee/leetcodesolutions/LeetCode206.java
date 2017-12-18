package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode206 {
  /*
   * Reverse a singly linked list.
   * 
   * Input: 1 -> 2 -> 3
   * Output: 3 -> 2 -> 1
   * 
   * https://leetcode.com/problems/reverse-linked-list/description/
   */
  public ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode previous = null;
    
    while(current != null) {
      // Temporarily save the next node as you will be changing it
      ListNode tempNext = current.next;
      
      // Replace next node reference with previous
      current.next = previous;
      
      // Iterate for next loop
      previous = current;
      current = tempNext;
    }
    return previous;
  }
  
  public ListNode reverseListRecursively(ListNode head) {
    if (head == null || head.next == null) 
      return head;
    // 1 --> 2 --> 3
    ListNode p = reverseListRecursively(head.next);
    // This traverses to the end and you first have:
    // head = 2 --> 3 --> null, p = 3 --> null, 
    //
    // So when setting head.next.next = head
    // head = 2 --> 3 --> 2 --> 3 (cycle), p = 3 --> 2 --> 3 --> 2 (cycle)
    //
    // So we set head.next = null to remove the cycle and p to be returned
    // head = 2 --> null, p = 3 --> 2 --> null
    head.next.next = head;
    head.next = null;
    return p;
  }
}
