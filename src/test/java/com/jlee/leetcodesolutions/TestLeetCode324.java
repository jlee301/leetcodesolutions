package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode324;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode324 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,5,1,1,6,4};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {1,4,1,5,1,6}, nums);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,3,2,2,3,1};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {2,3,1,3,1,2}, nums);
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {1}, nums);
  }

  @Test
  public void testTwoEntry() {
    int[] nums = {2,1};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {1,2}, nums);
  }

  @Test
  public void testThreeEntry() {
    int[] nums = {3,2,1};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {2,3,1}, nums);
  }

  @Test
  public void testFourEntry() {
    int[] nums = {1,2,3,4};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {2,3,1,4}, nums);
  }

  @Test
  public void testFiveEntry() {
    int[] nums = {1,2,3,4,5};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {3,4,2,5,1}, nums);
  }

  @Test
  public void testSixEntry() {
    int[] nums = {1,2,3,4,5,6};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {3,4,2,5,1,6}, nums);
  }

  @Test
  public void testSevenEntry() {
    int[] nums = {1,2,3,4,5,6,7};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {4,5,3,6,2,7,1}, nums);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertArrayEquals(new int[] {}, nums);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode324 solution = new LeetCode324();
    solution.wiggleSort(nums);
    Assert.assertNull(nums);
  }
}
