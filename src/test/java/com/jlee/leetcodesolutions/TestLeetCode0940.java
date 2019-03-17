package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0940;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0940 {
  @Test
  public void testProblemCase1() {
    String S = "abc";
    LeetCode0940 solution = new LeetCode0940();
    Assert.assertEquals(7, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "aba";
    LeetCode0940 solution = new LeetCode0940();
    Assert.assertEquals(6, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "aaa";
    LeetCode0940 solution = new LeetCode0940();
    Assert.assertEquals(3, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn";
    LeetCode0940 solution = new LeetCode0940();
    Assert.assertEquals(97915677, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase5() {
    String S = "ajxjagdwzxxehvwbxhenrxtoydfobqrlugeuklytwonkrilsthwokzobvtraitboxlsazxstwnjnwnouzuzsskwteuapmmyexvdj";
    LeetCode0940 solution = new LeetCode0940();
    Assert.assertEquals(584215525, solution.distinctSubseqII(S));
  }
}
