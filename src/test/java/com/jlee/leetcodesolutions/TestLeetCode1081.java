package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1081;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1081 {
  @Test
  public void testProblemCase1() {
    String text = "cdadabcc";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("adbc", solution.smallestSubsequence(text));
  }

  @Test
  public void testProblemCase2() {
    String text = "abcd";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("abcd", solution.smallestSubsequence(text));
  }

  @Test
  public void testProblemCase3() {
    String text = "ecbacba";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("eacb", solution.smallestSubsequence(text));
  }

  @Test
  public void testProblemCase4() {
    String text = "leetcode";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("letcod", solution.smallestSubsequence(text));
  }

  @Test
  public void testProblemCase5() {
    String text = "aaeeeceabbfdaefdeefbabaabbdbaadbebfaabfadcaacddebfdbeaceffaaadcaeddbadebdebccbcbccefeaffbfdcdaefeefeffefcfbbbdabdbddcaaeaacecefbbbeaacdafdfbcdfcbedaff";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("abcdef", solution.smallestSubsequence(text));
  }

  @Test
  public void testProblemCase6() {
    String text = "cfffecddgcbddecegfcabfdagbddagafddbddefbeagbfgbgfddabbddddgcddcggagcceedfgcfbggdfaegabgbgafgabeebbfceadadcdfbggecfdegedfbbddadfacdgafcgfddgcdbeebaabdbefgaaccgadefdadeabddbaefffcedbgeecgaecgaceabcacdaeebbebefcfffadddcbgggfgdcfbgfefbafggfcggfededbacdbd";
    LeetCode1081 solution = new LeetCode1081();
    Assert.assertEquals("abcdefg", solution.smallestSubsequence(text));
  }
}
