package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0841;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0841 {
  @Test
  public void testProblemCase1() {
    // Input: [[1],[2],[3],[]]
    // Output: true
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(Arrays.asList(1));
    rooms.add(Arrays.asList(2));
    rooms.add(Arrays.asList(3));
    rooms.add(new ArrayList<>());
    LeetCode0841 solution = new LeetCode0841();
    Assert.assertTrue(solution.canVisitAllRooms(rooms));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1,3],[3,0,1],[2],[0]]
    // Output: false
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(Arrays.asList(1,3));
    rooms.add(Arrays.asList(3,0,1));
    rooms.add(Arrays.asList(2));
    rooms.add(Arrays.asList(0));
    LeetCode0841 solution = new LeetCode0841();
    Assert.assertFalse(solution.canVisitAllRooms(rooms));
  }
}
