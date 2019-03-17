package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0769;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0769 {
  @Test
  public void test43210() {
    int[] arr = {4,3,2,1,0};
    LeetCode0769 solution = new LeetCode0769();
    Assert.assertEquals(1, solution.maxChunksToSorted(arr));
  }

  @Test
  public void test10234() {
    int[] arr = {1,0,2,3,4};
    LeetCode0769 solution = new LeetCode0769();
    Assert.assertEquals(4, solution.maxChunksToSorted(arr));
  }

  @Test
  public void test01234() {
    int[] arr = {0,1,2,3,4};
    LeetCode0769 solution = new LeetCode0769();
    Assert.assertEquals(5, solution.maxChunksToSorted(arr));
  }

  @Test
  public void test10423() {
    int[] arr = {1,0,4,2,3};
    LeetCode0769 solution = new LeetCode0769();
    Assert.assertEquals(2, solution.maxChunksToSorted(arr));
  }

  @Test
  public void test10243() {
    int[] arr = {1,0,2,4,3};
    LeetCode0769 solution = new LeetCode0769();
    Assert.assertEquals(3, solution.maxChunksToSorted(arr));
  }
}
