package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode381;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode381 {
  @Test
  public void testProblemCase1() {
    LeetCode381 solution = new LeetCode381();
    Assert.assertTrue(solution.insert(1));
    Assert.assertFalse(solution.insert(1));
    Assert.assertTrue(solution.insert(2));
    int[] result = new int[2];
    for(int i = 0; i < 100; i++) {
      if(solution.getRandom() == 1)
        result[0]++;
      else
        result[1]++;
    }
    Assert.assertEquals(100, result[0]+result[1]);
    Assert.assertTrue(result[0] > 0);
    Assert.assertTrue(result[1] > 0);
    Assert.assertTrue(solution.remove(2));
    Assert.assertFalse(solution.remove(2));
    result = new int[2];
    for(int i = 0; i < 100; i++) {
      if(solution.getRandom() == 1)
        result[0]++;
      else
        result[1]++;
    }
    Assert.assertEquals(100, result[0]);
    Assert.assertEquals(0, result[1]);
    Assert.assertTrue(solution.remove(1));
    Assert.assertTrue(solution.remove(1));
    Assert.assertFalse(solution.remove(1));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode381 solution = new LeetCode381();
    Assert.assertTrue(solution.insert(1));
    Assert.assertFalse(solution.remove(2));
    Assert.assertTrue(solution.insert(2));
    int[] result = new int[2];
    for(int i = 0; i < 100; i++) {
      if(solution.getRandom() == 1)
        result[0]++;
      else
        result[1]++;
    }
    Assert.assertEquals(100, result[0]+result[1]);
    Assert.assertTrue(result[0] > 0);
    Assert.assertTrue(result[1] > 0);
    Assert.assertTrue(solution.remove(1));
    Assert.assertFalse(solution.insert(2));
    result = new int[2];
    for(int i = 0; i < 100; i++) {
      if(solution.getRandom() == 1)
        result[0]++;
      else
        result[1]++;
    }
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(100, result[1]);
  }
}
