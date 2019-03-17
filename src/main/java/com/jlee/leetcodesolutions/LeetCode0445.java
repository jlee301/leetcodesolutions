package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.Stack;

public class LeetCode0445 {
  /*
   * You are given two non-empty linked lists representing two non-negative
   * integers. The most significant digit comes first and each of their nodes
   * contain a single digit. Add the two numbers and return it as a linked list.
   * 
   * You may assume the two numbers do not contain any leading zero, except the
   * number 0 itself.
   * 
   * Follow up:
   * What if you cannot modify the input lists? In other words, reversing the
   * lists is not allowed.
   * 
   * Example:
   * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
   * Output: 7 -> 8 -> 0 -> 7
   * 
   * https://leetcode.com/problems/add-two-numbers-ii/description/
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    Stack<Integer> num1 = new Stack<>();
    Stack<Integer> num2 = new Stack<>();
    // Populate l1 into stack
    while(l1 != null) {
      num1.add(l1.val);
      l1 = l1.next;
    }
    // Populate l2 into stack
    while(l2 != null) {
      num2.add(l2.val);
      l2 = l2.next;
    }
    
    int carry = 0;
    ListNode result = new ListNode(0);
    // Keep adding numbers until one of the stacks is empty
    while(!num1.isEmpty() && !num2.isEmpty()) {
      int temp = num1.pop() + num2.pop() + carry;
      carry = temp / 10;
      ListNode node = new ListNode(temp % 10);
      node.next = result.next;
      result.next = node;
    }
    
    // Assuming num2 is empty
    while(!num1.isEmpty()) {
      int temp = num1.pop() + carry;
      carry = temp / 10;
      ListNode node = new ListNode(temp % 10);
      node.next = result.next;
      result.next = node;
    }

    // Assuming num1 is empty
    while(!num2.isEmpty()) {
      int temp = num2.pop() + carry;
      carry = temp / 10;
      ListNode node = new ListNode(temp % 10);
      node.next = result.next;
      result.next = node;
    }
    
    // If there is any leftover carries
    if(carry != 0) {
      ListNode node = new ListNode(carry);
      node.next = result.next;
      result.next = node;
    }
    return result.next;
  }
}
