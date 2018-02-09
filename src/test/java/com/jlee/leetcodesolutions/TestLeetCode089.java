package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode089;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode089 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode089 solution = new LeetCode089();
    List<Integer> result = solution.grayCode(n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode089 solution = new LeetCode089();
    List<Integer> result = solution.grayCode(n);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode089 solution = new LeetCode089();
    List<Integer> result = solution.grayCode(n);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(0, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(2, (int) result.get(3));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode089 solution = new LeetCode089();
    List<Integer> result = solution.grayCode(n);
    Assert.assertEquals(8, result.size());
    Assert.assertEquals(0, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(2, (int) result.get(3));
    Assert.assertEquals(6, (int) result.get(4));
    Assert.assertEquals(7, (int) result.get(5));
    Assert.assertEquals(5, (int) result.get(6));
    Assert.assertEquals(4, (int) result.get(7));
  }

  @Test
  public void testNeg() {
    int n = -1;
    LeetCode089 solution = new LeetCode089();
    List<Integer> result = solution.grayCode(n);
    Assert.assertEquals(0, result.size());
  }
}
