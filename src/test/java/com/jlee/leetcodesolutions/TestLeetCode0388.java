package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0388;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0388 {
  @Test
  public void testProblemCase() {
    String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
    LeetCode0388 solution = new LeetCode0388();
    Assert.assertEquals(32, solution.lengthLongestPath(input));
  }

  @Test
  public void testNoFiles() {
    String input = "dir\n\tsubdir1\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2";
    LeetCode0388 solution = new LeetCode0388();
    Assert.assertEquals(0, solution.lengthLongestPath(input));
  }

  @Test
  public void testEmpty() {
    String input = "";
    LeetCode0388 solution = new LeetCode0388();
    Assert.assertEquals(0, solution.lengthLongestPath(input));
  }

  @Test
  public void testNull() {
    String input = null;
    LeetCode0388 solution = new LeetCode0388();
    Assert.assertEquals(0, solution.lengthLongestPath(input));
  }
}
