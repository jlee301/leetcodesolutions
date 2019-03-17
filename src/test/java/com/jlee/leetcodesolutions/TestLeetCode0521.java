package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0521;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0521 {
  @Test
  public void testProblemCase1() {
    String a = "abc";
    String b = "abc";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase2() {
    String a = "abcd";
    String b = "abc";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(4, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase3() {
    String a = "abc";
    String b = "abcd";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(4, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase4() {
    String a = "abcabc";
    String b = "abc";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(6, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase5() {
    String a = "abc";
    String b = "abcabc";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(6, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase6() {
    String a = "abc";
    String b = "def";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase7() {
    String a = "";
    String b = "abc";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase8() {
    String a = "abc";
    String b = "";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testProblemCase9() {
    String a = "";
    String b = "";
    LeetCode0521 solution = new LeetCode0521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }
}
