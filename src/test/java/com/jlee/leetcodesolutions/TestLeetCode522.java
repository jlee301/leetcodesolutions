package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode522;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode522 {
  @Test
  public void testSubseq() {
    String[] strs = {"aba", "cdc", "eae"};
    LeetCode522 solution = new LeetCode522();
    Assert.assertEquals(3, solution.findLUSlength(strs));
  }

  @Test
  public void testAllSame() {
    String[] strs = {"aba", "aba", "aba"};
    LeetCode522 solution = new LeetCode522();
    Assert.assertEquals(-1, solution.findLUSlength(strs));
  }

  @Test
  public void testEmpty() {
    String[] strs = {};
    LeetCode522 solution = new LeetCode522();
    Assert.assertEquals(0, solution.findLUSlength(strs));
  }

  @Test
  public void testNull() {
    String[] strs = null;
    LeetCode522 solution = new LeetCode522();
    Assert.assertEquals(0, solution.findLUSlength(strs));
  }
}
