package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.HashSet;

public class LeetCode0817 {
  /*
   * We are given head, the head node of a linked list containing unique integer
   * values.
   * 
   * We are also given the list G, a subset of the values in the linked list.
   * 
   * Return the number of connected components in G, where two values are
   * connected if they appear consecutively in the linked list.
   * 
   * Note:
   * 1. If N is the length of the linked list given by head, 1 <= N <= 10000.
   * 2. The value of each node in the linked list will be in the range [0, N - 1].
   * 3. 1 <= G.length <= 10000.
   * 4. G is a subset of all values in the linked list.
   */
  public int numComponents(ListNode head, int[] G) {
    HashSet<Integer> set = new HashSet<>();
    for(int num : G)
      set.add(num);
    
    int count = 0;
    ListNode prev = null;
    while(head != null) {
      // If prev is set, it means we are still continuing to search consecutively
      // connected components
      if(prev != null) {
        if(set.contains(head.val))
          // So if head.val is in the set, continue searching consecutive connected
          // components
          prev = head;
        else
          // If head.val is not in the set, set prev to null so the next head.val that is
          // in the set will increment the count of connected components
          prev = null;
      } else {
        // Only time we increment the count is when prev == null && head.val is in the
        // set
        if(set.contains(head.val)) {
          count++;
          prev = head;
        }
      }
      head = head.next;
    }
    return count;  
  }
}
