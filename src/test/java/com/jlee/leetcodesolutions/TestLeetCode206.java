package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode206;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode206 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    LeetCode206 solution = new LeetCode206();
    ListNode result = solution.reverseList(head);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(1, result.next.next.val);
    Assert.assertNull(result.next.next.next);
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    LeetCode206 solution = new LeetCode206();
    ListNode result = solution.reverseList(head);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertNull(result.next.next);
  }

  @Test
  public void testProblemCase3() {
    ListNode head = new ListNode(1);
    LeetCode206 solution = new LeetCode206();
    ListNode result = solution.reverseList(head);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.next);
  }

  @Test
  public void testProblemCase4() {
    ListNode head = null;
    LeetCode206 solution = new LeetCode206();
    ListNode result = solution.reverseList(head);
    Assert.assertNull(result);
  } 
}
