package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode187;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode187 {
  @Test
  public void testProblemCase() {
    String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    LeetCode187 solution = new LeetCode187();
    List<String> result = solution.findRepeatedDnaSequences(s);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("AAAAACCCCC", result.get(0));
    Assert.assertEquals("CCCCCAAAAA", result.get(1));
  }

  @Test
  public void testStringAlreadyExistedInResultOutput() {
    String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTTAAAAACCCCC";
    LeetCode187 solution = new LeetCode187();
    List<String> result = solution.findRepeatedDnaSequences(s);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("AAAAACCCCC", result.get(0));
    Assert.assertEquals("CCCCCAAAAA", result.get(1));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode187 solution = new LeetCode187();
    List<String> result = solution.findRepeatedDnaSequences(s);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode187 solution = new LeetCode187();
    List<String> result = solution.findRepeatedDnaSequences(s);
    Assert.assertEquals(0, result.size());
  }
}
