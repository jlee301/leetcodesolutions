package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0082;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0082 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next.next = new ListNode(5);
    LeetCode0082 solution = new LeetCode0082();
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(5, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(3);
    LeetCode0082 solution = new LeetCode0082();
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void testOneNode() {
    ListNode head = new ListNode(1);
    LeetCode0082 solution = new LeetCode0082();
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0082 solution = new LeetCode0082();
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertNull(result);
  }
}
