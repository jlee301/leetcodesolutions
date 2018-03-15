package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode328;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode328 {
  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertNull(result);
  }

  @Test
  public void testOneNodes() {
    ListNode head = new ListNode(1);
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testTwoNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void testThreeNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testFourNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertNull(result.next.next.next.next);
  }

  @Test
  public void testFiveNodes() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    LeetCode328 solution = new LeetCode328();
    ListNode result = solution.oddEvenList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(5, result.next.next.val);
    Assert.assertEquals(2, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }
}
