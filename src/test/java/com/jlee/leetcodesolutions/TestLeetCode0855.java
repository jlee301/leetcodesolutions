package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0855;
import com.jlee.leetcodesolutions.LeetCode0855.ExamRoom;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0855 {
  @Test
  public void testProblemCase1() {
    LeetCode0855 solution = new LeetCode0855();
    ExamRoom er = solution. new ExamRoom(10);
    Assert.assertEquals(0, er.seat());
    Assert.assertEquals(9, er.seat());
    Assert.assertEquals(4, er.seat());
    Assert.assertEquals(2, er.seat());
    er.leave(4);
    Assert.assertEquals(5, er.seat());
  }
}
