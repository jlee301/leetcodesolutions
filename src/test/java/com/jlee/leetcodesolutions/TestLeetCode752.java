package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode752;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode752 {
  @Test
  public void testProblemCase1() {
    String[] deadends = {"0201","0101","0102","1212","2002"};
    String target = "0202";
    LeetCode752 solution = new LeetCode752();
    Assert.assertEquals(6, solution.openLock(deadends, target));
  }

  @Test
  public void testProblemCase2() {
    String[] deadends = {"8888"};
    String target = "0009";
    LeetCode752 solution = new LeetCode752();
    Assert.assertEquals(1, solution.openLock(deadends, target));
  }

  @Test
  public void testProblemCase3() {
    String[] deadends = {"8887","8889","8878","8898","8788","8988","7888","9888"};
    String target = "8888";
    LeetCode752 solution = new LeetCode752();
    Assert.assertEquals(-1, solution.openLock(deadends, target));
  }

  @Test
  public void testProblemCase4() {
    String[] deadends = {"0000"};
    String target = "8888";
    LeetCode752 solution = new LeetCode752();
    Assert.assertEquals(-1, solution.openLock(deadends, target));
  }
}
