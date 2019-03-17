package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0492;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0492 {
  @Test
  public void testProblemCase1() {
    int area = 1;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(1, result[1]);
  }
  
  @Test
  public void testProblemCase2() {
    int area = 2;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void testProblemCase3() {
    int area = 3;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void testProblemCase4() {
    int area = 4;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase5() {
    int area = 5;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(5, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void testProblemCase6() {
    int area = 6;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase7() {
    int area = 7;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(7, result[0]);
    Assert.assertEquals(1, result[1]);
  }

  @Test
  public void testProblemCase8() {
    int area = 8;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(4, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase9() {
    int area = 9;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase10() {
    int area = 10;
    LeetCode0492 solution = new LeetCode0492();
    int[] result = solution.constructRectangle(area);
    Assert.assertEquals(5, result[0]);
    Assert.assertEquals(2, result[1]);
  }
}
