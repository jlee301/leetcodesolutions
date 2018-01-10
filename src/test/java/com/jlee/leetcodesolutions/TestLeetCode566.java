package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode566;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode566 {
  @Test
  public void test2By2To1By4() {
    int[][] nums = {{1,2},{3,4}};
    int r = 1, c = 4;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[0][2]);
    Assert.assertEquals(4, result[0][3]);
  }

  @Test
  public void test2By2To4By1() {
    int[][] nums = {{1,2},{3,4}};
    int r = 4, c = 1;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[1][0]);
    Assert.assertEquals(3, result[2][0]);
    Assert.assertEquals(4, result[3][0]);
  }

  @Test
  public void test2By2To2By2() {
    int[][] nums = {{1,2},{3,4}};
    int r = 2, c = 2;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[1][0]);
    Assert.assertEquals(4, result[1][1]);
  }

  @Test
  public void test2By2ToUnderSize() {
    int[][] nums = {{1,2},{3,4}};
    int r = 1, c = 2;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[1][0]);
    Assert.assertEquals(4, result[1][1]);
  }

  @Test
  public void test2By2ToOverSize() {
    int[][] nums = {{1,2},{3,4}};
    int r = 3, c = 2;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[1][0]);
    Assert.assertEquals(4, result[1][1]);
  }

  @Test
  public void test2By2ToRLess1() {
    int[][] nums = {{1,2},{3,4}};
    int r = 0, c = 2;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[1][0]);
    Assert.assertEquals(4, result[1][1]);
  }

  @Test
  public void test2By2ToCLess1() {
    int[][] nums = {{1,2},{3,4}};
    int r = 2, c = 0;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[1][0]);
    Assert.assertEquals(4, result[1][1]);
  }

  @Test
  public void testNull() {
    int[][] nums = null;
    int r = 1, c = 4;
    LeetCode566 solution = new LeetCode566();
    int[][] result = solution.matrixReshape(nums, r, c);
    Assert.assertNull(result);
  }
}
