package com.jlee.leetcodesolutions;

public class LeetCode430 {
  /*
   * You are given a doubly linked list which in addition to the next and previous
   * pointers, it could have a child pointer, which may or may not point to a
   * separate doubly linked list. These child lists may have one or more children
   * of their own, and so on, to produce a multilevel data structure, as shown in
   * the example below.
   * 
   * Flatten the list so that all the nodes appear in a single-level, doubly
   * linked list. You are given the head of the first level of the list.
   * 
   * https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
   */
  public Node flatten(Node head) {
    Node dummy = new Node(0, null, null, null);
    Node curr = dummy;
    Node prev = null;
    while(head != null) {
      curr.next = head;
      curr = curr.next;
      curr.prev = prev;
      
      if(head.child != null) {
        Node next = head.next;
        // Flatten the child, then attached to curr node
        Node child = flatten(head.child);
        curr.next = child;
        child.prev = curr;
        
        // Advance to the last node of the flatten child
        while(curr.next != null)
          curr = curr.next;
        
        prev = curr;
        head.child = null;
        head = next;
      }
      else {
        prev = head;
        head = head.next;
      }
    }
    return dummy.next;
  }
  
  public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
  }
}
