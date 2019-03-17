package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0268;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0268 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3,0,1};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(2, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {9,6,4,2,3,5,7,0,1};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(8, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {9,6,4,2,3,5,7,8,1};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(0, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {9,6,4,2,3,5,7,8,1,0};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(10, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {0};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(1, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(0, solution.missingNumber(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {};
    LeetCode0268 solution = new LeetCode0268();
    Assert.assertEquals(0, solution.missingNumber(nums));
  }
}
