package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0709;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0709 {
  @Test
  public void testProblemCase1() {
    String str = "Hello";
    LeetCode0709 solution = new LeetCode0709();
    Assert.assertEquals("hello", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase2() {
    String str = "here";
    LeetCode0709 solution = new LeetCode0709();
    Assert.assertEquals("here", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase3() {
    String str = "LOVELY";
    LeetCode0709 solution = new LeetCode0709();
    Assert.assertEquals("lovely", solution.toLowerCase(str));
  }

  @Test
  public void testProblemCase5() {
    String str = "!LOVELY^";
    LeetCode0709 solution = new LeetCode0709();
    Assert.assertEquals("!lovely^", solution.toLowerCase(str));
  }
}
