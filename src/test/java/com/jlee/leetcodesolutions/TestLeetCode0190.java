package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0190;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0190 {
  @Test
  public void testProblemCase1() {
    LeetCode0190 solution = new LeetCode0190();
    // 0000 0010 1001 0100 0001 1110 1001 1100 (43261596)
    // 0011 1001 0111 1000 0010 1001 0100 0000 (964176192)
    int result = solution.reverseBits(43261596);
    Assert.assertEquals(964176192, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0190 solution = new LeetCode0190();
    // 0100 0000 0000 0000 0000 0000 0000 0000 (1073741824)
    // 0000 0000 0000 0000 0000 0000 0000 0010 (2)
    int result = solution.reverseBits(1073741824);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0190 solution = new LeetCode0190();
    // 0000 0000 0000 0000 0000 0000 0000 0000 (0)
    // 0000 0000 0000 0000 0000 0000 0000 0000 (0)
    int result = solution.reverseBits(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0190 solution = new LeetCode0190();
    // 0101 0000 0000 0000 0000 0000 0000 0000 (1342177280)
    // 0000 0000 0000 0000 0000 0000 0000 1010 (10)
    int result = solution.reverseBits(1342177280);
    Assert.assertEquals(10, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0190 solution = new LeetCode0190();
    // 0101 0000 0101 0000 0000 0000 0000 0000 (1347420160)
    // 0000 0000 0000 0000 0000 1010 0000 1010 (2570)
    int result = solution.reverseBits(1347420160);
    Assert.assertEquals(2570, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0190 solution = new LeetCode0190();
    // 0000 1111 0000 1111 0000 1111 0000 0000 (252645120)
    // 0000 0000 1111 0000 1111 0000 1111 0000 (15790320)
    int result = solution.reverseBits(252645120);
    Assert.assertEquals(15790320, result);
  }
}
