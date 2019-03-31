package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode1030 {
  /*
   * https://leetcode.com/contest/weekly-contest-130/problems/next-greater-node-in-linked-list/
   */
  public int[] nextLargerNodes(ListNode head) {
    // Correlate an index position with the value
    HashMap<Integer,Integer> map = new HashMap<>();
    int idx = 0;
    while(head != null) {
      map.put(idx++, head.val);
      head = head.next;
    }
    
    int[] result = new int[map.size()];
    // Now we use a stack to keep track of the index position we need to write to
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < map.size(); i++) {
      while(!stack.isEmpty() && map.get(stack.peek()) < map.get(i))
        result[stack.pop()] = map.get(i);
      
      stack.push(i);
    }
    return result;
  }
}
