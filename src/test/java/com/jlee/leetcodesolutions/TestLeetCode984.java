package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode984;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode984 {
  @Test
  public void testProblemCase1() {
    int A = 1, B = 2;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bba", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase2() {
    int A = 4, B = 1;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("aabaa", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase3() {
    int A = 2, B = 1;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("aab", solution.strWithout3a3b(A, B));
  }
  
  @Test
  public void testProblemCase4() {
    int A = 1, B = 4;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bbabb", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase5() {
    int A = 4, B = 4;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("abababab", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase6() {
    int A = 5, B = 6;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bbababababa", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase7() {
    int A = 3, B = 5;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bbabbaba", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase8() {
    int A = 27, B = 33;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bbabbabbabbabbabbabababababababababababababababababababababa", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase9() {
    int A = 5, B = 2;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("aabaaba", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase10() {
    int A = 2, B = 5;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("bbabbab", solution.strWithout3a3b(A, B));
  }

  @Test
  public void testProblemCase11() {
    int A = 33, B = 27;
    LeetCode984 solution = new LeetCode984();
    Assert.assertEquals("aabaabaabaabaabaabababababababababababababababababababababab", solution.strWithout3a3b(A, B));
  }
}
