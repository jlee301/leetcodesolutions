package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode866;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode866 {
  @Test
  public void testProblemCase1() {
    // Input: 6
    // Output: 7
    int N = 6;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(7, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase2() {
    // Input: 8
    // Output: 11
    int N = 8;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(11, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase3() {
    // Input: 13
    // Output: 101
    int N = 13;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(101, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase4() {
    // Input: 11
    // Output: 11
    int N = 11;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(11, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase5() {
    // Input: 1
    // Output: 2
    int N = 1;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(2, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase6() {
    // Input: 303
    // Output: 2
    int N = 303;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(313, solution.primePalindrome(N));
  }

  @Test
  public void testProblemCase7() {
    // Input: 199999991
    // Output: -1
    int N = 199999992;
    LeetCode866 solution = new LeetCode866();
    Assert.assertEquals(-1, solution.primePalindrome(N));
  }
}
