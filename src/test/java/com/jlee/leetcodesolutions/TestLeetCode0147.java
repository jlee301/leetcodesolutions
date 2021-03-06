package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0147;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0147 {
  @Test
  public void testOneNodes() {
    ListNode head = new ListNode(3);
    LeetCode0147 solution = new LeetCode0147();
    ListNode result = solution.insertionSortList(head);
    Assert.assertEquals(3, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testTwoNodes() {
    ListNode head = new ListNode(3);
    head.next = new ListNode(1);
    LeetCode0147 solution = new LeetCode0147();
    ListNode result = solution.insertionSortList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void testThreeNodes() {
    ListNode head = new ListNode(3);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    LeetCode0147 solution = new LeetCode0147();
    ListNode result = solution.insertionSortList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }
  
  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0147 solution = new LeetCode0147();
    ListNode result = solution.insertionSortList(head);
    Assert.assertNull(result);
  }
}
