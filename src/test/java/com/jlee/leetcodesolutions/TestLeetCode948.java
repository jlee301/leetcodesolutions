package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode948;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode948 {
  @Test
  public void testProblemCase1() {
    int[] tokens = {100};
    int P = 50;
    LeetCode948 solution = new LeetCode948();
    Assert.assertEquals(0, solution.bagOfTokensScore(tokens, P));
  }

  @Test
  public void testProblemCase2() {
    int[] tokens = {100,200};
    int P = 150;
    LeetCode948 solution = new LeetCode948();
    Assert.assertEquals(1, solution.bagOfTokensScore(tokens, P));
  }

  @Test
  public void testProblemCase3() {
    int[] tokens = {100,200,300,400};
    int P = 200;
    LeetCode948 solution = new LeetCode948();
    Assert.assertEquals(2, solution.bagOfTokensScore(tokens, P));
  }

  @Test
  public void testProblemCase4() {
    int[] tokens = {52,65,35,88,28,1,4,68,56,95};
    int P = 94;
    LeetCode948 solution = new LeetCode948();
    Assert.assertEquals(5, solution.bagOfTokensScore(tokens, P));
  }

  @Test
  public void testProblemCase5() {
    int[] tokens = {100,200};
    int P = 100;
    LeetCode948 solution = new LeetCode948();
    Assert.assertEquals(1, solution.bagOfTokensScore(tokens, P));
  }
}
