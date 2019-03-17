package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0554;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0554 {
  @Test
  public void testProblemCase() {
    List<List<Integer>> wall = new ArrayList<>();
    wall.add(Arrays.asList(1,2,2,1));
    wall.add(Arrays.asList(3,1,2));
    wall.add(Arrays.asList(1,3,2));
    wall.add(Arrays.asList(2,4));
    wall.add(Arrays.asList(3,1,2));
    wall.add(Arrays.asList(1,3,1,1));
    LeetCode0554 solution = new LeetCode0554();
    Assert.assertEquals(2, solution.leastBricks(wall));
  }

  @Test
  public void testAllRowSameLengthOfBricks() {
    List<List<Integer>> wall = new ArrayList<>();
    wall.add(Arrays.asList(5));
    wall.add(Arrays.asList(5));
    wall.add(Arrays.asList(5));
    wall.add(Arrays.asList(5));
    wall.add(Arrays.asList(5));
    wall.add(Arrays.asList(5));
    LeetCode0554 solution = new LeetCode0554();
    Assert.assertEquals(6, solution.leastBricks(wall));
  }

  @Test
  public void testEmpty() {
    List<List<Integer>> wall = new ArrayList<>();
    LeetCode0554 solution = new LeetCode0554();
    Assert.assertEquals(0, solution.leastBricks(wall));
  }

  @Test
  public void testNull() {
    List<List<Integer>> wall = null;
    LeetCode0554 solution = new LeetCode0554();
    Assert.assertEquals(0, solution.leastBricks(wall));
  }
}
