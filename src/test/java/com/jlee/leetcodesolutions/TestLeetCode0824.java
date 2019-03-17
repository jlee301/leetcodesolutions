package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0824;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0824 {
  @Test
  public void testProblemCase1() {
    String S = "I speak Goat Latin";
    LeetCode0824 solution = new LeetCode0824();
    Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", solution.toGoatLatin(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "The quick brown fox jumped over the lazy dog";
    LeetCode0824 solution = new LeetCode0824();
    Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", solution.toGoatLatin(S));
  }

  @Test
  public void testEveryVowel() {
    String S = "A a E e I i O o U u";
    LeetCode0824 solution = new LeetCode0824();
    Assert.assertEquals("Amaa amaaa Emaaaa emaaaaa Imaaaaaa imaaaaaaa Omaaaaaaaa omaaaaaaaaa Umaaaaaaaaaa umaaaaaaaaaaa", solution.toGoatLatin(S));
  }
}
