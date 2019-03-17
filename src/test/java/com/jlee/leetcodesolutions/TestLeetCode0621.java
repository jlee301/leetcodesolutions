package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0621;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0621 {
  @Test
  public void testProblemCase() {
    char[] tasks = {'A','A','A','B','B','B'};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(8, solution.leastInterval(tasks, n));
  }

  @Test
  public void testProblemCaseExtended() {
    char[] tasks = {'A','A','A','B','B','B','C','C','C'};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(9, solution.leastInterval(tasks, n));
  }

  @Test
  public void testAllSingleFrequency() {
    char[] tasks = {'A','B','C'};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(3, solution.leastInterval(tasks, n));
  }
  
  @Test
  public void testSingleTask() {
    char[] tasks = {'A'};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(1, solution.leastInterval(tasks, n));
  }

  @Test
  public void testEveryPossibleTasks() {
    char[] tasks = { 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H', 'I', 'I', 'J', 'J',
        'K', 'K', 'L', 'L', 'M', 'M', 'N', 'N', 'O', 'O', 'P', 'P', 'Q', 'Q', 'R', 'R', 'S', 'S', 'T', 'T', 'U', 'U',
        'V', 'V', 'W', 'W', 'X', 'X', 'Y', 'Y', 'Z', 'Z' };
    int n = 25;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(52, solution.leastInterval(tasks, n));
  }

  @Test
  public void testMustIdle() {
    char[] tasks = { 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E'};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(13, solution.leastInterval(tasks, n));
  }

  @Test
  public void testN0() {
    char[] tasks = {'A','A','A','B','B','B'};
    int n = 0;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(6, solution.leastInterval(tasks, n));
  }

  @Test
  public void testEmpty() {
    char[] tasks = {};
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(0, solution.leastInterval(tasks, n));
  }

  @Test
  public void testNull() {
    char[] tasks = null;
    int n = 2;
    LeetCode0621 solution = new LeetCode0621();
    Assert.assertEquals(0, solution.leastInterval(tasks, n));
  }
}
