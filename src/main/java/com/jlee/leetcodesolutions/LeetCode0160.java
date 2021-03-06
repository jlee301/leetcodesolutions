package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode0160 {
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
    
    ListNode currA = headA;
    ListNode currB = headB;
    ListNode last = null;
    while(currA != currB) {
      // Advance A
      if(currA.next == null) {
        if(last == null) {
          // currA reached end first
          last = currA;
        }
        else {
          // currB reached end first
          if(currA != last) {
            // They do not intersect
            return null;
          }
        }
        currA = headB;
      }
      else
        currA = currA.next;
      
      // Advance B
      if(currB.next == null) {
        if(last == null) {
          // currB reached end first
          last = currB;
        }
        else {
          // currA reached end first
          if(currB != last) {
            // They do not intersect
            return null;
          }
        }
        currB = headA;
      }
      else
        currB = currB.next;
    }
    return currA;
  } 
}
