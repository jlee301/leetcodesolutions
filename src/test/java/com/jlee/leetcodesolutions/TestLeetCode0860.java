package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0860;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0860 {
  @Test
  public void testProblemCase1() {
    // Input: [5,5,5,10,20]
    // Output: true
    int[] bills = {5,5,5,10,20};
    LeetCode0860 solution = new LeetCode0860();
    Assert.assertTrue(solution.lemonadeChange(bills));
  }

  @Test
  public void testProblemCase2() {
    // Input: [5,5,10]
    // Output: true
    int[] bills = {5,5,10};
    LeetCode0860 solution = new LeetCode0860();
    Assert.assertTrue(solution.lemonadeChange(bills));
  }

  @Test
  public void testProblemCase3() {
    // Input: [10,10]
    // Output: false
    int[] bills = {10,10};
    LeetCode0860 solution = new LeetCode0860();
    Assert.assertFalse(solution.lemonadeChange(bills));
  }

  @Test
  public void testProblemCase4() {
    // Input: [5,5,10,10,20]
    // Output: false
    int[] bills = {5,5,10,10,20};
    LeetCode0860 solution = new LeetCode0860();
    Assert.assertFalse(solution.lemonadeChange(bills));
  }
}
