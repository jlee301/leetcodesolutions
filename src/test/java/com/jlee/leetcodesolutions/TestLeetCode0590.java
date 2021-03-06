package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0590;
import com.jlee.leetcodesolutions.LeetCode0590.Node;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0590 {
  @Test
  public void testProblemCase1() {
    LeetCode0590 solution = new LeetCode0590();
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
    List<Integer> result = solution.postorder(root);
    Assert.assertEquals(6, result.size());
    Assert.assertEquals(5, (int) result.get(0));
    Assert.assertEquals(6, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(2, (int) result.get(3));
    Assert.assertEquals(4, (int) result.get(4));
    Assert.assertEquals(1, (int) result.get(5));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0590 solution = new LeetCode0590();
    Node root = null;
    List<Integer> result = solution.postorder(root);
    Assert.assertEquals(0, result.size());
  }
}
