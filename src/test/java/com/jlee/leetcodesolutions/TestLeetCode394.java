package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode394;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode394 {
  @Test
  public void testProblemCase1() {
    String s = "3[a]2[bc]";
    LeetCode394 solution = new LeetCode394();
    Assert.assertEquals("aaabcbc", solution.decodeString(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "3[a2[c]]";
    LeetCode394 solution = new LeetCode394();
    Assert.assertEquals("accaccacc", solution.decodeString(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "2[abc]3[cd]ef";
    LeetCode394 solution = new LeetCode394();
    Assert.assertEquals("abcabccdcdcdef", solution.decodeString(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode394 solution = new LeetCode394();
    Assert.assertEquals("", solution.decodeString(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode394 solution = new LeetCode394();
    Assert.assertEquals("", solution.decodeString(s));
  }
}
