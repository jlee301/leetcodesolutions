package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0384;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0384 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3};
    LeetCode0384 solution = new LeetCode0384(nums);
    for(int i = 0; i < 10; i++) {
      int[] result = solution.shuffle();
      Assert.assertEquals(3, result.length);
      List<Integer> list = Arrays.asList(result[0], result[1], result[2]);
      for(int j = 0; j < nums.length; j++) {
        if(!list.contains(nums[j]))
          Assert.fail("shuffle() is missing: " + nums[j]);
      }
    }
    Assert.assertArrayEquals(nums, solution.reset());
  }

  @Test
  public void testTLE() {
    int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
    LeetCode0384 solution = new LeetCode0384(nums);
    for(int i = 0; i < 10; i++) {
      int[] result = solution.shuffle();
      Assert.assertEquals(12, result.length);
      List<Integer> list = Arrays.asList(result[0], result[1], result[2], result[3], result[4], result[5], result[6], result[7], result[8], result[9], result[10], result[11]);
      for(int j = 0; j < nums.length; j++) {
        if(!list.contains(nums[j]))
          Assert.fail("shuffle() is missing: " + nums[j]);
      }
    }
    Assert.assertArrayEquals(nums, solution.reset());
  }
}
