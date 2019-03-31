package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1030;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1030 {
  @Test
  public void testProblemCase1() {
    // 2,1,5
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    head.next.next = new ListNode(5);

    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[] {5,5,0}, solution.nextLargerNodes(head));
  }

  @Test
  public void testProblemCase2() {
    // 2,7,4,3,5
    ListNode head = new ListNode(2);
    head.next = new ListNode(7);
    head.next.next = new ListNode(4);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(5);

    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[] {7,0,5,5,0}, solution.nextLargerNodes(head));
  }

  @Test
  public void testProblemCase3() {
    // 1,7,5,1,9,2,5,1
    ListNode head = new ListNode(1);
    head.next = new ListNode(7);
    head.next.next = new ListNode(5);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next.next.next = new ListNode(1);

    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[] {7,9,9,9,0,5,0,0}, solution.nextLargerNodes(head));
  }

  @Test
  public void testProblemCase4() {
    // 5,4,3,2,1
    ListNode head = new ListNode(5);
    head.next = new ListNode(4);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);

    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, solution.nextLargerNodes(head));
  }
}
