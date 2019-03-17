package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0478;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0478 {
  @Test
  public void testProblemCase1() {
    LeetCode0478 solution = new LeetCode0478(1,0,0);
    for(int i = 0; i < 10; i++) {
      double[] coord = solution.randPoint();
      double hyp = Math.sqrt(Math.pow(coord[0]-0, 2) + Math.pow(coord[1]-0, 2));
      if(hyp < 0 && hyp > 1)
        Assert.fail("The point return is outside the circle.");
    }
  }

  @Test
  public void testProblemCase2() {
    LeetCode0478 solution = new LeetCode0478(10,5,-7.5);
    for(int i = 0; i < 10; i++) {
      double[] coord = solution.randPoint();
      double hyp = Math.sqrt(Math.pow(coord[0]-5, 2) + Math.pow(coord[1]+7.5, 2));
      if(hyp < 0 && hyp > 10)
        Assert.fail("The point return is outside the circle.");
    }
  }
}
