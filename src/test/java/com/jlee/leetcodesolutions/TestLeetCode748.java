package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode748;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode748 {
  @Test
  public void testProblemCase1() {
    String licensePlate = "1s3 PSt"; 
    String[] words = {"step", "steps", "stripe", "stepple"};
    LeetCode748 solution = new LeetCode748();
    Assert.assertEquals("steps", solution.shortestCompletingWord(licensePlate, words));
  }

  @Test
  public void testProblemCase2() {
    String licensePlate = "1s3 456"; 
    String[] words = {"looks", "pest", "stew", "show"};
    LeetCode748 solution = new LeetCode748();
    Assert.assertEquals("pest", solution.shortestCompletingWord(licensePlate, words));
  }
}
