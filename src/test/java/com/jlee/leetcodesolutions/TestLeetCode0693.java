package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0693;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0693 {
  @Test
  public void testProblemCase1() {
    LeetCode0693 solution = new LeetCode0693();
    Assert.assertTrue(solution.hasAlternatingBits(0));
    Assert.assertTrue(solution.hasAlternatingBits(1));
    Assert.assertTrue(solution.hasAlternatingBits(2));
    Assert.assertTrue(solution.hasAlternatingBits(5));
    Assert.assertTrue(solution.hasAlternatingBits(10));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode0693 solution = new LeetCode0693();
    Assert.assertFalse(solution.hasAlternatingBits(3));    
    Assert.assertFalse(solution.hasAlternatingBits(4));    
    Assert.assertFalse(solution.hasAlternatingBits(6));    
    Assert.assertFalse(solution.hasAlternatingBits(7));    
    Assert.assertFalse(solution.hasAlternatingBits(8));    
    Assert.assertFalse(solution.hasAlternatingBits(9));    
    Assert.assertFalse(solution.hasAlternatingBits(11));    
    Assert.assertFalse(solution.hasAlternatingBits(12));    
    Assert.assertFalse(solution.hasAlternatingBits(13));    
    Assert.assertFalse(solution.hasAlternatingBits(14));    
    Assert.assertFalse(solution.hasAlternatingBits(15));    
  }
}
