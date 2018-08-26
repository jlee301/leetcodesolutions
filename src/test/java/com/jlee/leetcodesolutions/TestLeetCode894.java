package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode894;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode894 {
  @Test
  public void testProblemCase1() {
    int N = 1;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(1, result.size());
  }

  @Test
  public void testProblemCase3() {
    int N = 3;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(1, result.size());
  }

  @Test
  public void testProblemCase5() {
    int N = 5;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(2, result.size());
  }

  @Test
  public void testProblemCase7() {
    int N = 7;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(5, result.size());
  }
  
  @Test
  public void testProblemCase9() {
    int N = 9;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(14, result.size());
  }
  
  @Test
  public void testProblemCase11() {
    int N = 11;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(42, result.size());
  }
  
  @Test
  public void testProblemCase13() {
    int N = 13;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(132, result.size());
  }
  
  @Test
  public void testProblemCase15() {
    int N = 15;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(429, result.size());
  }
  
  @Test
  public void testProblemCase17() {
    int N = 17;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(1430, result.size());
  }
  
  @Test
  public void testProblemCase19() {
    int N = 19;
    LeetCode894 solution = new LeetCode894();
    List<TreeNode> result = solution.allPossibleFBT(N);
    Assert.assertEquals(4862, result.size());
  }
  
  @Test
  public void testProblemCaseEvens() {
    for(int N = 2; N <= 20; N = N + 2) {
      LeetCode894 solution = new LeetCode894();
      List<TreeNode> result = solution.allPossibleFBT(N);
      Assert.assertEquals(0, result.size());      
    }
  }
}
