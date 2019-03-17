package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0728;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0728 {
  @Test
  public void testProblemCase() {
    int left = 1;
    int right = 22;
    LeetCode0728 solution = new LeetCode0728();
    List<Integer> result = solution.selfDividingNumbers(left, right);
    Assert.assertEquals(13, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(4, (int) result.get(3));
    Assert.assertEquals(5, (int) result.get(4));
    Assert.assertEquals(6, (int) result.get(5));
    Assert.assertEquals(7, (int) result.get(6));
    Assert.assertEquals(8, (int) result.get(7));
    Assert.assertEquals(9, (int) result.get(8));
    Assert.assertEquals(11, (int) result.get(9));
    Assert.assertEquals(12, (int) result.get(10));
    Assert.assertEquals(15, (int) result.get(11));
    Assert.assertEquals(22, (int) result.get(12));
  }

  @Test
  public void testSingleCase() {
    int left = 128;
    int right = 128;
    LeetCode0728 solution = new LeetCode0728();
    List<Integer> result = solution.selfDividingNumbers(left, right);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(128, (int) result.get(0));
  }

  @Test
  public void testLeftLessThan1() {
    int left = 0;
    int right = 22;
    LeetCode0728 solution = new LeetCode0728();
    List<Integer> result = solution.selfDividingNumbers(left, right);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testLeftGreaterThanRight() {
    int left = 22;
    int right = 1;
    LeetCode0728 solution = new LeetCode0728();
    List<Integer> result = solution.selfDividingNumbers(left, right);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testRightGreaterThan10000() {
    int left = 1;
    int right = 10001;
    LeetCode0728 solution = new LeetCode0728();
    List<Integer> result = solution.selfDividingNumbers(left, right);
    Assert.assertEquals(0, result.size());
  }
}
