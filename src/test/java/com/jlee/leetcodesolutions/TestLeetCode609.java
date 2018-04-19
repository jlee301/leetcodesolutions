package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode609;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode609 {
  @Test
  public void testProblemCase() {
    String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
    LeetCode609 solution = new LeetCode609();
    List<List<String>> result = solution.findDuplicate(paths);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertTrue(result.get(0).contains("root/a/1.txt"));
    Assert.assertTrue(result.get(0).contains("root/c/3.txt"));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertTrue(result.get(1).contains("root/a/2.txt"));
    Assert.assertTrue(result.get(1).contains("root/c/d/4.txt"));
    Assert.assertTrue(result.get(1).contains("root/4.txt"));
  }

  @Test
  public void testNoDuplicates() {
    String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcde)"};
    LeetCode609 solution = new LeetCode609();
    List<List<String>> result = solution.findDuplicate(paths);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    String[] paths = {};
    LeetCode609 solution = new LeetCode609();
    List<List<String>> result = solution.findDuplicate(paths);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String[] paths = null;
    LeetCode609 solution = new LeetCode609();
    List<List<String>> result = solution.findDuplicate(paths);
    Assert.assertEquals(0, result.size());
  }
}
