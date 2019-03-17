package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0920;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0920 {
  @Test
  public void testProblemCase1() {
    int N = 3, L = 3, K = 1;
    LeetCode0920 solution = new LeetCode0920();
    Assert.assertEquals(6, solution.numMusicPlaylists(N, L, K));
  }

  @Test
  public void testProblemCase2() {
    int N = 2, L = 3, K = 0;
    LeetCode0920 solution = new LeetCode0920();
    Assert.assertEquals(6, solution.numMusicPlaylists(N, L, K));
  }

  @Test
  public void testProblemCase3() {
    int N = 2, L = 3, K = 1;
    LeetCode0920 solution = new LeetCode0920();
    Assert.assertEquals(2, solution.numMusicPlaylists(N, L, K));
  }
}
