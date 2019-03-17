package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0002;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0002 {
  @Test
  public void testProblemCase() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(7, result.val);
    Assert.assertEquals(0, result.next.val);
    Assert.assertEquals(8, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }
  
  @Test
  public void testUltimateCarry() {
    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(9);
    l2.next.next = new ListNode(9);
    l2.next.next.next = new ListNode(9);
    l2.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(0, result.val);
    Assert.assertEquals(0, result.next.val);
    Assert.assertEquals(0, result.next.next.val);
    Assert.assertEquals(0, result.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.next.val);
    Assert.assertEquals(1, result.next.next.next.next.next.next.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next.next.next.next.next.next.next);
  }
  
  @Test
  public void testUltimateCarryReversed() {
    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(9);
    l2.next.next = new ListNode(9);
    l2.next.next.next = new ListNode(9);
    l2.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next.next = new ListNode(9);
    l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l2, l1);
    Assert.assertEquals(0, result.val);
    Assert.assertEquals(0, result.next.val);
    Assert.assertEquals(0, result.next.next.val);
    Assert.assertEquals(0, result.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.val);
    Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.next.val);
    Assert.assertEquals(1, result.next.next.next.next.next.next.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next.next.next.next.next.next.next);
  }
  
  @Test
  public void testNullL1() {
    ListNode l1 = null;
    ListNode l2 = new ListNode(1);
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertNull(result);
  }

  @Test
  public void testNullL2() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = null;
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertNull(result);
  }

  @Test
  public void testNull() {
    ListNode l1 = null;
    ListNode l2 = null;
    LeetCode0002 solution = new LeetCode0002();
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertNull(result);
  }
}
