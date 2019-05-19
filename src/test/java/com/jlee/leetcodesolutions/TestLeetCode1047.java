package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1047;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1047 {
  @Test
  public void testProblemCase1() {
    String S = "abbaca";
    LeetCode1047 solution = new LeetCode1047();
    Assert.assertEquals("ca", solution.removeDuplicates(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "aa";
    LeetCode1047 solution = new LeetCode1047();
    Assert.assertEquals("", solution.removeDuplicates(S));
  }
}
