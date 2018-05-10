package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode779;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode779 {
  @Test
  public void testProblemCase1() {
    int N = 1, K = 1;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(0, solution.kthGrammar(N, K));
  }

  @Test
  public void testProblemCase2() {
    int N = 2, K = 1;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(0, solution.kthGrammar(N, K));
  }

  @Test
  public void testProblemCase3() {
    int N = 2, K = 2;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(1, solution.kthGrammar(N, K));
  }

  @Test
  public void testProblemCase4() {
    int N = 4, K = 5;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(1, solution.kthGrammar(N, K));
  }

  @Test
  public void testN3K1() {
    int N = 3, K = 1;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(0, solution.kthGrammar(N, K));
  }

  @Test
  public void testN3K2() {
    int N = 3, K = 2;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(1, solution.kthGrammar(N, K));
  }

  @Test
  public void testN3K3() {
    int N = 3, K = 3;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(1, solution.kthGrammar(N, K));
  }

  @Test
  public void testN3K4() {
    int N = 3, K = 4;
    LeetCode779 solution = new LeetCode779();
    Assert.assertEquals(0, solution.kthGrammar(N, K));
  }
}
