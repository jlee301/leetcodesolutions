package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode242;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode242 {
  @Test
  public void testProblemCase1() {
    String s = "anagram";
    String t = "nagaram";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "rat";
    String t = "car";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testMixSize() {
    String s = "rat";
    String t = "ratt";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testEmpty() {
    String s = "";
    String t = "";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void testNull() {
    String s = null;
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }
}
