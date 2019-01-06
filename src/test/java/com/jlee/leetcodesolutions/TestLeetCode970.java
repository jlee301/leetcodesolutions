package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode970;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode970 {
  @Test
  public void testProblemCase1() {
    int x = 2, y = 3, bound = 10;
    LeetCode970 solution = new LeetCode970();
    List<Integer> result = solution.powerfulIntegers(x, y, bound);
    // [2,4,10,3,5,7,9]
    Assert.assertEquals(7, result.size());
    Assert.assertTrue(result.contains(2));
    Assert.assertTrue(result.contains(4));
    Assert.assertTrue(result.contains(10));
    Assert.assertTrue(result.contains(3));
    Assert.assertTrue(result.contains(5));
    Assert.assertTrue(result.contains(7));
    Assert.assertTrue(result.contains(9));
  }

  @Test
  public void testProblemCase2() {
    int x = 3, y = 5, bound = 15;
    LeetCode970 solution = new LeetCode970();
    List<Integer> result = solution.powerfulIntegers(x, y, bound);
    // [2,6,4,8,10,14]
    Assert.assertEquals(6, result.size());
    Assert.assertTrue(result.contains(2));
    Assert.assertTrue(result.contains(6));
    Assert.assertTrue(result.contains(4));
    Assert.assertTrue(result.contains(8));
    Assert.assertTrue(result.contains(10));
    Assert.assertTrue(result.contains(14));
  }

  @Test
  public void testProblemCase3() {
    int x = 3, y = 5, bound = 0;
    LeetCode970 solution = new LeetCode970();
    List<Integer> result = solution.powerfulIntegers(x, y, bound);
    // []
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase4() {
    int x = 1, y = 2, bound = 100;
    LeetCode970 solution = new LeetCode970();
    List<Integer> result = solution.powerfulIntegers(x, y, bound);
    // [2,3,5,9,17,33,65]
    Assert.assertEquals(7, result.size());
    Assert.assertTrue(result.contains(2));
    Assert.assertTrue(result.contains(3));
    Assert.assertTrue(result.contains(5));
    Assert.assertTrue(result.contains(9));
    Assert.assertTrue(result.contains(17));
    Assert.assertTrue(result.contains(33));
    Assert.assertTrue(result.contains(65));
  }

  @Test
  public void testProblemCase5() {
    int x = 2, y = 1, bound = 100;
    LeetCode970 solution = new LeetCode970();
    List<Integer> result = solution.powerfulIntegers(x, y, bound);
    // [2,3,5,9,17,33,65]
    Assert.assertEquals(7, result.size());
    Assert.assertTrue(result.contains(2));
    Assert.assertTrue(result.contains(3));
    Assert.assertTrue(result.contains(5));
    Assert.assertTrue(result.contains(9));
    Assert.assertTrue(result.contains(17));
    Assert.assertTrue(result.contains(33));
    Assert.assertTrue(result.contains(65));
  }
}
