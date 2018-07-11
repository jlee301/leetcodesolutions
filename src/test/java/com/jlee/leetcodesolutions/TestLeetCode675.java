package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode675;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode675 {
  @Test
  public void testProblemCase1() {
    List<List<Integer>> forest = new ArrayList<>();
    forest.add(Arrays.asList(1,2,3));
    forest.add(Arrays.asList(0,0,4));
    forest.add(Arrays.asList(7,6,5));
    LeetCode675 solution = new LeetCode675();
    Assert.assertEquals(6, solution.cutOffTree(forest));
  }

  @Test
  public void testProblemCase2() {
    List<List<Integer>> forest = new ArrayList<>();
    forest.add(Arrays.asList(1,2,3));
    forest.add(Arrays.asList(0,0,0));
    forest.add(Arrays.asList(7,6,5));
    LeetCode675 solution = new LeetCode675();
    Assert.assertEquals(-1, solution.cutOffTree(forest));
  }

  @Test
  public void testProblemCase3() {
    List<List<Integer>> forest = new ArrayList<>();
    forest.add(Arrays.asList(2,3,4));
    forest.add(Arrays.asList(0,0,5));
    forest.add(Arrays.asList(8,7,6));
    LeetCode675 solution = new LeetCode675();
    Assert.assertEquals(6, solution.cutOffTree(forest));
  }

  @Test
  public void testProblemCase4() {
    List<List<Integer>> forest = new ArrayList<>();
    forest.add(Arrays.asList(54581641,64080174,24346381,69107959));
    forest.add(Arrays.asList(86374198,61363882,68783324,79706116));
    forest.add(Arrays.asList(668150,92178815,89819108,94701471));
    forest.add(Arrays.asList(83920491,22724204,46281641,47531096));
    forest.add(Arrays.asList(89078499,18904913,25462145,60813308));
    LeetCode675 solution = new LeetCode675();
    Assert.assertEquals(57, solution.cutOffTree(forest));
  }
}
