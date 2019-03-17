package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0118;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0118 {
  @Test
  public void testProblemCase1() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(5);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int)result.get(0).get(0));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(1, (int)result.get(1).get(0));
    Assert.assertEquals(1, (int)result.get(1).get(1));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals(1, (int)result.get(2).get(0));
    Assert.assertEquals(2, (int)result.get(2).get(1));
    Assert.assertEquals(1, (int)result.get(2).get(2));
    Assert.assertEquals(4, result.get(3).size());
    Assert.assertEquals(1, (int)result.get(3).get(0));
    Assert.assertEquals(3, (int)result.get(3).get(1));
    Assert.assertEquals(3, (int)result.get(3).get(2));
    Assert.assertEquals(1, (int)result.get(3).get(3));
    Assert.assertEquals(5, result.get(4).size());
    Assert.assertEquals(1, (int)result.get(4).get(0));
    Assert.assertEquals(4, (int)result.get(4).get(1));
    Assert.assertEquals(6, (int)result.get(4).get(2));
    Assert.assertEquals(4, (int)result.get(4).get(3));
    Assert.assertEquals(1, (int)result.get(4).get(4));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(4);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int)result.get(0).get(0));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(1, (int)result.get(1).get(0));
    Assert.assertEquals(1, (int)result.get(1).get(1));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals(1, (int)result.get(2).get(0));
    Assert.assertEquals(2, (int)result.get(2).get(1));
    Assert.assertEquals(1, (int)result.get(2).get(2));
    Assert.assertEquals(4, result.get(3).size());
    Assert.assertEquals(1, (int)result.get(3).get(0));
    Assert.assertEquals(3, (int)result.get(3).get(1));
    Assert.assertEquals(3, (int)result.get(3).get(2));
    Assert.assertEquals(1, (int)result.get(3).get(3));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(3);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int)result.get(0).get(0));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(1, (int)result.get(1).get(0));
    Assert.assertEquals(1, (int)result.get(1).get(1));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals(1, (int)result.get(2).get(0));
    Assert.assertEquals(2, (int)result.get(2).get(1));
    Assert.assertEquals(1, (int)result.get(2).get(2));
  }

  @Test
  public void testProblemCase4() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(2);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int)result.get(0).get(0));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(1, (int)result.get(1).get(0));
    Assert.assertEquals(1, (int)result.get(1).get(1));
  }

  @Test
  public void testProblemCase5() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(1);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int)result.get(0).get(0));
  }

  @Test
  public void testProblemCase6() {
    LeetCode0118 solution = new LeetCode0118();
    List<List<Integer>> result = solution.generate(0);
    Assert.assertEquals(0, result.size());
  }
}
