package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode492;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode492 {
  @Test
  public void test0() {
    int area = 0;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }

  @Test
  public void test1() {
    int area = 1;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(1, result[1]);
  }
  
  @Test
  public void test2() {
    int area = 2;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void test3() {
    int area = 3;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void test4() {
    int area = 4;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void test5() {
    int area = 5;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(5, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void test6() {
    int area = 6;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void test7() {
    int area = 7;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(7, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void test8() {
    int area = 8;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(4, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void test9() {
    int area = 9;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void test10() {
    int area = 10;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(5, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testNeg() {
    int area = -1;
    LeetCode492 solution = new LeetCode492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }
}
