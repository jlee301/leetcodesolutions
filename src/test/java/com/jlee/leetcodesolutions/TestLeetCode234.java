package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode234 {
  @Test
  public void testFourNodePalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testFourNodeNotPalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testThreeNodePalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testThreeNodeNotPalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testTwoNodePalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testTwoNodeNotPalindrome() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindrome(head));
  }

  @Test
  public void testOneNodePalindrome() {
    ListNode head = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testThreeNodeNegPalindrome() {
    ListNode head = new ListNode(-1);
    head.next = new ListNode(-2);
    head.next.next = new ListNode(-1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testNull() {
    ListNode head = null;
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindrome(head));
  }

  @Test
  public void testFourNodePalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }

  @Test
  public void testFourNodeNotPalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindromeNoList(head));
  }

  @Test
  public void testThreeNodePalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }

  @Test
  public void testThreeNodeNotPalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindromeNoList(head));
  }

  @Test
  public void testTwoNodePalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }

  @Test
  public void testTwoNodeNotPalindromeNoList() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertFalse(solution.isPalindromeNoList(head));
  }

  @Test
  public void testOneNodePalindromeNoList() {
    ListNode head = new ListNode(1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }

  @Test
  public void testThreeNodeNegPalindromeNoList() {
    ListNode head = new ListNode(-1);
    head.next = new ListNode(-2);
    head.next.next = new ListNode(-1);
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }

  @Test
  public void testNullNoList() {
    ListNode head = null;
    
    LeetCode234 solution = new LeetCode234();
    Assert.assertTrue(solution.isPalindromeNoList(head));
  }
}
