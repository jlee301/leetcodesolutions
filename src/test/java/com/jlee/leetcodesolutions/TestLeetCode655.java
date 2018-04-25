package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode655;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode655 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode655 solution = new LeetCode655();
    List<List<String>> result = solution.printTree(root);
    Assert.assertEquals(2, result.size());
    String[] data = new String[result.get(0).size()];
    result.get(0).toArray(data);
    Assert.assertArrayEquals(new String[] {"", "1", ""}, data);
    result.get(1).toArray(data);
    Assert.assertArrayEquals(new String[] {"2", "", ""}, data);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(3);
    LeetCode655 solution = new LeetCode655();
    List<List<String>> result = solution.printTree(root);
    Assert.assertEquals(3, result.size());
    String[] data = new String[result.get(0).size()];
    result.get(0).toArray(data);
    Assert.assertArrayEquals(new String[] {"", "", "", "1", "", "", ""}, data);
    result.get(1).toArray(data);
    Assert.assertArrayEquals(new String[] {"", "2", "", "", "", "3", ""}, data);
    result.get(2).toArray(data);
    Assert.assertArrayEquals(new String[] {"", "", "4", "", "", "", ""}, data);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.right = new TreeNode(5);
    LeetCode655 solution = new LeetCode655();
    List<List<String>> result = solution.printTree(root);
    Assert.assertEquals(4, result.size());
    String[] data = new String[result.get(0).size()];
    result.get(0).toArray(data);
    Assert.assertArrayEquals(new String[] {"",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""}, data);
    result.get(1).toArray(data);
    Assert.assertArrayEquals(new String[] {"",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""}, data);
    result.get(2).toArray(data);
    Assert.assertArrayEquals(new String[] {"",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""}, data);
    result.get(3).toArray(data);
    Assert.assertArrayEquals(new String[] {"4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""}, data);
  }
}
