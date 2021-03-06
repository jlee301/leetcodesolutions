package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0142;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0142 {
  @Test
  public void testThreeNodeCycle() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = head.next;
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycle(head);
    Assert.assertEquals(head.next, node);
    Assert.assertEquals(head.next.val, node.val);
  }

  @Test
  public void testThreeNodeNoCycle() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycle(head);
    Assert.assertNull(node);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycle(head);
    Assert.assertNull(node);
  }

  @Test
  public void testThreeNodeCycleNoExtraSpace() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = head.next;
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycleNoExtraSpace(head);
    Assert.assertEquals(head.next, node);
    Assert.assertEquals(head.next.val, node.val);
  }

  @Test
  public void testThreeNodeNoCycleNoExtraSpace() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycleNoExtraSpace(head);
    Assert.assertNull(node);
  }

  @Test
  public void testNullNoExtraSpace() {
    ListNode head = null;
    LeetCode0142 solution = new LeetCode0142();
    ListNode node = solution.detectCycleNoExtraSpace(head);
    Assert.assertNull(node);
  }
}
