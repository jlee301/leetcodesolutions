package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0448;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0448 {
  @Test
  public void testProblemCase1() {
    int nums[] = {4,3,2,7,8,2,3,1};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(5, (int)result.get(0));
    Assert.assertEquals(6, (int)result.get(1));
  }

  @Test
  public void testProblemCase2() {
    int nums[] = {1,1,3,4};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, (int)result.get(0));
  }

  @Test
  public void testProblemCase3() {
    int nums[] = {2,2,3,3};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
  }

  @Test
  public void testProblemCase4() {
    int nums[] = {1,1,2,2};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
  }

  @Test
  public void testProblemCase5() {
    int nums[] = {1,2,3,4};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase6() {
    int nums[] = {1};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase7() {
    int nums[] = {};
    LeetCode0448 solution = new LeetCode0448();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    Assert.assertEquals(0, result.size());
  }
}
