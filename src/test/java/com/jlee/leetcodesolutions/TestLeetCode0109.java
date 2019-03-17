package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0109;
import com.jlee.leetcodesolutions.ListNode;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0109 {
  @Test
  public void testProblemCase() {
    ListNode head = new ListNode(-10);
    head.next = new ListNode(-3);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(5);
    head.next.next.next.next = new ListNode(9);
    LeetCode0109 solution = new LeetCode0109();
    TreeNode result = solution.sortedListToBST(head);
    Assert.assertEquals(0, result.val);
    Assert.assertEquals(-10, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertEquals(-3, result.left.right.val);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertEquals(5, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(9, result.right.right.val);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0109 solution = new LeetCode0109();
    TreeNode result = solution.sortedListToBST(head);
    Assert.assertNull(result);
  }
}
