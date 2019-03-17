package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0242;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0242 {
  @Test
  public void testProblemCase1() {
    String s = "anagram";
    String t = "nagaram";
    
    LeetCode0242 solution = new LeetCode0242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "rat";
    String t = "car";
    
    LeetCode0242 solution = new LeetCode0242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase3() {
    String s = "rat";
    String t = "ratt";
    
    LeetCode0242 solution = new LeetCode0242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase4() {
    String s = "";
    String t = "";
    
    LeetCode0242 solution = new LeetCode0242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }
}
