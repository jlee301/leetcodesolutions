package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.PriorityQueue;

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
    
    // Dump all values into queue
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i = 0; i < lists.length; i++) {
      while(lists[i] != null) {
        pq.add(lists[i].val);
        lists[i] = lists[i].next;
      }
    }
    
    // Now that queue is sorted, we can reconstruct in order
    while(!pq.isEmpty()) {
      curr.next = new ListNode(pq.poll());
      curr = curr.next;
    }  
    return dummy.next;
  }
}
