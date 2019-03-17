package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0969;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0969 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,2,4,1};
    LeetCode0969 solution = new LeetCode0969();
    List<Integer> result = solution.pancakeSort(A);
    Assert.assertTrue(result.size() < 10 * A.length);
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,2,3};
    LeetCode0969 solution = new LeetCode0969();
    List<Integer> result = solution.pancakeSort(A);
    Assert.assertTrue(result.size() < 10 * A.length);
  }
}
