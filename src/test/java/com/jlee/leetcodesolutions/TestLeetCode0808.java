package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0808;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0808 {
  @Test
  public void testProblemCase() {
    int N = 50;
    LeetCode0808 solution = new LeetCode0808();
    Assert.assertEquals(0.625, solution.soupServings(N), 0.0);
  }

  @Test
  public void testWrongAns() {
    int N = 101;
    LeetCode0808 solution = new LeetCode0808();
    Assert.assertEquals(0.7421875, solution.soupServings(N), 0.0);
  }

  @Test
  public void testN660295675() {
    int N = 660295675;
    LeetCode0808 solution = new LeetCode0808();
    Assert.assertEquals(1.0, solution.soupServings(N), 0.0);
  }
}
