package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0725 {
  /*
   * Given a (singly) linked list with head node root, write a function to split
   * the linked list into k consecutive linked list "parts".
   * 
   * The length of each part should be as equal as possible: no two parts should
   * have a size differing by more than 1. This may lead to some parts being null.
   * 
   * The parts should be in order of occurrence in the input list, and parts
   * occurring earlier should always have a size greater than or equal parts
   * occurring later.
   * 
   * Return a List of ListNode's representing the linked list parts that are
   * formed.
   * 
   * Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
   * 
   * https://leetcode.com/problems/split-linked-list-in-parts/description/
   */
  public ListNode[] splitListToParts(ListNode root, int k) {
    ListNode[] result = new ListNode[k];
    
    // Find the length of the ListNode
    ListNode curr = root;
    int len = 0;
    while(curr != null) {
      curr = curr.next;
      len++;
    }
    
    // Now calculate the size of each "part"
    // The remainder is the first ith parts will have 1 additional node
    int remainder = len % k;
    int size = len / k;
    curr = root;
    
    for(int i = 0; i < k; i++) {
      ListNode dummy = new ListNode(0);
      ListNode write = dummy;
      // We want to fill the first ith parts up to the remainder with size+1 nodes
      for(int j = 0; j < size + (i < remainder ? 1 : 0); j++) {
        write.next = new ListNode(curr.val);
        write = write.next;
        curr = curr.next;
      }
      result[i] = dummy.next;
    }
    return result;
  }
}
