package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import java.util.ArrayList;

public class LeetCode160 {
  /*
   * Write a program to find the node at which the intersection of two singly
   * linked lists begins.
   * 
   * For example, the following two linked lists:
   * A:          a1 → a2
   *                    ↘
   *                      c1 → c2 → c3
   *                    ↗
   * B:     b1 → b2 → b3
   * 
   * begin to intersect at node c1.
   * 
   * Notes:
   * If the two linked lists have no intersection at all, return null.
   * The linked lists must retain their original structure after the function returns.
   * You may assume there are no cycles anywhere in the entire linked structure.
   * Your code should preferably run in O(n) time and use only O(1) memory.
   * 
   * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
   */
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null)
      return null;
    
    ArrayList<ListNode> data = new ArrayList<ListNode>();
    ListNode point = headA;
    while(point != null) {
      // Store everything from the headA path into the List.
      data.add(point);
      point = point.next;
    }

    point = headB;
    while(point != null) {
      // Now traverse through headB path and see if it exist in the List.
      if(data.contains(point))
        return point;
      else
        point = point.next;
    }
    return null;
  }
}
