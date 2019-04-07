package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1024;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1024 {
  @Test
  public void testProblemCase1() {
    int[][] clips = {{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}};
    int T = 10;
    LeetCode1024 solution = new LeetCode1024();
    Assert.assertEquals(3, solution.videoStitching(clips, T));
  }

  @Test
  public void testProblemCase2() {
    int[][] clips = {{0,1},{1,2}};
    int T = 5;
    LeetCode1024 solution = new LeetCode1024();
    Assert.assertEquals(-1, solution.videoStitching(clips, T));
  }

  @Test
  public void testProblemCase3() {
    int[][] clips = {{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
    int T = 9;
    LeetCode1024 solution = new LeetCode1024();
    Assert.assertEquals(3, solution.videoStitching(clips, T));
  }

  @Test
  public void testProblemCase4() {
    int[][] clips = {{0,4},{2,8}};
    int T = 5;
    LeetCode1024 solution = new LeetCode1024();
    Assert.assertEquals(2, solution.videoStitching(clips, T));
  }

  @Test
  public void testProblemCase5() {
    int[][] clips = {{0,4},{5,8}};
    int T = 8;
    LeetCode1024 solution = new LeetCode1024();
    Assert.assertEquals(-1, solution.videoStitching(clips, T));
  }
}
