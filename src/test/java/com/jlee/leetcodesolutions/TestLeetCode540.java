package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode540;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode540 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,1,2,3,3,4,4,8,8};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(2, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,3,7,7,10,11,11};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(10, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testSingleInFront() {
    int[] nums = {3,11,11};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(3, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testSingleInMid() {
    int[] nums = {1,1,3,11,11};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(3, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testSingleInEnd() {
    int[] nums = {3,3,11};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(11, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testJustOneElement() {
    int[] nums = {3};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(3, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(Integer.MAX_VALUE, solution.singleNonDuplicate(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode540 solution = new LeetCode540();
    Assert.assertEquals(Integer.MAX_VALUE, solution.singleNonDuplicate(nums));
  }
}
