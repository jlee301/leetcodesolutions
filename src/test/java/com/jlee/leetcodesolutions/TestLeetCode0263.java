package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0263;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0263 {
  @Test
  public void testProblemCase1() {
    int num = 6;
    LeetCode0263 solution = new LeetCode0263();
    Assert.assertTrue(solution.isUgly(num));
  }

  @Test
  public void testProblemCase2() {
    int num = 8;
    LeetCode0263 solution = new LeetCode0263();
    Assert.assertTrue(solution.isUgly(num));
  }

  @Test
  public void testProblemCase3() {
    int num = 14;
    LeetCode0263 solution = new LeetCode0263();
    Assert.assertFalse(solution.isUgly(num));
  }
  
  @Test
  public void testProblemCase4() {
    LeetCode0263 solution = new LeetCode0263();
    Assert.assertTrue(solution.isUgly(1));    
    Assert.assertTrue(solution.isUgly(2));    
    Assert.assertTrue(solution.isUgly(3));    
    Assert.assertTrue(solution.isUgly(4));    
    Assert.assertTrue(solution.isUgly(5));    
    Assert.assertTrue(solution.isUgly(6));    
    Assert.assertTrue(solution.isUgly(8));    
    Assert.assertTrue(solution.isUgly(9));    
    Assert.assertTrue(solution.isUgly(10));    
    Assert.assertTrue(solution.isUgly(12));    
    Assert.assertTrue(solution.isUgly(15));    
    Assert.assertTrue(solution.isUgly(16));    
    Assert.assertTrue(solution.isUgly(18));    
    Assert.assertTrue(solution.isUgly(20));
  }

  @Test
  public void testProblemCase5() {
    LeetCode0263 solution = new LeetCode0263();
    Assert.assertFalse(solution.isUgly(-100));
    Assert.assertFalse(solution.isUgly(-10));
    Assert.assertFalse(solution.isUgly(-1));
    Assert.assertFalse(solution.isUgly(0));
    Assert.assertFalse(solution.isUgly(7));
    Assert.assertFalse(solution.isUgly(11));
    Assert.assertFalse(solution.isUgly(13));
    Assert.assertFalse(solution.isUgly(14));
    Assert.assertFalse(solution.isUgly(17));
    Assert.assertFalse(solution.isUgly(19));
    Assert.assertFalse(solution.isUgly(49));
  }
}
