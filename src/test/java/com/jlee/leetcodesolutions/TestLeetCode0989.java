package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0989;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0989 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,0,0};
    int K = 34;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(4, (int) result.get(3));
  }
  
  @Test
  public void testProblemCase2() {
    int[] A = {2,7,4};
    int K = 181;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(4, (int) result.get(0));
    Assert.assertEquals(5, (int) result.get(1));
    Assert.assertEquals(5, (int) result.get(2));
  }
  
  @Test
  public void testProblemCase3() {
    int[] A = {2,1,5};
    int K = 806;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(0, (int) result.get(1));
    Assert.assertEquals(2, (int) result.get(2));
    Assert.assertEquals(1, (int) result.get(3));
  }
  
  @Test
  public void testProblemCase4() {
    int[] A = {9,9,9,9,9,9,9,9,9,9};
    int K = 1;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(0, (int) result.get(1));
    Assert.assertEquals(0, (int) result.get(2));
    Assert.assertEquals(0, (int) result.get(3));
    Assert.assertEquals(0, (int) result.get(4));
    Assert.assertEquals(0, (int) result.get(5));
    Assert.assertEquals(0, (int) result.get(6));
    Assert.assertEquals(0, (int) result.get(7));
    Assert.assertEquals(0, (int) result.get(8));
    Assert.assertEquals(0, (int) result.get(9));
    Assert.assertEquals(0, (int) result.get(10));
  }
  
  @Test
  public void testProblemCase5() {
    int[] A = {0};
    int K = 23;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {2,3};
    int K = 0;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
  }

  @Test
  public void testProblemCase7() {
    int[] A = {6};
    int K = 809;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(8, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(5, (int) result.get(2));
  }

  @Test
  public void testProblemCase8() {
    int[] A = {6,5,6};
    int K = 6;
    LeetCode0989 solution = new LeetCode0989();
    List<Integer> result = solution.addToArrayForm(A, K);
    Assert.assertEquals(6, (int) result.get(0));
    Assert.assertEquals(6, (int) result.get(1));
    Assert.assertEquals(2, (int) result.get(2));
  }
}
