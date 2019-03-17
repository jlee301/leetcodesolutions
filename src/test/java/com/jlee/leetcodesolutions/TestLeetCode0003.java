package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0003;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0003 {
  @Test
  public void testProblemCase1() {
    String s = "abcabcbb";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "bbbbb";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(1, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "pwwkew";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testAllUnique() {
    String s = "abcdefg";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(7, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testOneChar() {
    String s = "a";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(1, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(0, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0003 solution = new LeetCode0003();
    Assert.assertEquals(0, solution.lengthOfLongestSubstring(s));
  }
}
