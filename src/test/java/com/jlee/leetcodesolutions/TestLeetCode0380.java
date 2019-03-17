package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0380;
import com.jlee.leetcodesolutions.LeetCode0380.RandomizedSet;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0380 {
  @Test
  public void testProblemCase() {
    LeetCode0380 leet = new LeetCode0380();
    RandomizedSet solution = leet.new RandomizedSet();
    Assert.assertTrue(solution.insert(1));
    Assert.assertFalse(solution.remove(2));
    Assert.assertTrue(solution.insert(2));
    for(int i = 0; i < 10; i++) {
      int random = solution.getRandom();
      if(random == 1) {}
      else if(random == 2) {}
      else
        Assert.fail("getRandom() did not return either 1 or 2");
    }
    Assert.assertTrue(solution.remove(1));    
    Assert.assertFalse(solution.insert(2));
    for(int i = 0; i < 10; i++)
      Assert.assertEquals(2, solution.getRandom());
  }
}
