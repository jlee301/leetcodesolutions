package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode541;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode541 {
  @Test
  public void testProblemCase1() {
    String s = "abcdefg";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfeg", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase2() {
    String s = "abcdefgh";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfegh", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase3() {
    String s = "abcdef";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfe", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase4() {
    String s = "abcde";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacde", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase5() {
    String s = "abc";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bac", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase6() {
    String s = "ab";
    int k = 4;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("ba", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase7() {
    String s = "abcdefg";
    int k = 1;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("abcdefg", solution.reverseStr(s, k));
  }

  @Test
  public void testProblemCase8() {
    String s = "";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("", solution.reverseStr(s, k));
  }
}
