package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode039;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode039 {
  @Test
  public void testProblemCaseTarget7() {
    int[] candidates = {2, 3, 6, 7};
    int target = 7;
    LeetCode039 solution = new LeetCode039();
    List<List<Integer>> result = solution.combinationSum(candidates, target);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(2, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals(7, (int) result.get(1).get(0));
  }

  @Test
  public void testProblemCaseTarget8() {
    int[] candidates = {2, 3, 6, 7};
    int target = 8;
    LeetCode039 solution = new LeetCode039();
    List<List<Integer>> result = solution.combinationSum(candidates, target);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals(2, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(2, (int) result.get(0).get(2));
    Assert.assertEquals(2, (int) result.get(0).get(3));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertEquals(2, (int) result.get(1).get(0));
    Assert.assertEquals(3, (int) result.get(1).get(1));
    Assert.assertEquals(3, (int) result.get(1).get(2));
    Assert.assertEquals(2, result.get(2).size());
    Assert.assertEquals(2, (int) result.get(2).get(0));
    Assert.assertEquals(6, (int) result.get(2).get(1));
  }

  @Test
  public void testEmpty() {
    int[] candidates = {};
    int target = 8;
    LeetCode039 solution = new LeetCode039();
    List<List<Integer>> result = solution.combinationSum(candidates, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] candidates = null;
    int target = 8;
    LeetCode039 solution = new LeetCode039();
    List<List<Integer>> result = solution.combinationSum(candidates, target);
    Assert.assertEquals(0, result.size());
  }
}
