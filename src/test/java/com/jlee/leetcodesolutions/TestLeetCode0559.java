package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0559;
import com.jlee.leetcodesolutions.LeetCode0559.Node;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0559 {
  @Test
  public void testProblemCase1() {
    LeetCode0559 solution = new LeetCode0559();
    
    List<Node> children = new ArrayList<>();
    children.add(solution.new Node(5, new ArrayList<>()));
    children.add(solution.new Node(6, new ArrayList<>()));
    Node three = solution.new Node(3, children);
    Node two = solution.new Node(2, new ArrayList<>());
    Node four = solution.new Node(4, new ArrayList<>());
    
    children = new ArrayList<>();
    children.add(three);
    children.add(two);
    children.add(four);
    
    Node root = solution.new Node();
    root.val = 1;
    root.children = children;
    Assert.assertEquals(3, solution.maxDepth(root));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0559 solution = new LeetCode0559();
    
    Node root = null;
    Assert.assertEquals(0, solution.maxDepth(root));
  }
}
