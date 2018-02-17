package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode120;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode120 {
  @Test
  public void testProblemCase() {
    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(Arrays.asList(new Integer[] {2}));
    triangle.add(Arrays.asList(new Integer[] {3,4}));
    triangle.add(Arrays.asList(new Integer[] {6,5,7}));
    triangle.add(Arrays.asList(new Integer[] {4,1,8,3}));
    LeetCode120 solution = new LeetCode120();
    Assert.assertEquals(11, solution.minimumTotal(triangle));
  }

  @Test
  public void testEmpty() {
    List<List<Integer>> triangle = new ArrayList<>();
    LeetCode120 solution = new LeetCode120();
    Assert.assertEquals(0, solution.minimumTotal(triangle));
  }

  @Test
  public void testNull() {
    List<List<Integer>> triangle = null;
    LeetCode120 solution = new LeetCode120();
    Assert.assertEquals(0, solution.minimumTotal(triangle));
  }
}
