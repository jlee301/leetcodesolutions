package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode696;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode696 {
  @Test
  public void testProblemCase1() {
    String s = "00110011";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(6, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "10101";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(4, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "001110011";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(6, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "00000000001111111111";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(10, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "0000000000111111111";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(9, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "11111";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "1";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }
}
