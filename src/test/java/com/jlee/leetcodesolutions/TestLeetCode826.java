package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode826;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode826 {
  @Test
  public void testProblemCase() {
    int[] difficulty = {2,4,6,8,10}; 
    int[] profit = {10,20,30,40,50}; 
    int[] worker = {4,5,6,7};
    LeetCode826 solution = new LeetCode826();
    Assert.assertEquals(100, solution.maxProfitAssignment(difficulty, profit, worker));
  }

  @Test
  public void testJobsWithSameDifficulty() {
    int[] difficulty = {2,2,2,2,2}; 
    int[] profit = {10,40,30,20,50}; 
    int[] worker = {2,2,2,2};
    LeetCode826 solution = new LeetCode826();
    Assert.assertEquals(200, solution.maxProfitAssignment(difficulty, profit, worker));
  }

  @Test
  public void testLowerDifficultyHasHigherProfit() {
    int[] difficulty = {1,2,2,2,2}; 
    int[] profit = {50,10,20,30,40}; 
    int[] worker = {2,2,2,2};
    LeetCode826 solution = new LeetCode826();
    Assert.assertEquals(200, solution.maxProfitAssignment(difficulty, profit, worker));
  }

  @Test
  public void testWorkerSkillLevelTooLow() {
    int[] difficulty = {2,2,2,2,2}; 
    int[] profit = {50,10,20,30,40}; 
    int[] worker = {1,1,1,1};
    LeetCode826 solution = new LeetCode826();
    Assert.assertEquals(0, solution.maxProfitAssignment(difficulty, profit, worker));
  }
}
