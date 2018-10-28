package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode929;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode929 {
  @Test
  public void testProblemCase1() {
    String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    LeetCode929 solution = new LeetCode929();
    Assert.assertEquals(2, solution.numUniqueEmails(emails));
  }

  @Test
  public void testProblemCase2() {
    String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com","testemail@leetcode.com"};
    LeetCode929 solution = new LeetCode929();
    Assert.assertEquals(2, solution.numUniqueEmails(emails));
  }
}
