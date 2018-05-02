package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode725;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode725 {
  @Test
  public void testProblemCase1() {
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    int k = 5;
    LeetCode725 solution = new LeetCode725();
    ListNode[] result = solution.splitListToParts(root, k);
    Assert.assertEquals(1, result[0].val);
    Assert.assertNull(result[0].next);
    Assert.assertEquals(2, result[1].val);
    Assert.assertNull(result[1].next);
    Assert.assertEquals(3, result[2].val);
    Assert.assertNull(result[2].next);
    Assert.assertNull(result[3]);
    Assert.assertNull(result[4]);
  }

  @Test
  public void testProblemCase2() {
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
    root.next.next.next.next.next = new ListNode(6);
    root.next.next.next.next.next.next = new ListNode(7);
    root.next.next.next.next.next.next.next = new ListNode(8);
    root.next.next.next.next.next.next.next.next = new ListNode(9);
    root.next.next.next.next.next.next.next.next.next = new ListNode(10);
    int k = 3;
    LeetCode725 solution = new LeetCode725();
    ListNode[] result = solution.splitListToParts(root, k);
    Assert.assertEquals(1, result[0].val);
    Assert.assertEquals(2, result[0].next.val);
    Assert.assertEquals(3, result[0].next.next.val);
    Assert.assertEquals(4, result[0].next.next.next.val);
    Assert.assertNull(result[0].next.next.next.next);
    Assert.assertEquals(5, result[1].val);
    Assert.assertEquals(6, result[1].next.val);
    Assert.assertEquals(7, result[1].next.next.val);
    Assert.assertNull(result[1].next.next.next);
    Assert.assertEquals(8, result[2].val);
    Assert.assertEquals(9, result[2].next.val);
    Assert.assertEquals(10, result[2].next.next.val);
    Assert.assertNull(result[2].next.next.next);
  }

  @Test
  public void testListIsNull() {
    ListNode root = null;
    int k = 3;
    LeetCode725 solution = new LeetCode725();
    ListNode[] result = solution.splitListToParts(root, k);
    Assert.assertNull(result[0]);
    Assert.assertNull(result[1]);
    Assert.assertNull(result[2]);
  }
}
