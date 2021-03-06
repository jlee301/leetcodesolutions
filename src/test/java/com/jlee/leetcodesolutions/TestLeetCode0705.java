package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0705;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0705 {
  @Test
  public void testProblemCase1() {
    LeetCode0705 solution = new LeetCode0705();
    solution.add(1);
    solution.add(2);
    Assert.assertTrue(solution.contains(1));
    Assert.assertFalse(solution.contains(3));
    solution.add(2);
    Assert.assertTrue(solution.contains(2));
    solution.remove(2);
    Assert.assertFalse(solution.contains(2));
    
    // Test bucketing
    solution.add(10001);
    solution.remove(20001);
    Assert.assertFalse(solution.contains(20001));
  }
}
