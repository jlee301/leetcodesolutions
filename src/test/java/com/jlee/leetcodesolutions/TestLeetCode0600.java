package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0600;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0600 {
  @Test
  public void testProblemCase1() {
    // Input: 1
    // Output: 2
    int num = 1;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(2, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase2() {
    // Input: 2
    // Output: 3
    int num = 2;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(3, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase3() {
    // Input: 3
    // Output: 3
    int num = 3;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(3, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase4() {
    // Input: 4
    // Output: 4
    int num = 4;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(4, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase5() {
    // Input: 5
    // Output: 5
    int num = 5;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(5, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase6() {
    // Input: 6
    // Output: 5
    int num = 6;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(5, solution.findIntegers(num));
  }

  @Test
  public void testProblemCase7() {
    // Input: 7
    // Output: 5
    int num = 7;
    LeetCode0600 solution = new LeetCode0600();
    Assert.assertEquals(5, solution.findIntegers(num));
  }
}
