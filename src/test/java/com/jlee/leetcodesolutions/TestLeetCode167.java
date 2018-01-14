package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode167;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode167 {
  @Test
  public void testBeginSum() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  public void testMiddleSum() {
    int[] numbers = {2, 7, 11, 15};
    int target = 18;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  public void testEndSum() {
    int[] numbers = {2, 7, 11, 15};
    int target = 26;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(4, result[1]);
  }

  @Test
  public void testFirstSumTwoEntry() {
    int[] numbers = {2, 7};
    int target = 9;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testFirstSumThreeEntry() {
    int[] numbers = {2, 3, 7};
    int target = 9;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testNotAscEntry() {
    int[] numbers = {7, 2, 1, 15};
    int target = 9;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testOneEntry() {
    int[] numbers = {2};
    int target = 2;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testEmptyEntry() {
    int[] numbers = {};
    int target = 2;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }

  @Test
  public void testNullEntry() {
    int[] numbers = null;
    int target = 2;
    LeetCode167 solution = new LeetCode167();
    int[] result = solution.twoSum(numbers, target);
    Assert.assertNull(result);
  }
}
