package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode704;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode704 {
  @Test
  public void testProblemCase1() {
    int[] nums = {-1,0,3,5,9,12};
    LeetCode704 solution = new LeetCode704();
    Assert.assertEquals(0, solution.search(nums, -1));
    Assert.assertEquals(1, solution.search(nums, 0));
    Assert.assertEquals(2, solution.search(nums, 3));
    Assert.assertEquals(3, solution.search(nums, 5));
    Assert.assertEquals(4, solution.search(nums, 9));
    Assert.assertEquals(5, solution.search(nums, 12));
    Assert.assertEquals(-1, solution.search(nums, 2));
  }
}
