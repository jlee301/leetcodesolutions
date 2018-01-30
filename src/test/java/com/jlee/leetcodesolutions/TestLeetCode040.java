package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode040;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode040 {
  @Test
  public void testProblemCaseTarget8() {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    //[ [1, 7], [1, 2, 5], [2, 6], [1, 1, 6] ]
    int target = 8;
    LeetCode040 solution = new LeetCode040();
    List<List<Integer>> result = solution.combinationSum2(candidates, target);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(1, (int) result.get(0).get(1));
    Assert.assertEquals(6, (int) result.get(0).get(2));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertEquals(1, (int) result.get(1).get(0));
    Assert.assertEquals(2, (int) result.get(1).get(1));
    Assert.assertEquals(5, (int) result.get(1).get(2));
    Assert.assertEquals(2, result.get(2).size());
    Assert.assertEquals(1, (int) result.get(2).get(0));
    Assert.assertEquals(7, (int) result.get(2).get(1));
    Assert.assertEquals(2, result.get(2).size());
    Assert.assertEquals(2, (int) result.get(3).get(0));
    Assert.assertEquals(6, (int) result.get(3).get(1));
  }
  
  @Test
  public void testEmpty() {
    int[] candidates = {};
    int target = 8;
    LeetCode040 solution = new LeetCode040();
    List<List<Integer>> result = solution.combinationSum2(candidates, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] candidates = null;
    int target = 8;
    LeetCode040 solution = new LeetCode040();
    List<List<Integer>> result = solution.combinationSum2(candidates, target);
    Assert.assertEquals(0, result.size());
  }
}
