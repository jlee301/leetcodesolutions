package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0911;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0911 {
  @Test
  public void testProblemCase1() {
    int[] persons = {0,1,1,0,0,1,0};
    int[] times = {0,5,10,15,20,25,30};
    LeetCode0911 solution = new LeetCode0911(persons, times);
    Assert.assertEquals(0, solution.q(3));
    Assert.assertEquals(1, solution.q(12));
    Assert.assertEquals(1, solution.q(25));
    Assert.assertEquals(0, solution.q(15));
    Assert.assertEquals(0, solution.q(24));
    Assert.assertEquals(1, solution.q(8));
  }

  @Test
  public void testProblemCase2() {
    int[] persons = {0,0,1};
    int[] times = {0,5,10};
    LeetCode0911 solution = new LeetCode0911(persons, times);
    Assert.assertEquals(0, solution.q(3));
    Assert.assertEquals(0, solution.q(12));
    Assert.assertEquals(0, solution.q(25));
    Assert.assertEquals(0, solution.q(15));
    Assert.assertEquals(0, solution.q(24));
    Assert.assertEquals(0, solution.q(8));
  }
}
