package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode940;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode940 {
  @Test
  public void testProblemCase1() {
    String S = "abc";
    LeetCode940 solution = new LeetCode940();
    Assert.assertEquals(7, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "aba";
    LeetCode940 solution = new LeetCode940();
    Assert.assertEquals(6, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "aaa";
    LeetCode940 solution = new LeetCode940();
    Assert.assertEquals(3, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn";
    LeetCode940 solution = new LeetCode940();
    Assert.assertEquals(97915677, solution.distinctSubseqII(S));
  }

  @Test
  public void testProblemCase5() {
    String S = "ajxjagdwzxxehvwbxhenrxtoydfobqrlugeuklytwonkrilsthwokzobvtraitboxlsazxstwnjnwnouzuzsskwteuapmmyexvdj";
    LeetCode940 solution = new LeetCode940();
    Assert.assertEquals(584215525, solution.distinctSubseqII(S));
  }
}
