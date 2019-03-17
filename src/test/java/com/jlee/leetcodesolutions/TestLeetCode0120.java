package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0120;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0120 {
  @Test
  public void testProblemCase() {
    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(Arrays.asList(new Integer[] {2}));
    triangle.add(Arrays.asList(new Integer[] {3,4}));
    triangle.add(Arrays.asList(new Integer[] {6,5,7}));
    triangle.add(Arrays.asList(new Integer[] {4,1,8,3}));
    LeetCode0120 solution = new LeetCode0120();
    Assert.assertEquals(11, solution.minimumTotal(triangle));
  }

  @Test
  public void testEmpty() {
    List<List<Integer>> triangle = new ArrayList<>();
    LeetCode0120 solution = new LeetCode0120();
    Assert.assertEquals(0, solution.minimumTotal(triangle));
  }

  @Test
  public void testNull() {
    List<List<Integer>> triangle = null;
    LeetCode0120 solution = new LeetCode0120();
    Assert.assertEquals(0, solution.minimumTotal(triangle));
  }
}
