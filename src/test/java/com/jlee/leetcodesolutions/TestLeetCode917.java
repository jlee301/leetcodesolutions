package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode917;
import org.junit.Assert;
import org.junit.Test;


public class TestLeetCode917 {
  @Test
  public void testProblemCase1() {
    String S = "ab-cd";
    LeetCode917 solution = new LeetCode917();
    Assert.assertEquals("dc-ba", solution.reverseOnlyLetters(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "a-bC-dEf-ghIj";
    LeetCode917 solution = new LeetCode917();
    Assert.assertEquals("j-Ih-gfE-dCba", solution.reverseOnlyLetters(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "Test1ng-Leet=code-Q!";
    LeetCode917 solution = new LeetCode917();
    Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", solution.reverseOnlyLetters(S));
  }
}
