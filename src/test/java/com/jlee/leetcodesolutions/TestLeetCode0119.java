package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0119;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0119 {
  @Test
  public void testProblemCase1() {
    LeetCode0119 solution = new LeetCode0119();
    List<Integer> result = solution.getRow(0);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int)result.get(0));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0119 solution = new LeetCode0119();
    List<Integer> result = solution.getRow(1);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(1, (int)result.get(1));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0119 solution = new LeetCode0119();
    List<Integer> result = solution.getRow(2);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(2, (int)result.get(1));
    Assert.assertEquals(1, (int)result.get(2));
  }

  @Test
  public void testProblemCase4() {
    LeetCode0119 solution = new LeetCode0119();
    List<Integer> result = solution.getRow(3);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(3, (int)result.get(1));
    Assert.assertEquals(3, (int)result.get(2));
    Assert.assertEquals(1, (int)result.get(3));
  }

  @Test
  public void testProblemCase5() {
    LeetCode0119 solution = new LeetCode0119();
    List<Integer> result = solution.getRow(4);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
    Assert.assertEquals(6, (int)result.get(2));
    Assert.assertEquals(4, (int)result.get(3));
    Assert.assertEquals(1, (int)result.get(4));
  }
}
