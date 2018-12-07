package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode414;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode414 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 2, 1};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(1, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {2, 2, 3, 1};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(1, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {2, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1, 2, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {3, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {-1, -2, -2, -3, -4, -4, -4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(-3, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase9() {
    int[] nums = {3, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase10() {
    int[] nums = {4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }
}
