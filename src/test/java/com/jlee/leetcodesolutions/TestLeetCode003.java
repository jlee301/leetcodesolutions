package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode003;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode003 {
  @Test
  public void testProblemCase1() {
    String s = "abcabcbb";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "bbbbb";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(1, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "pwwkew";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(3, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testAllUnique() {
    String s = "abcdefg";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(7, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testOneChar() {
    String s = "a";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(1, solution.lengthOfLongestSubstring(s));
  }
  
  @Test
  public void testEmpty() {
    String s = "";
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(0, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode003 solution = new LeetCode003();
    Assert.assertEquals(0, solution.lengthOfLongestSubstring(s));
  }
}
