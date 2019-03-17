package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0058;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0058 {
  @Test
  public void testProblemCase1() {
    LeetCode0058 solution = new LeetCode0058();
    String s = "Hello World";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0058 solution = new LeetCode0058();
    String s = "Hello";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0058 solution = new LeetCode0058();
    String s = "   Hello   Wor    ";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0058 solution = new LeetCode0058();
    String s = " ";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0058 solution = new LeetCode0058();
    String s = "";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0058 solution = new LeetCode0058();
    String s = null;
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }
}
