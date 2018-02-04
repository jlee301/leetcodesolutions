package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode061;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode061 {
  @Test
  public void testProblemCaseK0() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 0;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 1;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 2;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(4, result.val);
    Assert.assertEquals(5, result.next.val);
    Assert.assertEquals(1, result.next.next.val);
    Assert.assertEquals(2, result.next.next.next.val);
    Assert.assertEquals(3, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 3;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(4, result.next.val);
    Assert.assertEquals(5, result.next.next.val);
    Assert.assertEquals(1, result.next.next.next.val);
    Assert.assertEquals(2, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 4;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertEquals(1, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK5() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 5;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK6() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 6;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK7() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 7;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(4, result.val);
    Assert.assertEquals(5, result.next.val);
    Assert.assertEquals(1, result.next.next.val);
    Assert.assertEquals(2, result.next.next.next.val);
    Assert.assertEquals(3, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK8() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 8;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(4, result.next.val);
    Assert.assertEquals(5, result.next.next.val);
    Assert.assertEquals(1, result.next.next.next.val);
    Assert.assertEquals(2, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK9() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 9;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(2, result.val);
    Assert.assertEquals(3, result.next.val);
    Assert.assertEquals(4, result.next.next.val);
    Assert.assertEquals(5, result.next.next.next.val);
    Assert.assertEquals(1, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCaseK10() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    int k = 10;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.next.val);
    Assert.assertEquals(3, result.next.next.val);
    Assert.assertEquals(4, result.next.next.next.val);
    Assert.assertEquals(5, result.next.next.next.next.val);
    Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testNull() {
    ListNode head = null;
    int k = 1;
    LeetCode061 solution = new LeetCode061();
    ListNode result = solution.rotateRight(head, k);
    Assert.assertNull(result);
  }
}
