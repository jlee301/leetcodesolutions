package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode002 {
  /*
   * You are given two non-empty linked lists representing two non-negative
   * integers. The digits are stored in reverse order and each of their nodes
   * contain a single digit. Add the two numbers and return it as a linked list.
   * 
   * You may assume the two numbers do not contain any leading zero, except the
   * number 0 itself.
   * 
   * Example
   * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
   * Output: 7 -> 0 -> 8
   * Explanation: 342 + 465 = 807.
   * 
   * https://leetcode.com/problems/add-two-numbers/description/
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if(l1 == null || l2 == null)
      return null;
    
    ListNode dummy = new ListNode(0), current = dummy;
    int carry = 0;
    while(l1 != null || l2 != null) {
      int a = 0, b = 0;
      if(l1 != null)
        a = l1.val;
      if(l2 != null)
        b = l2.val;
      
      int sum = a + b + carry;
      carry = sum / 10;
      current.next = new ListNode(sum % 10);
      current = current.next;

      if(l1 != null)
        l1 = l1.next;
      if(l2 != null)
        l2 = l2.next;
    }
    if(carry > 0)
      current.next = new ListNode(carry);
    
    return dummy.next;
  }  
}
