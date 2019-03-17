package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0475;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0475 {
  @Test
  public void testProblemCase1() {
    int[] houses = {1,2,3};
    int[] heaters = {2};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(1, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase2() {
    int[] houses = {1,2,3,4};
    int[] heaters = {1,4};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(1, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase3() {
    int[] houses = {1,2,3,4,5,6,7,8};
    int[] heaters = {2,5,9};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(2, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase4() {
    int[] houses = {1,2,3,4};
    int[] heaters = {1};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase5() {
    int[] houses = {1};
    int[] heaters = {1};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase6() {
    int[] houses = {1,2,3,4};
    int[] heaters = {8};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(7, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase7() {
    int[] houses = {2,3,5};
    int[] heaters = {1,8};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase8() {
    int[] houses = {2,3};
    int[] heaters = {1,8};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(2, solutions.findRadius(houses, heaters));
  }
  
  @Test
  public void testProblemCase9() {
    int[] houses = {2,5,3};
    int[] heaters = {8,1};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase10() {
    int[] houses = {};
    int[] heaters = {1,8};
    LeetCode0475 solutions = new LeetCode0475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }
}
