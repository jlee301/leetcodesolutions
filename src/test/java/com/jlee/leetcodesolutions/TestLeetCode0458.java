package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0458;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0458 {
  @Test
  public void testProblemCase1() {
    int minutesToTest = 60, minutesToDie = 15, buckets = 1000;
    LeetCode0458 solution = new LeetCode0458();
    Assert.assertEquals(5, solution.poorPigs(buckets, minutesToDie, minutesToTest));    
  }

  @Test
  public void testProblemCase2() {
    int minutesToTest = 60, minutesToDie = 15, buckets = 25;
    LeetCode0458 solution = new LeetCode0458();
    Assert.assertEquals(2, solution.poorPigs(buckets, minutesToDie, minutesToTest));    
  }

  @Test
  public void testProblemCase3() {
    int minutesToTest = 60, minutesToDie = 15, buckets = 26;
    LeetCode0458 solution = new LeetCode0458();
    Assert.assertEquals(3, solution.poorPigs(buckets, minutesToDie, minutesToTest));    
  }

  @Test
  public void testProblemCase4() {
    int minutesToTest = 60, minutesToDie = 15, buckets = 125;
    LeetCode0458 solution = new LeetCode0458();
    Assert.assertEquals(3, solution.poorPigs(buckets, minutesToDie, minutesToTest));    
  }

  @Test
  public void testProblemCase5() {
    int minutesToTest = 60, minutesToDie = 15, buckets = 1;
    LeetCode0458 solution = new LeetCode0458();
    Assert.assertEquals(0, solution.poorPigs(buckets, minutesToDie, minutesToTest));    
  }
}
