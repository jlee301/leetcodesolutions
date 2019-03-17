package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0817;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0817 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(0);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    int[] G = {0, 1, 3};
    LeetCode0817 solution = new LeetCode0817();
    Assert.assertEquals(2, solution.numComponents(head, G));
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(0);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    int[] G = {0, 3, 1, 4};
    LeetCode0817 solution = new LeetCode0817();
    Assert.assertEquals(2, solution.numComponents(head, G));
  }

  @Test
  public void testNotInTheSet() {
    ListNode head = new ListNode(0);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    int[] G = {4};
    LeetCode0817 solution = new LeetCode0817();
    Assert.assertEquals(1, solution.numComponents(head, G));
  }

  @Test
  public void testWrongAns() {
    ListNode head = new ListNode(0);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    int[] G = {0, 2};
    LeetCode0817 solution = new LeetCode0817();
    Assert.assertEquals(2, solution.numComponents(head, G));
  }

  @Test
  public void testWrongAns2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(3);
    int[] G = {3,4,0,2,1};
    LeetCode0817 solution = new LeetCode0817();
    Assert.assertEquals(1, solution.numComponents(head, G));
  }
}
