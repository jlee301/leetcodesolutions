package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode051;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode051 {
  @Test
  public void testProblemCase1() {
    int n = 4;
    LeetCode051 solution = new LeetCode051();
    List<List<String>> result = solution.solveNQueens(n);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals(".Q..", result.get(0).get(0));
    Assert.assertEquals("...Q", result.get(0).get(1));
    Assert.assertEquals("Q...", result.get(0).get(2));
    Assert.assertEquals("..Q.", result.get(0).get(3));
    Assert.assertEquals(4, result.get(1).size());
    Assert.assertEquals("..Q.", result.get(1).get(0));
    Assert.assertEquals("Q...", result.get(1).get(1));
    Assert.assertEquals("...Q", result.get(1).get(2));
    Assert.assertEquals(".Q..", result.get(1).get(3));
  }

  @Test
  public void testProblemCase2() {
    int n = 2;
    LeetCode051 solution = new LeetCode051();
    List<List<String>> result = solution.solveNQueens(n);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase3() {
    int n = 1;
    LeetCode051 solution = new LeetCode051();
    List<List<String>> result = solution.solveNQueens(n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals("Q", result.get(0).get(0));
  }

  @Test
  public void testProblemCase4() {
    int n = 5;
    LeetCode051 solution = new LeetCode051();
    List<List<String>> result = solution.solveNQueens(n);
    Assert.assertEquals(10, result.size());
    String[] strData = new String[n];
    Assert.assertArrayEquals(new String[] {"Q....","..Q..","....Q",".Q...","...Q."}, result.get(0).toArray(strData));
    Assert.assertArrayEquals(new String[] {"Q....","...Q.",".Q...","....Q","..Q.."}, result.get(1).toArray(strData));
    Assert.assertArrayEquals(new String[] {".Q...","...Q.","Q....","..Q..","....Q"}, result.get(2).toArray(strData));
    Assert.assertArrayEquals(new String[] {".Q...","....Q","..Q..","Q....","...Q."}, result.get(3).toArray(strData));
    Assert.assertArrayEquals(new String[] {"..Q..","Q....","...Q.",".Q...","....Q"}, result.get(4).toArray(strData));
    Assert.assertArrayEquals(new String[] {"..Q..","....Q",".Q...","...Q.","Q...."}, result.get(5).toArray(strData));
    Assert.assertArrayEquals(new String[] {"...Q.","Q....","..Q..","....Q",".Q..."}, result.get(6).toArray(strData));
    Assert.assertArrayEquals(new String[] {"...Q.",".Q...","....Q","..Q..","Q...."}, result.get(7).toArray(strData));
    Assert.assertArrayEquals(new String[] {"....Q",".Q...","...Q.","Q....","..Q.."}, result.get(8).toArray(strData));
    Assert.assertArrayEquals(new String[] {"....Q","..Q..","Q....","...Q.",".Q..."}, result.get(9).toArray(strData));
  }
  
  @Test
  public void testProblemCase5() {
    int n = 6;
    LeetCode051 solution = new LeetCode051();
    List<List<String>> result = solution.solveNQueens(n);
    Assert.assertEquals(4, result.size());
    String[] strData = new String[n];
    Assert.assertArrayEquals(new String[] {".Q....","...Q..",".....Q","Q.....","..Q...","....Q."}, result.get(0).toArray(strData));
    Assert.assertArrayEquals(new String[] {"..Q...",".....Q",".Q....","....Q.","Q.....","...Q.."}, result.get(1).toArray(strData));
    Assert.assertArrayEquals(new String[] {"...Q..","Q.....","....Q.",".Q....",".....Q","..Q..."}, result.get(2).toArray(strData));
    Assert.assertArrayEquals(new String[] {"....Q.","..Q...","Q.....",".....Q","...Q..",".Q...."}, result.get(3).toArray(strData));
  }
}
