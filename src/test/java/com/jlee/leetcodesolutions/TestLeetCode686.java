package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode686;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode686 {
  @Test
  public void testAandBSame() {
    String A = "a";
    String B = "a";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testAandBTwoTimes() {
    String A = "ab";
    String B = "abab";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(2, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testAandBThreeTimes() {
    String A = "ab";
    String B = "baba";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(3, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testAandBDifferent() {
    String A = "ab";
    String B = "cdef";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testAEmpty() {
    String A = "";
    String B = "cdef";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testBEmpty() {
    String A = "ab";
    String B = "";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }
  
  @Test
  public void testEmpty() {
    String A = "";
    String B = "";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testANull() {
    String A = null;
    String B = "cdef";
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testBNull() {
    String A = "ab";
    String B = null;
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }
  
  @Test
  public void testNull() {
    String A = null;
    String B = null;
    LeetCode686 solution = new LeetCode686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }
}
