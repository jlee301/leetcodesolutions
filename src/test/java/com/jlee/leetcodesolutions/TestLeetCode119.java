package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode119;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode119 {
  @Test
  public void test0IndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(0);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int)result.get(0));
  }

  @Test
  public void test1IndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(1);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(1, (int)result.get(1));
  }

  @Test
  public void test2IndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(2);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(2, (int)result.get(1));
    Assert.assertEquals(1, (int)result.get(2));
  }

  @Test
  public void test3IndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(3);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(3, (int)result.get(1));
    Assert.assertEquals(3, (int)result.get(2));
    Assert.assertEquals(1, (int)result.get(3));
  }

  @Test
  public void test4IndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(4);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(1, (int)result.get(0));
    Assert.assertEquals(4, (int)result.get(1));
    Assert.assertEquals(6, (int)result.get(2));
    Assert.assertEquals(4, (int)result.get(3));
    Assert.assertEquals(1, (int)result.get(4));
  }

  @Test
  public void testNegIndexPascal() {
    LeetCode119 solution = new LeetCode119();
    List<Integer> result = solution.getRow(-1);
    Assert.assertEquals(0, result.size());
  }
}
