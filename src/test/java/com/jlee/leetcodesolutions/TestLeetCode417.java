package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode417;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode417 {
  @Test
  public void testProblemCase() {
    int[][] matrix = { {1,2,2,3,5},
                       {3,2,3,4,4},
                       {2,4,5,3,1},
                       {6,7,1,4,5},
                       {5,1,1,2,4} };
    LeetCode417 solution = new LeetCode417();
    List<int[]> result = solution.pacificAtlantic(matrix);
    Assert.assertEquals(7, result.size());
    Assert.assertArrayEquals(new int[] {0,4}, result.get(0));
    Assert.assertArrayEquals(new int[] {1,3}, result.get(1));
    Assert.assertArrayEquals(new int[] {1,4}, result.get(2));
    Assert.assertArrayEquals(new int[] {2,2}, result.get(3));
    Assert.assertArrayEquals(new int[] {3,0}, result.get(4));
    Assert.assertArrayEquals(new int[] {3,1}, result.get(5));
    Assert.assertArrayEquals(new int[] {4,0}, result.get(6));
  }

  @Test
  public void test3by3() {
    int[][] matrix = { {2,2,3},
                       {3,5,6},
                       {5,6,7} };
    LeetCode417 solution = new LeetCode417();
    List<int[]> result = solution.pacificAtlantic(matrix);
    Assert.assertEquals(5, result.size());
    Assert.assertArrayEquals(new int[] {0,2}, result.get(0));
    Assert.assertArrayEquals(new int[] {1,2}, result.get(1));
    Assert.assertArrayEquals(new int[] {2,0}, result.get(2));
    Assert.assertArrayEquals(new int[] {2,1}, result.get(3));
    Assert.assertArrayEquals(new int[] {2,2}, result.get(4));
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    LeetCode417 solution = new LeetCode417();
    List<int[]> result = solution.pacificAtlantic(matrix);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode417 solution = new LeetCode417();
    List<int[]> result = solution.pacificAtlantic(matrix);
    Assert.assertEquals(0, result.size());
  }
}
