package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1104;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1104 {
  @Test
  public void testProblemCase1() {
    int label = 14;
    LeetCode1104 solution = new LeetCode1104();
    List<Integer> result = solution.pathInZigZagTree(label);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(4, (int) result.get(2));
    Assert.assertEquals(14, (int) result.get(3));
  }
  
  @Test
  public void testProblemCase2() {
    int label = 26;
    LeetCode1104 solution = new LeetCode1104();
    List<Integer> result = solution.pathInZigZagTree(label);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(6, (int) result.get(2));
    Assert.assertEquals(10, (int) result.get(3));
    Assert.assertEquals(26, (int) result.get(4));
  }
}
