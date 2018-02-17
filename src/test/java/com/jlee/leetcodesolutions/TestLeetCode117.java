package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode117;
import com.jlee.leetcodesolutions.TreeLinkNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode117 {
  @Test
  public void testProblemCase() {
    TreeLinkNode root = new TreeLinkNode(1);
    root.left = new TreeLinkNode(2);
    root.left.left = new TreeLinkNode(4);
    root.left.right = new TreeLinkNode(5);
    root.right = new TreeLinkNode(3);
    root.right.right = new TreeLinkNode(7);
    LeetCode117 solution = new LeetCode117();
    solution.connect(root);
    Assert.assertEquals(1, root.val);
    Assert.assertNull(root.next);
    Assert.assertEquals(2, root.left.val);
    Assert.assertEquals(3, root.left.next.val);
    Assert.assertNull(root.left.next.next);
    Assert.assertEquals(4, root.left.left.val);
    Assert.assertEquals(5, root.left.left.next.val);
    Assert.assertEquals(7, root.left.left.next.next.val);
    Assert.assertNull(root.left.left.next.next.next);
  }

  @Test
  public void testNull() {
    TreeLinkNode root = null;
    LeetCode117 solution = new LeetCode117();
    solution.connect(root);
    Assert.assertNull(root);
  }
}
