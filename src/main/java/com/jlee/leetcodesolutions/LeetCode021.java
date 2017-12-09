package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode021 {
  /*
   * Merge two sorted linked lists and return it as a new list. The new list
   * should be made by splicing together the nodes of the first two lists.
   * 
   * Input: 1->2->4, 1->3->4 
   * Output: 1->1->2->3->4->4
   * 
   * https://leetcode.com/problems/merge-two-sorted-lists/description/
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      // If for some reason both linked lists are null
      return null;
    } else if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }

    ListNode mergedResult;
    // Set lowest value linked list as the mergedResult
    // Then set mergedResult.next to next set of linked lists
    if (l1.val < l2.val) {
      // System.out.println("l1 value: " + l1.val);
      // System.out.println("l2 value: " + l2.val);
      mergedResult = l1;
      mergedResult.next = mergeTwoLists(l1.next, l2);
    } else {
      // System.out.println("l1 value: " + l1.val);
      // System.out.println("l2 value: " + l2.val);
      mergedResult = l2;
      mergedResult.next = mergeTwoLists(l1, l2.next);
    }
    return mergedResult;
  }
}