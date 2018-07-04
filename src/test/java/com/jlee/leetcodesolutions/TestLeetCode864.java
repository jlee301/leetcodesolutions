package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode864;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode864 {
  @Test
  public void testProblemCase1() {
    int N = 1;
    int[] blacklist = {};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    Assert.assertEquals(0, solution.pick());
    Assert.assertEquals(0, solution.pick());
    Assert.assertEquals(0, solution.pick());
    Assert.assertEquals(0, solution.pick());
    Assert.assertEquals(0, solution.pick());
  }

  @Test
  public void testProblemCase2() {
    int N = 2;
    int[] blacklist = {};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }

  @Test
  public void testProblemCase3() {
    int N = 3;
    int[] blacklist = {1};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(2);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }

  @Test
  public void testProblemCase4() {
    int N = 4;
    int[] blacklist = {2};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    set.add(3);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }

  @Test
  public void testProblemCase5() {
    int N = 4;
    int[] blacklist = {1,2,3};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }

  @Test
  public void testProblemCase6() {
    int N = 4;
    int[] blacklist = {1,2,3,4,5,6};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }

  @Test
  public void testProblemCase7() {
    int N = 4;
    int[] blacklist = {3,1};
    LeetCode864 solution = new LeetCode864(N, blacklist);
    HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(2);
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
    Assert.assertTrue(set.contains(solution.pick()));
  }
}
