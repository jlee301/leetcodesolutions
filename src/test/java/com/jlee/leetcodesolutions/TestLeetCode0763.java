package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0763;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0763 {
  @Test
  public void testProblemCase() {
    String S = "ababcbacadefegdehijhklij";
    LeetCode0763 solution = new LeetCode0763();
    List<Integer> result = solution.partitionLabels(S);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(9, (int) result.get(0));
    Assert.assertEquals(7, (int) result.get(1));
    Assert.assertEquals(8, (int) result.get(2));
  }

  @Test
  public void testAllSingles() {
    String S = "abc";
    LeetCode0763 solution = new LeetCode0763();
    List<Integer> result = solution.partitionLabels(S);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(1, (int) result.get(2));
  }
}
