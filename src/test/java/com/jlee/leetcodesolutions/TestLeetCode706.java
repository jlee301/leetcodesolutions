package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode706;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode706 {
  @Test
  public void testProblemCase1() {
    LeetCode706 solution = new LeetCode706();
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
