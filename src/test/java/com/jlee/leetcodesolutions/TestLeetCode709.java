package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode709;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode709 {
  @Test
  public void testProblemCase1() {
    String str = "Hello";
    LeetCode709 solution = new LeetCode709();
    Assert.assertEquals("hello", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase2() {
    String str = "here";
    LeetCode709 solution = new LeetCode709();
    Assert.assertEquals("here", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase3() {
    String str = "LOVELY";
    LeetCode709 solution = new LeetCode709();
    Assert.assertEquals("lovely", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase5() {
    String str = "!LOVELY^";
    LeetCode709 solution = new LeetCode709();
    Assert.assertEquals("!lovely^", solution.toLowerCase(str));
  }
}
