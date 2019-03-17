package com.jlee.leetcodesolutions;

public class LeetCode0707 {
  private ListNode node;
  private int size;
  
  /** Initialize your data structure here. */
  public LeetCode0707() {
    node = new ListNode(0);      
    size = 0;
  }
    
  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {
    if(index >= size)
      return -1;
    
    ListNode curr = node;
    for(int i = 0; i < index; i++)
      curr = curr.next;
    
    return curr.next.val;
  }
    
  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {
    ListNode next = node.next;
    ListNode head = new ListNode(val);
    head.next = next;
    node.next = head;
    size++;
  }
    
  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    ListNode curr = node;
    while(curr.next != null)
      curr = curr.next;
    
    curr.next = new ListNode(val);
    size++;
  }
    
  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {
    if(index > size)
      return;
    
    ListNode curr = node;
    for(int i = 0; i < index; i++)
      curr = curr.next;
    
    ListNode next = curr.next;
    ListNode insertNode = new ListNode(val);
    insertNode.next = next;
    curr.next = insertNode;
    size++;
  }
    
  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    if(index >= size)
      return;
    
    ListNode curr = node;
    for(int i = 0; i < index; i++)
      curr = curr.next;
    
    curr.next = curr.next.next;
    size--;
  }
}
