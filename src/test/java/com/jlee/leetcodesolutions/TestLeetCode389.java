package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode389;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode389 {
  @Test
  public void testProblemCase1() {
    String s = "abcd";
    String t = "eabcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "abcd";
    String t = "aebcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase3() {
    String s = "abcd";
    String t = "abecd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase4() {
    String s = "abcd";
    String t = "abced";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase5() {
    String s = "abcd";
    String t = "abcde";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase6() {
    String s = "abcd";
    String t = "abcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase7() {
    String s = "";
    String t = "e";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase8() {
    String s = "abcd";
    String t = "";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase9() {
    String s = "";
    String t = "";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }
}
