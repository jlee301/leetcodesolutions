package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0167;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0167 {
  @Test
  public void testProblemCase1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  public void testProblemCase2() {
    int[] numbers = {2, 7, 11, 15};
    int target = 18;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  public void testProblemCase3() {
    int[] numbers = {2, 7, 11, 15};
    int target = 26;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(4, result[1]);
  }

  @Test
  public void testProblemCase4() {
    int[] numbers = {2, 7};
    int target = 9;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase5() {
    int[] numbers = {2, 3, 7};
    int target = 9;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase6() {
    int[] numbers = {7, 2, 1, 15};
    int target = 9;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase7() {
    int[] numbers = {2};
    int target = 2;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase8() {
    int[] numbers = {};
    int target = 2;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase9() {
    int[] numbers = {5};
    int target = 10;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase10() {
    int[] numbers = {5,5};
    int target = 10;
    LeetCode0167 solution = new LeetCode0167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }
}
