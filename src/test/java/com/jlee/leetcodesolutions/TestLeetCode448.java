package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode448;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode448 {
  @Test
  public void testProblemCase() {
    int nums[] = {4,3,2,7,8,2,3,1};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(5, (int)result.get(0));
    Assert.assertEquals(6, (int)result.get(1));
  }

  @Test
  public void testMissingMid() {
    int nums[] = {1,1,3,4};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, (int)result.get(0));
  }

  @Test
  public void testMissingBeginEnd() {
    int nums[] = {2,2,3,3};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
  }

  @Test
  public void testMissingMidEnd() {
    int nums[] = {1,1,2,2};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
  }

  @Test
  public void testNothingMissing() {
    int nums[] = {1,2,3,4};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testSingleEntry() {
    int nums[] = {1};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    int nums[] = {};
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int nums[] = null;
    LeetCode448 solution = new LeetCode448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }
}
