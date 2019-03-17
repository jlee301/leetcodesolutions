package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0109 {
  /*
   * Given a singly linked list where elements are sorted in ascending order,
   * convert it to a height balanced BST.
   * 
   * For this problem, a height-balanced binary tree is defined as a binary tree
   * in which the depth of the two subtrees of every node never differ by more
   * than 1.
   * 
   * Example:
   * Given the sorted linked list: [-10,-3,0,5,9],
   * 
   * One possible answer is: [0,-3,9,-10,null,5], which represents the following
   * height balanced BST:
   *      0 
   *     / \ 
   *   -3   9 
   *   /   / 
   * -10  5
   * 
   * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
   */
  public TreeNode sortedListToBST(ListNode head) {
    if(head == null) 
      return null;
    
    List<Integer> list = new ArrayList<>();
    while(head != null) {
      list.add(head.val);
      head = head.next;
    }
    return buildTree(list, 0, list.size()-1);
  }
  
  private TreeNode buildTree(List<Integer> list, int start, int end) {
    if(start > end)
      return null;
    
    int mid = start + (end - start) / 2;
    TreeNode node = new TreeNode(list.get(mid));
    node.left = buildTree(list, start, mid-1);
    node.right = buildTree(list, mid+1, end);
    return node;
  }
}
