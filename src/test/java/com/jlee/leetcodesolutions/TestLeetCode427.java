package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode427;
import com.jlee.leetcodesolutions.LeetCode427.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode427 {
  @Test
  public void testProblemCase1() {
    int[][] grid = { {1,1,1,1,0,0,0,0},
                     {1,1,1,1,0,0,0,0},
                     {1,1,1,1,1,1,1,1},
                     {1,1,1,1,1,1,1,1},
                     {1,1,1,1,0,0,0,0},
                     {1,1,1,1,0,0,0,0},
                     {1,1,1,1,0,0,0,0},
                     {1,1,1,1,0,0,0,0} };    
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
    
    // Top right
    Assert.assertFalse(result.topRight.isLeaf);
    Assert.assertFalse(result.topRight.isLeaf);
    
    Assert.assertTrue(result.topRight.topLeft.isLeaf);
    Assert.assertFalse(result.topRight.topLeft.val);
    Assert.assertNull(result.topRight.topLeft.topLeft);
    Assert.assertNull(result.topRight.topLeft.topRight);
    Assert.assertNull(result.topRight.topLeft.bottomLeft);
    Assert.assertNull(result.topRight.topLeft.bottomRight);

    Assert.assertTrue(result.topRight.topRight.isLeaf);
    Assert.assertFalse(result.topRight.topRight.val);
    Assert.assertNull(result.topRight.topRight.topLeft);
    Assert.assertNull(result.topRight.topRight.topRight);
    Assert.assertNull(result.topRight.topRight.bottomLeft);
    Assert.assertNull(result.topRight.topRight.bottomRight);

    Assert.assertTrue(result.topRight.bottomLeft.isLeaf);
    Assert.assertTrue(result.topRight.bottomLeft.val);
    Assert.assertNull(result.topRight.bottomLeft.topLeft);
    Assert.assertNull(result.topRight.bottomLeft.topRight);
    Assert.assertNull(result.topRight.bottomLeft.bottomLeft);
    Assert.assertNull(result.topRight.bottomLeft.bottomRight);

    Assert.assertTrue(result.topRight.bottomRight.isLeaf);
    Assert.assertTrue(result.topRight.bottomRight.val);
    Assert.assertNull(result.topRight.bottomRight.topLeft);
    Assert.assertNull(result.topRight.bottomRight.topRight);
    Assert.assertNull(result.topRight.bottomRight.bottomLeft);
    Assert.assertNull(result.topRight.bottomRight.bottomRight);

    
    // Top left
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertNull(result.topLeft.topLeft);
    Assert.assertNull(result.topLeft.topRight);
    Assert.assertNull(result.topLeft.bottomLeft);
    Assert.assertNull(result.topLeft.bottomRight);
    
    // Bottom left
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertNull(result.bottomLeft.topLeft);
    Assert.assertNull(result.bottomLeft.topRight);
    Assert.assertNull(result.bottomLeft.bottomLeft);
    Assert.assertNull(result.bottomLeft.bottomRight);

    // Bottom right
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertFalse(result.bottomRight.val);
    Assert.assertNull(result.bottomRight.topLeft);
    Assert.assertNull(result.bottomRight.topRight);
    Assert.assertNull(result.bottomRight.bottomLeft);
    Assert.assertNull(result.bottomRight.bottomRight);
  }
  
  @Test
  public void testProblemCase2() {
    int[][] grid = { {0,1},
                     {1,1} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
    
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertFalse(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertTrue(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertTrue(result.bottomRight.val);
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = { {1,0},
                     {1,1} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
    
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertFalse(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertTrue(result.bottomRight.val);
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = { {1,1},
                     {0,1} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
    
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertTrue(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertFalse(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertTrue(result.bottomRight.val);
  }

  @Test
  public void testProblemCase5() {
    int[][] grid = { {1,1},
                     {1,0} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
    
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertTrue(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertFalse(result.bottomRight.val);
  }
  
  @Test
  public void testProblemCase6() {
    int[][] grid = { {1,0,0,0},
                     {0,0,0,0},
                     {0,0,0,0},
                     {0,0,0,0} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
  }

  @Test
  public void testProblemCase7() {
    int[][] grid = { {0,0,1,0},
                     {0,0,0,0},
                     {0,0,0,0},
                     {0,0,0,0} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
  }

  @Test
  public void testProblemCase8() {
    int[][] grid = { {0,0,0,0},
                     {0,0,0,0},
                     {1,0,0,0},
                     {0,0,0,0} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
  }

  @Test
  public void testProblemCase9() {
    int[][] grid = { {0,0,0,0},
                     {0,0,0,0},
                     {0,0,1,0},
                     {0,0,0,0} };
    LeetCode427 solution = new LeetCode427();
    Node result = solution.construct(grid);
    Assert.assertFalse(result.isLeaf);
    Assert.assertFalse(result.val);
  }
}
