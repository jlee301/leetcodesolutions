package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1103;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1103 {
  @Test
  public void testProblemCase1() {
    int candies = 7;
    int num_people = 4;
    LeetCode1103 solution = new LeetCode1103();
    Assert.assertArrayEquals(new int[] {1,2,3,1}, solution.distributeCandies(candies, num_people));
  }

  @Test
  public void testProblemCase2() {
    int candies = 10;
    int num_people = 3;
    LeetCode1103 solution = new LeetCode1103();
    Assert.assertArrayEquals(new int[] {5,2,3}, solution.distributeCandies(candies, num_people));
  }
}
