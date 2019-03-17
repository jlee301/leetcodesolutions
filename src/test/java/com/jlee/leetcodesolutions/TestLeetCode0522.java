package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0522;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0522 {
  @Test
  public void testSubseq() {
    String[] strs = {"aba", "cdc", "eae"};
    LeetCode0522 solution = new LeetCode0522();
    Assert.assertEquals(3, solution.findLUSlength(strs));
  }

  @Test
  public void testAllSame() {
    String[] strs = {"aba", "aba", "aba"};
    LeetCode0522 solution = new LeetCode0522();
    Assert.assertEquals(-1, solution.findLUSlength(strs));
  }

  @Test
  public void testEmpty() {
    String[] strs = {};
    LeetCode0522 solution = new LeetCode0522();
    Assert.assertEquals(0, solution.findLUSlength(strs));
  }

  @Test
  public void testNull() {
    String[] strs = null;
    LeetCode0522 solution = new LeetCode0522();
    Assert.assertEquals(0, solution.findLUSlength(strs));
  }
}
