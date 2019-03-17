package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0460;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0460 {
  @Test
  public void testProblemCase1() {
    LeetCode0460 solution = new LeetCode0460(2);
    solution.put(1, 1);
    solution.put(2, 2);
    Assert.assertEquals(1, solution.get(1));
    solution.put(3, 3); // evicts key 2
    Assert.assertEquals(-1, solution.get(2));
    Assert.assertEquals(3, solution.get(3));
    solution.put(4, 4); // evicts key 1
    Assert.assertEquals(-1, solution.get(1));
    Assert.assertEquals(3, solution.get(3));
    Assert.assertEquals(4, solution.get(4));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode0460 solution = new LeetCode0460(0);
    solution.put(0, 0);
    Assert.assertEquals(-1, solution.get(0));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0460 solution = new LeetCode0460(2);
    solution.put(1, 1);
    solution.put(2, 2);
    solution.put(2, 3);
    solution.put(2, 4);
    Assert.assertEquals(1, solution.get(1));    
    Assert.assertEquals(4, solution.get(2));    
  }
}
