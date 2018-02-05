package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode063;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode063 {
  @Test
  public void test3By3WithObstacleInMiddle() {
    int[][] obstacleGrid = { {0,0,0},
                             {0,1,0}, 
                             {0,0,0} };
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void test3By3WithObstacleInBeginning() {
    int[][] obstacleGrid = { {1,0,0},
                             {0,0,0}, 
                             {0,0,0} };
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void test3By3WithObstacleInEnd() {
    int[][] obstacleGrid = { {0,0,0},
                             {0,0,0}, 
                             {0,0,1} };
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void test3By3WithNoObstacle() {
    int[][] obstacleGrid = { {0,0,0},
                             {0,0,0}, 
                             {0,0,0} };
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(6, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void testEmptyRow() {
    int[][] obstacleGrid = {};
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void testEmptyCol() {
    int[][] obstacleGrid = {{}};
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
  }

  @Test
  public void testNull() {
    int[][] obstacleGrid = null;
    LeetCode063 solution = new LeetCode063();
    Assert.assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
  }
}
