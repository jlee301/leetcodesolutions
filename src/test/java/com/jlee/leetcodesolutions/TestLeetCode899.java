package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode899;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode899 {
  @Test
  public void testProblemCase1() {
    String S = "cba";
    int K = 1;
    LeetCode899 solution = new LeetCode899();
    Assert.assertEquals("acb", solution.orderlyQueue(S, K));
  }

  @Test
  public void testProblemCase2() {
    String S = "baaca";
    int K = 3;
    LeetCode899 solution = new LeetCode899();
    Assert.assertEquals("aaabc", solution.orderlyQueue(S, K));
  }
}
