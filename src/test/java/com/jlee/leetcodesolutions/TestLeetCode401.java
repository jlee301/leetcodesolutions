package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode401;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode401 {
  @Test
  public void testProblemCase1() {
    LeetCode401 solution = new LeetCode401();
    int num = 1;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(10, result.size());
    Assert.assertTrue(result.contains("0:01"));
    Assert.assertTrue(result.contains("0:02"));
    Assert.assertTrue(result.contains("0:04"));
    Assert.assertTrue(result.contains("0:08"));
    Assert.assertTrue(result.contains("0:16"));
    Assert.assertTrue(result.contains("0:32"));
    Assert.assertTrue(result.contains("1:00"));
    Assert.assertTrue(result.contains("2:00"));
    Assert.assertTrue(result.contains("4:00"));
    Assert.assertTrue(result.contains("8:00"));
  }

  @Test
  public void testProblemCase2() {
    LeetCode401 solution = new LeetCode401();
    int num = 8;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(8, result.size());
    Assert.assertTrue(result.contains("7:31"));
    Assert.assertTrue(result.contains("7:47"));
    Assert.assertTrue(result.contains("7:55"));
    Assert.assertTrue(result.contains("7:59"));
    Assert.assertTrue(result.contains("11:31"));
    Assert.assertTrue(result.contains("11:47"));
    Assert.assertTrue(result.contains("11:55"));
    Assert.assertTrue(result.contains("11:59"));
  }

  @Test
  public void testProblemCase3() {
    LeetCode401 solution = new LeetCode401();
    int num = 0;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("0:00"));
  }

  @Test
  public void testProblemCase4() {
    LeetCode401 solution = new LeetCode401();
    int num = 9;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase5() {
    LeetCode401 solution = new LeetCode401();
    int num = 10;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase6() {
    LeetCode401 solution = new LeetCode401();
    int num = -1;
    List<String> result = solution.readBinaryWatch(num);
    Assert.assertEquals(0, result.size());
  }
}
