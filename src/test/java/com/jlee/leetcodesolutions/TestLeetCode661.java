package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode661;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode661 {
  @Test
  public void testProblemCase() {
    int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
    LeetCode661 solution = new LeetCode661();
    int[][] result = solution.imageSmoother(M);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(0, result[0][0]);
    Assert.assertEquals(0, result[0][1]);
    Assert.assertEquals(0, result[0][2]);
    Assert.assertEquals(0, result[1][0]);
    Assert.assertEquals(0, result[1][1]);
    Assert.assertEquals(0, result[1][2]);
    Assert.assertEquals(0, result[2][0]);
    Assert.assertEquals(0, result[2][1]);
    Assert.assertEquals(0, result[2][2]);
  }
  
  @Test
  public void test3By3() {
    int[][]M = {{5,15,4},{6,8,2},{3,4,50}};
    LeetCode661 solution = new LeetCode661();
    int[][] result = solution.imageSmoother(M);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(8, result[0][0]);
    Assert.assertEquals(6, result[0][1]);
    Assert.assertEquals(7, result[0][2]);
    Assert.assertEquals(6, result[1][0]);
    Assert.assertEquals(10, result[1][1]);
    Assert.assertEquals(13, result[1][2]);
    Assert.assertEquals(5, result[2][0]);
    Assert.assertEquals(12, result[2][1]);
    Assert.assertEquals(16, result[2][2]);    
  }

  @Test
  public void testEmptyLength() {
    int[][]M = {};
    LeetCode661 solution = new LeetCode661();
    int[][] result = solution.imageSmoother(M);
    Assert.assertNull(result);
  }

  @Test
  public void testEmptyWidth() {
    int[][]M = {{}};
    LeetCode661 solution = new LeetCode661();
    int[][] result = solution.imageSmoother(M);
    Assert.assertNull(result);
  }

  @Test
  public void testNull() {
    int[][]M = null;
    LeetCode661 solution = new LeetCode661();
    int[][] result = solution.imageSmoother(M);
    Assert.assertNull(result);
  }
}
