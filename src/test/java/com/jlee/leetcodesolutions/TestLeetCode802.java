package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode802;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode802 {
  @Test
  public void testProblemCase() {
    int[][] graph = { {1,2}, {2,3}, {5}, {0}, {5}, {}, {} };
    LeetCode802 solution = new LeetCode802();
    List<Integer> result = solution.eventualSafeNodes(graph);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(4, (int) result.get(1));
    Assert.assertEquals(5, (int) result.get(2));
    Assert.assertEquals(6, (int) result.get(3));
  }
}
