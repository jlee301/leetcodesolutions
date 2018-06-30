package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode699;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode699 {
  @Test
  public void testProblemCase1() {
    // Input: [[1, 2], [2, 3], [6, 1]]
    // Output: [2, 5, 5]
    int[][] positions = { {1,2}, {2,3}, {6,1} };
    LeetCode699 solution = new LeetCode699();
    List<Integer> result = solution.fallingSquares(positions);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(5, (int) result.get(1));
    Assert.assertEquals(5, (int) result.get(2));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[100, 100], [200, 100]]
    // Output: [100, 100]
    int[][] positions = { {100,100}, {200,100} };
    LeetCode699 solution = new LeetCode699();
    List<Integer> result = solution.fallingSquares(positions);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(100, (int) result.get(0));
    Assert.assertEquals(100, (int) result.get(1));
  }

  @Test
  public void testProblemCase3() {
    // Input: [[1,5],[2,2],[7,5]]
    // Output: [5,7,7]
    int[][] positions = { {1,5}, {2,2}, {7,5} };
    LeetCode699 solution = new LeetCode699();
    List<Integer> result = solution.fallingSquares(positions);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(5, (int) result.get(0));
    Assert.assertEquals(7, (int) result.get(1));
    Assert.assertEquals(7, (int) result.get(2));
  }
}
