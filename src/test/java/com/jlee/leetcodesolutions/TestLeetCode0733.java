package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0733;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0733 {
  @Test
  public void testProblemCase() {
    int[][] image = {{1,1,1},
                     {1,1,0},
                     {1,0,1}}; 
    
    int sr = 1, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(2, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(2, result[0][2]);
    Assert.assertEquals(2, result[1][0]);
    Assert.assertEquals(2, result[1][1]);
    Assert.assertEquals(0, result[1][2]);
    Assert.assertEquals(2, result[2][0]);
    Assert.assertEquals(0, result[2][1]);
    Assert.assertEquals(1, result[2][2]);
  }

  @Test
  public void testEmptyPlain() {
    int[][] image = {{0,0,0},
                     {0,0,0},
                     {0,0,0}}; 
    
    int sr = 2, sc = 2, newColor = 65535;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(65535, result[0][0]);
    Assert.assertEquals(65535, result[0][1]);
    Assert.assertEquals(65535, result[0][2]);
    Assert.assertEquals(65535, result[1][0]);
    Assert.assertEquals(65535, result[1][1]);
    Assert.assertEquals(65535, result[1][2]);
    Assert.assertEquals(65535, result[2][0]);
    Assert.assertEquals(65535, result[2][1]);
    Assert.assertEquals(65535, result[2][2]);
  }
  
  @Test
  public void testEmptyRow() {
    int[][] image = {}; 
    int sr = 1, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmptyCol() {
    int[][] image = {{}}; 
    int sr = 1, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(0, result[0].length);
  }

  @Test
  public void testRowLessThanZero() {
    int[][] image = {{1,1,1}}; 
    int sr = -1, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testRowGreaterThanImage() {
    int[][] image = {{1,1,1}}; 
    int sr = 2, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testColLessThanZero() {
    int[][] image = {{1,1,1}}; 
    int sr = 1, sc = -1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testColGreaterThanImage() {
    int[][] image = {{1,1,1}}; 
    int sr = 1, sc = 4, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testColorLessThanZero() {
    int[][] image = {{1,1,1}}; 
    int sr = 1, sc = 1, newColor = -1;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testColorGreaterThan65535() {
    int[][] image = {{1,1,1}}; 
    int sr = 1, sc = 1, newColor = 65536;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(1, result[0][1]);
    Assert.assertEquals(1, result[0][2]);
  }

  @Test
  public void testNull() {
    int[][] image = null; 
    int sr = 1, sc = 1, newColor = 2;
    LeetCode0733 solution = new LeetCode0733();
    int[][] result = solution.floodFill(image, sr, sc, newColor);
    Assert.assertNull(result);
  }
}
