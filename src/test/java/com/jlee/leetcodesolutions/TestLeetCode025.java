package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode025;
import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode025 {
  @Test
  public void testProblemCase1() {
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     head.next.next.next.next = new ListNode(5);
     int k = 2;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertEquals(2, result.val);
     Assert.assertEquals(1, result.next.val);
     Assert.assertEquals(4, result.next.next.val);
     Assert.assertEquals(3, result.next.next.next.val);
     Assert.assertEquals(5, result.next.next.next.next.val);
     Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCase2() {
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     head.next.next.next.next = new ListNode(5);
     int k = 3;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertEquals(3, result.val);
     Assert.assertEquals(2, result.next.val);
     Assert.assertEquals(1, result.next.next.val);
     Assert.assertEquals(4, result.next.next.next.val);
     Assert.assertEquals(5, result.next.next.next.next.val);
     Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCase3() {
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     head.next.next.next.next = new ListNode(5);
     int k = 1;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertEquals(1, result.val);
     Assert.assertEquals(2, result.next.val);
     Assert.assertEquals(3, result.next.next.val);
     Assert.assertEquals(4, result.next.next.next.val);
     Assert.assertEquals(5, result.next.next.next.next.val);
     Assert.assertNull(result.next.next.next.next.next);
  }

  @Test
  public void testProblemCase4() {
     ListNode head = null;
     int k = 2;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertNull(result);
  }

  @Test
  public void testProblemCase5() {
     ListNode head = new ListNode(1);
     int k = 2;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertEquals(1, result.val);
     Assert.assertNull(result.next);
  }

  @Test
  public void testProblemCase6() {
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     int k = 2;
     
     LeetCode025 solution = new LeetCode025();
     ListNode result = solution.reverseKGroup(head, k);
     Assert.assertEquals(2, result.val);
     Assert.assertEquals(1, result.next.val);
     Assert.assertNull(result.next.next);
  }
}
