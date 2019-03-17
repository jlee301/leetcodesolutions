package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import com.jlee.leetcodesolutions.LeetCode0429;
import com.jlee.leetcodesolutions.LeetCode0429.Node;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0429 {
  @Test
  public void testProblemCase1() {
    LeetCode0429 solution = new LeetCode0429();
    Node[] level2 = new Node[2];
    level2[0] = solution.new Node(5, new ArrayList<>());
    level2[1] = solution.new Node(6, new ArrayList<>());
    
    Node[] level1 = new Node[3];
    level1[0] = solution.new Node(3, Arrays.asList(level2));
    level1[1] = solution.new Node(2, new ArrayList<>());
    level1[2] = solution.new Node(4, new ArrayList<>());
    
    Node root = solution.new Node(1, Arrays.asList(level1));
    
    List<List<Integer>> result = solution.levelOrder(root);
    Assert.assertEquals(3, result.size());
    Integer[] temp = new Integer[result.get(0).size()];
    temp = result.get(0).toArray(temp);
    Assert.assertArrayEquals(new Integer[] {1}, temp);

    temp = new Integer[result.get(1).size()];
    temp = result.get(1).toArray(temp);
    Assert.assertArrayEquals(new Integer[] {3,2,4}, temp);

    temp = new Integer[result.get(2).size()];
    temp = result.get(2).toArray(temp);
    Assert.assertArrayEquals(new Integer[] {5,6}, temp);
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode0429 solution = new LeetCode0429();
    Node root = solution.new Node();
    root = null;
    
    List<List<Integer>> result = solution.levelOrder(root);
    Assert.assertEquals(0, result.size());
  }
}
