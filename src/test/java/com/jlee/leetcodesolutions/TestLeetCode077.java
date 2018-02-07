package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode077;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode077 {
  @Test
  public void testN4K1() {
    int n = 4, k = 1;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals(2, (int) result.get(1).get(0));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
    Assert.assertEquals(1, result.get(3).size());
    Assert.assertEquals(4, (int) result.get(3).get(0));
  }

  @Test
  public void testN4K2() {
    int n = 4, k = 2;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(6, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(1, (int) result.get(1).get(0));
    Assert.assertEquals(3, (int) result.get(1).get(1));
    Assert.assertEquals(2, result.get(2).size());
    Assert.assertEquals(1, (int) result.get(2).get(0));
    Assert.assertEquals(4, (int) result.get(2).get(1));
    Assert.assertEquals(2, result.get(3).size());
    Assert.assertEquals(2, (int) result.get(3).get(0));
    Assert.assertEquals(3, (int) result.get(3).get(1));
    Assert.assertEquals(2, result.get(4).size());
    Assert.assertEquals(2, (int) result.get(4).get(0));
    Assert.assertEquals(4, (int) result.get(4).get(1));
    Assert.assertEquals(2, result.get(5).size());
    Assert.assertEquals(3, (int) result.get(5).get(0));
    Assert.assertEquals(4, (int) result.get(5).get(1));
  }

  @Test
  public void testN4K3() {
    int n = 4, k = 3;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(1).get(0));
    Assert.assertEquals(2, (int) result.get(1).get(1));
    Assert.assertEquals(4, (int) result.get(1).get(2));
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(2).get(0));
    Assert.assertEquals(3, (int) result.get(2).get(1));
    Assert.assertEquals(4, (int) result.get(2).get(2));
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals(2, (int) result.get(3).get(0));
    Assert.assertEquals(3, (int) result.get(3).get(1));
    Assert.assertEquals(4, (int) result.get(3).get(2));
  }

  @Test
  public void testN4K4() {
    int n = 4, k = 4;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(4, (int) result.get(0).get(3));
  }

  @Test
  public void testN4K5() {
    int n = 4, k = 5;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testN0() {
    int n = 0, k = 2;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testK0() {
    int n = 4, k = 0;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testZero() {
    int n = 0, k = 0;
    LeetCode077 solution = new LeetCode077();
    List<List<Integer>> result = solution.combine(n, k);
    Assert.assertEquals(0, result.size());
  }
}
