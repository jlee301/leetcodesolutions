package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode818;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode818 {
  @Test
  public void testProblemCase1() {
    // Input: target = 3
    // Output: 2
    int target = 3;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(2, solution.racecar(target));
  }

  @Test
  public void testProblemCase2() {
    // Input: target = 6
    // Output: 5
    int target = 6;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(5, solution.racecar(target));
  }

  @Test
  public void testTarget0() {
    int target = 0;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(0, solution.racecar(target));
  }

  @Test
  public void testTarget1() {
    int target = 1;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(1, solution.racecar(target));
  }

  @Test
  public void testTarget2() {
    int target = 2;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(4, solution.racecar(target));
  }

  @Test
  public void testTarget3() {
    int target = 3;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(2, solution.racecar(target));
  }

  @Test
  public void testTarget4() {
    int target = 4;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(5, solution.racecar(target));
  }

  @Test
  public void testTarget5() {
    int target = 5;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(7, solution.racecar(target));
  }

  @Test
  public void testTarget6() {
    int target = 6;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(5, solution.racecar(target));
  }

  @Test
  public void testTarget7() {
    int target = 7;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(3, solution.racecar(target));
  }

  @Test
  public void testTarget8() {
    int target = 8;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(6, solution.racecar(target));
  }

  @Test
  public void testTarget9() {
    int target = 9;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(8, solution.racecar(target));
  }

  @Test
  public void testTarget10() {
    int target = 10;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(7, solution.racecar(target));
  }

  @Test
  public void testTarget5617() {
    int target = 5617;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(41, solution.racecar(target));
  }

  @Test
  public void testTarget5363() {
    int target = 5363;
    LeetCode818 solution = new LeetCode818();
    Assert.assertEquals(39, solution.racecar(target));
  }
}
