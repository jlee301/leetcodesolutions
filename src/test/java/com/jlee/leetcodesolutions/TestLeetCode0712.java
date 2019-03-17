package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0712;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0712 {
  @Test
  public void testProblemCase1() {
    String s1 = "sea", s2 = "eat";
    LeetCode0712 solution = new LeetCode0712();
    Assert.assertEquals(231, solution.minimumDeleteSum(s1, s2));
  }

  @Test
  public void testProblemCase2() {
    String s1 = "delete", s2 = "leet";
    LeetCode0712 solution = new LeetCode0712();
    Assert.assertEquals(403, solution.minimumDeleteSum(s1, s2));
  }

  @Test
  public void testSame() {
    String s1 = "ea", s2 = "ea";
    LeetCode0712 solution = new LeetCode0712();
    Assert.assertEquals(0, solution.minimumDeleteSum(s1, s2));
  }

  @Test
  public void testTLE() {
    String s1 = "igijekdtywibepwonjbwykkqmrgmtybwhwjiqudxmnniskqjfbkpcxukrablqmwjndlhblxflgehddrvwfacarwkcpmcfqnajqfxyqwiugztocqzuikamtvmbjrypfqvzqiwooewpzcpwhdejmuahqtukistxgfafrymoaodtluaexucnndlnpeszdfsvfofdylcicrrevjggasrgdhwdgjwcchyanodmzmuqeupnpnsmdkcfszznklqjhjqaboikughrnxxggbfyjriuvdsusvmhiaszicfa"; 
    String s2 = "ikhuivqorirphlzqgcruwirpewbjgrjtugwpnkbrdfufjsmgzzjespzdcdjcoioaqybciofdzbdieegetnogoibbwfielwungehetanktjqjrddkrnsxvdmehaeyrpzxrxkhlepdgpwhgpnaatkzbxbnopecfkxoekcdntjyrmmvppcxcgquhomcsltiqzqzmkloomvfayxhawlyqxnsbyskjtzxiyrsaobbnjpgzmetpqvscyycutdkpjpzfokvi";
    LeetCode0712 solution = new LeetCode0712();
    Assert.assertEquals(41731, solution.minimumDeleteSum(s1, s2));
  }  
}
