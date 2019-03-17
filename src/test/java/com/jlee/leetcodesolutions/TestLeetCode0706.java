package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0706;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0706 {
  @Test
  public void testProblemCase1() {
    LeetCode0706 solution = new LeetCode0706();
    solution.put(1, 1);
    solution.put(2, 2);;
    Assert.assertEquals(1, solution.get(1));
    Assert.assertEquals(-1, solution.get(3));
    solution.put(2, 1);
    Assert.assertEquals(1, solution.get(2));
    solution.remove(2);
    Assert.assertEquals(-1, solution.get(2));
    
    // Test bucketing
    solution.put(10001, 10001);
    solution.remove(20001);
    Assert.assertEquals(-1, solution.get(20001));
  }
}
