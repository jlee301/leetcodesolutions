package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode937;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode937 {
  @Test
  public void testProblemCase1() {
    String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
    LeetCode937 solution = new LeetCode937();
    Assert.assertArrayEquals(new String[] {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"}, solution.reorderLogFiles(logs));
  }

  @Test
  public void testProblemCase2() {
    String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","g0 act car"};
    LeetCode937 solution = new LeetCode937();
    Assert.assertArrayEquals(new String[] {"g0 act car","g1 act car","ab1 off key dog","a1 9 2 3 1","zo4 4 7"}, solution.reorderLogFiles(logs));
  }

  @Test
  public void testProblemCase3() {
    String[] logs = {};
    LeetCode937 solution = new LeetCode937();
    Assert.assertArrayEquals(new String[] {}, solution.reorderLogFiles(logs));
  }

  @Test
  public void testProblemCase4() {
    String[] logs = null;
    LeetCode937 solution = new LeetCode937();
    Assert.assertNull(solution.reorderLogFiles(logs));
  }

  @Test
  public void testProblemCase5() {
    String[] logs = {"a1 9 2 3 1"};
    LeetCode937 solution = new LeetCode937();
    Assert.assertArrayEquals(new String[] {"a1 9 2 3 1"}, solution.reorderLogFiles(logs));
  }
}
