package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode141;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode141 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = head.next;

    LeetCode141 solution = new LeetCode141();
    boolean result = solution.hasCycle(head);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    LeetCode141 solution = new LeetCode141();
    boolean result = solution.hasCycle(head);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3() {
    ListNode head = new ListNode(1);

    LeetCode141 solution = new LeetCode141();
    boolean result = solution.hasCycle(head);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);

    LeetCode141 solution = new LeetCode141();
    boolean result = solution.hasCycle(head);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase5() {
    ListNode head = null;

    LeetCode141 solution = new LeetCode141();
    boolean result = solution.hasCycle(head);
    Assert.assertFalse(result);
  }
}
