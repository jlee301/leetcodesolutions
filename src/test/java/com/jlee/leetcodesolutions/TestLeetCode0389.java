package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0389;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0389 {
  @Test
  public void testProblemCase1() {
    String s = "abcd";
    String t = "eabcd";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "abcd";
    String t = "aebcd";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase3() {
    String s = "abcd";
    String t = "abecd";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase4() {
    String s = "abcd";
    String t = "abced";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase5() {
    String s = "abcd";
    String t = "abcde";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase6() {
    String s = "abcd";
    String t = "abcd";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase7() {
    String s = "";
    String t = "e";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase8() {
    String s = "abcd";
    String t = "";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }

  @Test
  public void testProblemCase9() {
    String s = "";
    String t = "";
    LeetCode0389 solution = new LeetCode0389();
    Assert.assertEquals(0, solution.findTheDifference(s, t));
  }
}
