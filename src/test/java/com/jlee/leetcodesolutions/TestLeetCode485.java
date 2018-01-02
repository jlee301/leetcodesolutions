package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode485;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode485 {
  @Test
  public void testMostInEnd() {
    int[] nums = {1,1,0,1,1,1};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testMostInBeg() {
    int[] nums = {1,1,1,0,1,1};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testMostInMid() {
    int[] nums = {1,0,1,1,0,1};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(2, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testAlternate() {
    int[] nums = {1,0,1,0,1,0};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(1, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testAllOnes() {
    int[] nums = {1,1,1,1,1,1};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(6, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testAllZeroes() {
    int[] nums = {0,0,0,0,0,0};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode485 solution = new LeetCode485();
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(nums));
  }
}
