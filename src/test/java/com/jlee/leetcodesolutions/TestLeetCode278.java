package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode278;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode278 {
  @Test
  public void testFirstBadVersionMiddle() {
    int[] versions = { 0,0,0,0,1,1,1,1,1 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(5, solution.firstBadVersion(n));
  }

  @Test
  public void testFirstBadVersionMiddlePlus1() {
    int[] versions = { 0,0,0,0,0,1,1,1,1 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(6, solution.firstBadVersion(n));
  }

  @Test
  public void testFirstBadVersionMiddleMinus1() {
    int[] versions = { 0,0,0,1,1,1,1,1,1 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(4, solution.firstBadVersion(n));
  }

  @Test
  public void testFirstBadVersionEnd() {
    int[] versions = { 0,0,0,0,0,0,0,0,1 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(9, solution.firstBadVersion(n));
  }

  @Test
  public void testAllBad() {
    int[] versions = { 1,1,1,1,1,1,1,1,1 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testAllGood() {
    int[] versions = { 0,0,0,0,0,0,0,0,0 };
    int n = 9;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(9, solution.firstBadVersion(n));
  }

  @Test
  public void testOneVersionGood() {
    int[] versions = { 0 };
    int n = 1;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testOneVersionBad() {
    int[] versions = { 1 };
    int n = 1;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testTwoVersionsBadEnd() {
    int[] versions = { 0,1 };
    int n = 2;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(2, solution.firstBadVersion(n));
  }

  @Test
  public void testTwoVersionsBadStart() {
    int[] versions = { 1,1 };
    int n = 2;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testTwoVersionsAllGood() {
    int[] versions = { 0,0 };
    int n = 2;
    LeetCode278 solution = new LeetCode278(versions);
    Assert.assertEquals(2, solution.firstBadVersion(n));
  }
}
