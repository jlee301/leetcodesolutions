package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0332;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0332 {
  @Test
  public void testProblemCase1() {
    String[][] tickets = { {"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"} };
    LeetCode0332 solution = new LeetCode0332();
    List<String> result = solution.findItinerary(tickets);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals("JFK", result.get(0));
    Assert.assertEquals("MUC", result.get(1));
    Assert.assertEquals("LHR", result.get(2));
    Assert.assertEquals("SFO", result.get(3));
    Assert.assertEquals("SJC", result.get(4));
  }

  @Test
  public void testProblemCase2() {
    String[][] tickets = { {"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"} };
    LeetCode0332 solution = new LeetCode0332();
    List<String> result = solution.findItinerary(tickets);
    Assert.assertEquals(6, result.size());
    Assert.assertEquals("JFK", result.get(0));
    Assert.assertEquals("ATL", result.get(1));
    Assert.assertEquals("JFK", result.get(2));
    Assert.assertEquals("SFO", result.get(3));
    Assert.assertEquals("ATL", result.get(4));
    Assert.assertEquals("SFO", result.get(5));
  }

  @Test
  public void testWrongAnswer() {
    String[][] tickets = { {"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"} };
    LeetCode0332 solution = new LeetCode0332();
    List<String> result = solution.findItinerary(tickets);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("JFK", result.get(0));
    Assert.assertEquals("NRT", result.get(1));
    Assert.assertEquals("JFK", result.get(2));
    Assert.assertEquals("KUL", result.get(3));
  }

  @Test
  public void testEmpty() {
    String[][] tickets = {};
    LeetCode0332 solution = new LeetCode0332();
    List<String> result = solution.findItinerary(tickets);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("JFK", result.get(0));
  }

  @Test
  public void testNull() {
    String[][] tickets = null;
    LeetCode0332 solution = new LeetCode0332();
    List<String> result = solution.findItinerary(tickets);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("JFK", result.get(0));
  }
}
