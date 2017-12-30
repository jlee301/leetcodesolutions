package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode461;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode461 {
  @Test
  public void testProblemCase() {
    int x = 1; // 0001
    int y = 4; // 0100
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(2, solution.hammingDistance(x, y));
  }

  @Test
  public void test8Bit() {
    int x = 20; // 0001 0100
    int y = 4;  // 0000 0100
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(1, solution.hammingDistance(x, y));
  }

  @Test
  public void test12Bit() {
    int x = 263; // 0001 0000 0111
    int y = 4;   // 0000 0000 0100
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(3, solution.hammingDistance(x, y));
  }

  @Test
  public void test12BitAll() {
    int x = 4095; // 1111 1111 1111
    int y = 0;    // 0000 0000 0000
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(12, solution.hammingDistance(x, y));
  }
  
  @Test
  public void testXNeg() {
    int x = -1;
    int y = 1;
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(0, solution.hammingDistance(x, y));
  }

  @Test
  public void testYNeg() {
    int x = 1;
    int y = -1;
    LeetCode461 solution = new LeetCode461();
    Assert.assertEquals(0, solution.hammingDistance(x, y));
  }
}
