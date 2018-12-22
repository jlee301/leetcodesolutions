package com.jlee.leetcodesolutions;

public class LeetCode706 {
  /*
   * Design a HashMap without using any built-in hash table libraries.
   * 
   * https://leetcode.com/problems/design-hashmap/
   */
  public class Node {
    public int key;
    public int val;
    public Node next;
    
    public Node(int k, int v) {
      key = k;
      val = v;
    }
  }
  
  private Node[] nodes;
  private static final int bucket = 10000;
  
  /** Initialize your data structure here. */
  public LeetCode706() {
    nodes = new Node[bucket];
    for(int i = 0; i < bucket; i++)
      nodes[i] = new Node(-1, -1);
  }
    
  /** value will always be non-negative. */
  public void put(int key, int value) {
    int index = key % bucket;
    Node curr = nodes[index];
    while(curr.next != null && curr.next.key != key)
      curr = curr.next;
    
    if(curr.next != null) {
      curr.next.val = value;
      return;
    }
    
    curr.next = new Node(key, value);
  }
    
  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
    int index = key % bucket;
    Node curr = nodes[index];
    while(curr.next != null && curr.next.key != key)
      curr = curr.next;
    
    return curr.next != null ? curr.next.val : -1;
  }
    
  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    int index = key % bucket;
    Node curr = nodes[index];
    while(curr.next != null && curr.next.key != key)
      curr = curr.next;
    
    if(curr.next != null)
      curr.next = curr.next.next;
  }
}
