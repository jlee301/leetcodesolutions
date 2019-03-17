package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0133;
import com.jlee.leetcodesolutions.UndirectedGraphNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0133 {
  @Test
  public void testCloneNoNeighbors() {
    UndirectedGraphNode node = new UndirectedGraphNode(1);
    LeetCode0133 solution = new LeetCode0133();
    UndirectedGraphNode result = solution.cloneGraph(node);
    Assert.assertNotEquals(result, node);
    Assert.assertEquals(1, result.label);
    Assert.assertEquals(0, result.neighbors.size());
  }

  @Test
  public void testCloneWithNeighbors() {
    UndirectedGraphNode node = new UndirectedGraphNode(1);
    node.neighbors.add(new UndirectedGraphNode(2));
    LeetCode0133 solution = new LeetCode0133();
    UndirectedGraphNode result = solution.cloneGraph(node);
    Assert.assertNotEquals(result, node);
    Assert.assertEquals(1, result.label);
    Assert.assertEquals(1, result.neighbors.size());
    Assert.assertNotEquals(result.neighbors.get(0), node.neighbors.get(0));
    Assert.assertEquals(2, result.neighbors.get(0).label);
    Assert.assertEquals(0, result.neighbors.get(0).neighbors.size());
  }

  @Test
  public void testCloneWithNeighborToItself() {
    UndirectedGraphNode node = new UndirectedGraphNode(1);
    node.neighbors.add(new UndirectedGraphNode(1));
    LeetCode0133 solution = new LeetCode0133();
    UndirectedGraphNode result = solution.cloneGraph(node);
    Assert.assertNotEquals(result, node);
    Assert.assertEquals(1, result.label);
    Assert.assertEquals(1, result.neighbors.size());
    Assert.assertNotEquals(result.neighbors.get(0), node.neighbors.get(0));
    Assert.assertEquals(1, result.neighbors.get(0).label);
    Assert.assertEquals(1, result.neighbors.get(0).neighbors.size());
  }

  @Test
  public void testNull() {
    UndirectedGraphNode node = null;
    LeetCode0133 solution = new LeetCode0133();
    UndirectedGraphNode result = solution.cloneGraph(node);
    Assert.assertNull(result);
  }
}
