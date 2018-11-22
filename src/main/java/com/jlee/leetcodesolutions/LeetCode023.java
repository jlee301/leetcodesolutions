package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode023 {
  /*
   * Merge k sorted linked lists and return it as one sorted list. Analyze and
   * describe its complexity.
   * 
   * https://leetcode.com/problems/merge-k-sorted-lists/ 
   */
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    boolean complete = false;
    while(!complete) {
      int pos = 0;
      ListNode minNode = null;
      complete = true;
      for(int i = 0; i < lists.length; i++) {
        // Find smallest element of each list's head node
        if(lists[i] == null)
          continue;
        
        if(minNode == null || lists[i].val < minNode.val) {
          // Store the list index and element of smallest
          complete = false;
          pos = i;
          minNode = lists[i];
        }
      }
      if(!complete) {
        // Advance the smallest list and store into result
        curr.next = minNode;
        curr = curr.next;
        lists[pos] = lists[pos].next;
      }
    }
    return dummy.next;
  }
}
