package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode797;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode797 {
  @Test
  public void testProblemCase() {
    int[][] graph = { {1,2}, {3}, {3}, {} };
    LeetCode797 solution = new LeetCode797();
    List<List<Integer>> result = solution.allPathsSourceTarget(graph);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int) result.get(0).get(0));
    Assert.assertEquals(1, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(0, (int) result.get(1).get(0));
    Assert.assertEquals(2, (int) result.get(1).get(1));
    Assert.assertEquals(3, (int) result.get(1).get(2));
  }
}
