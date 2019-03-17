package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0234 {
  @Test
  public void testProblemCase1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase5() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase6() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase7() {
    ListNode head = new ListNode(1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase8() {
    ListNode head = new ListNode(-1);
    head.next = new ListNode(-2);
    head.next.next = new ListNode(-1);
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testProblemCase9() {
    ListNode head = null;
    
    LeetCode0234 solution = new LeetCode0234();
    Assert.assertTrue(solution.isPalindrome(head));
  }
}
