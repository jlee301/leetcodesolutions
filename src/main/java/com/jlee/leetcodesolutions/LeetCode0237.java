package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0237 {
  /*
   * Write a function to delete a node (except the tail) in a singly linked list,
   * given only access to that node.
   * 
   * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node
   * with value 3, the linked list should become 1 -> 2 -> 4 after calling your
   * function.
   * 
   * https://leetcode.com/problems/delete-node-in-a-linked-list/description/
   */
  public void deleteNode(ListNode node) {
    ListNode prev = null;
    while(node.next != null) {
      node.val = node.next.val;
      prev = node;
      node = node.next;
    }
    prev.next = node.next;
  }
}
