package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode237 {
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
    if(node == null || node.next == null)
      return;
    
    // Since we cannot modify the nodes before or after, then the previous node will
    // still be pointing at the one that needs to be "removed". Therefore you need
    // to:
    // 1. Copy the value of the next node
    // 2. Copy the next reference of the next node
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
