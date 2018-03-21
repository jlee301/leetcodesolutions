package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode376;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode376 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,7,4,9,2,5};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(6, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,17,5,10,13,15,10,5,16,8};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(7, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5,6,7,8,9};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(2, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testAllTheSame() {
    int[] nums = {1,1,1,1,1,1,1,1,1,1,1};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(1, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {1};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(1, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(0, solution.wiggleMaxLength(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode376 solution = new LeetCode376();
    Assert.assertEquals(0, solution.wiggleMaxLength(nums));
  }
}
