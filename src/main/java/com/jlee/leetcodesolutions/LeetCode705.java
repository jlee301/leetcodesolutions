package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;

public class LeetCode705 {
  /*
   * Design a HashSet without using any built-in hash table libraries.
   * 
   * https://leetcode.com/problems/design-hashset/
   */
  private ListNode[] nodes;
  private static final int bucket = 10000;
  
  /** Initialize your data structure here. */
  public LeetCode705() {
    nodes = new ListNode[bucket];
    for(int i = 0; i < bucket; i++)
      nodes[i] = new ListNode(-1);
  }
    
  public void add(int key) {
    // Determine which index bucket we are inserting the key
    int index = key % bucket;

    // Check to see if the key exist
    ListNode curr = nodes[index];    
    while(curr.next != null && curr.next.val != key)
      curr = curr.next;
    
    // The key is already an entry
    if(curr.next != null)
      return;
    
    curr.next = new ListNode(key);
  }
    
  public void remove(int key) {
    // Determine which index bucket the key belongs in
    int index = key % bucket;
    
    // Check to see if the key exist
    ListNode curr = nodes[index];
    while(curr.next != null && curr.next.val != key)
      curr = curr.next;
    
    // The key exist
    if(curr.next != null)
      curr.next = curr.next.next;
  }
    
  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    // Determine which index bucket we are inserting the key
    int index = key % bucket;
    
    // Check to see if the key exist
    ListNode curr = nodes[index];
    while(curr.next != null && curr.next.val != key)
      curr = curr.next;
    
    return curr.next != null;
  }
}
