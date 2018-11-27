package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode058;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode058 {
  @Test
  public void testProblemCase1() {
    LeetCode058 solution = new LeetCode058();
    String s = "Hello World";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode058 solution = new LeetCode058();
    String s = "Hello";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode058 solution = new LeetCode058();
    String s = "   Hello   Wor    ";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode058 solution = new LeetCode058();
    String s = " ";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode058 solution = new LeetCode058();
    String s = "";
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode058 solution = new LeetCode058();
    String s = null;
    int result = solution.lengthOfLastWord(s);
    Assert.assertEquals(0, result);
  }
}
