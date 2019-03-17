package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0278;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0278 {
  @Test
  public void testProblemCase1() {
    int[] versions = { 0,0,0,0,1,1,1,1,1 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(5, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase2() {
    int[] versions = { 0,0,0,0,0,1,1,1,1 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(6, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase3() {
    int[] versions = { 0,0,0,1,1,1,1,1,1 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(4, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase4() {
    int[] versions = { 0,0,0,0,0,0,0,0,1 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(9, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase5() {
    int[] versions = { 1,1,1,1,1,1,1,1,1 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase6() {
    int[] versions = { 0,0,0,0,0,0,0,0,0 };
    int n = 9;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(9, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase7() {
    int[] versions = { 0 };
    int n = 1;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase8() {
    int[] versions = { 1 };
    int n = 1;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase9() {
    int[] versions = { 0,1 };
    int n = 2;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(2, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase10() {
    int[] versions = { 1,1 };
    int n = 2;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(1, solution.firstBadVersion(n));
  }

  @Test
  public void testProblemCase11() {
    int[] versions = { 0,0 };
    int n = 2;
    LeetCode0278 solution = new LeetCode0278(versions);
    Assert.assertEquals(2, solution.firstBadVersion(n));
  }
}
