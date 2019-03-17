package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0732;
import com.jlee.leetcodesolutions.LeetCode0732.MyCalendarThree;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0732 {
  @Test
  public void testProblemCase() {
    LeetCode0732 solution = new LeetCode0732();
    MyCalendarThree cal = solution.new MyCalendarThree();
    Assert.assertEquals(1, cal.book(10, 20));
    Assert.assertEquals(1, cal.book(50, 60));
    Assert.assertEquals(2, cal.book(10, 40));
    Assert.assertEquals(3, cal.book(5, 15));
    Assert.assertEquals(3, cal.book(5, 10));
    Assert.assertEquals(3, cal.book(25, 55));
  }

  @Test
  public void testBookingCleanup() {
    LeetCode0732 solution = new LeetCode0732();
    MyCalendarThree cal = solution.new MyCalendarThree();
    Assert.assertEquals(1, cal.book(10, 20));
    Assert.assertEquals(1, cal.book(0, 10));
    Assert.assertEquals(1, cal.book(20, 30));
  }
}
