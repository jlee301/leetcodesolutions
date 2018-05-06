package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode830;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode830 {
  @Test
  public void testProblemCase1() {
    String S = "abbxxxxzzy";
    LeetCode830 solution = new LeetCode830();
    List<List<Integer>> result = solution.largeGroupPositions(S);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(3, (int) result.get(0).get(0));
    Assert.assertEquals(6, (int) result.get(0).get(1));
  }

  @Test
  public void testProblemCase2() {
    String S = "abc";
    LeetCode830 solution = new LeetCode830();
    List<List<Integer>> result = solution.largeGroupPositions(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase3() {
    String S = "abcdddeeeeaabbbcd";
    LeetCode830 solution = new LeetCode830();
    List<List<Integer>> result = solution.largeGroupPositions(S);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(3, (int) result.get(0).get(0));
    Assert.assertEquals(5, (int) result.get(0).get(1));
    Assert.assertEquals(6, (int) result.get(1).get(0));
    Assert.assertEquals(9, (int) result.get(1).get(1));
    Assert.assertEquals(12, (int) result.get(2).get(0));
    Assert.assertEquals(14, (int) result.get(2).get(1));
  }
}
