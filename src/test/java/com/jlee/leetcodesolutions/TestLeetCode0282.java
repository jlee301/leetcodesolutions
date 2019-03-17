package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0282;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0282 {
  @Test
  public void testProblemCase1() {
    String num = "123";
    int target = 6;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("1+2+3"));
    Assert.assertTrue(result.contains("1*2*3"));
  }

  @Test
  public void testProblemCase2() {
    String num = "232";
    int target = 8;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("2*3+2"));
    Assert.assertTrue(result.contains("2+3*2"));
  }

  @Test
  public void testProblemCase3() {
    String num = "105";
    int target = 5;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("1*0+5"));
    Assert.assertTrue(result.contains("10-5"));
  }

  @Test
  public void testProblemCase4() {
    String num = "00";
    int target = 0;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("0+0"));
    Assert.assertTrue(result.contains("0-0"));
    Assert.assertTrue(result.contains("0*0"));
  }

  @Test
  public void testProblemCase5() {
    String num = "3456237490";
    int target = 9191;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase6() {
    String num = "";
    int target = 5;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase7() {
    String num = null;
    int target = 5;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase8() {
    String num = "2147483647";
    int target = 2147483647;
    LeetCode0282 solution = new LeetCode0282();
    List<String> result = solution.addOperators(num, target);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("2147483647"));
  }
}
