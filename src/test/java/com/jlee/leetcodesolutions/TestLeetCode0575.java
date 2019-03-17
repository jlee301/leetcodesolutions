package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0575;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0575 {
  @Test
  public void testProblemCase1() {
    int[] candies = {1,1};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(1, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase2() {
    int[] candies = {1,1,2,3};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(2, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase3() {
    int[] candies = {1,1,2,2};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(2, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase4() {
    int[] candies = {1,2,3,4};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(2, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase5() {
    int[] candies = {1,1,1,2,2,2,3,3,4,4};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(4, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase6() {
    int[] candies = {1,1,1,1,1,1,1,1,1,1};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(1, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase7() {
    int[] candies = {1,2,3,4,5,6,7,8,9,10};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(5, solution.distributeCandies(candies));
  }

  @Test
  public void testProblemCase8() {
    int[] candies = {};
    LeetCode0575 solution = new LeetCode0575();
    Assert.assertEquals(0, solution.distributeCandies(candies));
  }
}
