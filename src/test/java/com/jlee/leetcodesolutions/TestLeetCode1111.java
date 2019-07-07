package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1111;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1111 {
  @Test
  public void testProblemCase1() {
    String seq = "(()())";
    LeetCode1111 solution = new LeetCode1111();
    Assert.assertArrayEquals(new int[] {0,1,1,1,1,0}, solution.maxDepthAfterSplit(seq));
  }

  @Test
  public void testProblemCase2() {
    String seq = "()(())()";
    LeetCode1111 solution = new LeetCode1111();
    Assert.assertArrayEquals(new int[] {0,0,0,1,1,0,0,0}, solution.maxDepthAfterSplit(seq));
  }
}
