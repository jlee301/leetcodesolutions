package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1044;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1044 {
  @Test
  public void testProblemCase1() {
    String S = "banana";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("ana", solution.longestDupSubstring(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "abcd";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("", solution.longestDupSubstring(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "ababdaebdabedeabbdddbcebaccececbccccebbcaaabaadcadccddaedaacaeddddeceedeaabbbbcbacdaeeebaabdabdbaebadcbdebaaeddcadebedeabbbcbeadbaacdebceebceeccddbeacdcecbcdbceedaeebdaeeabccccbcccbceabedaedaacdbbdbadcdbdddddcdebbcdbcabbebbeabbdccccbaaccbbcecacaebebecdcdcecdeaccccccdbbdebaaaaaaeaaeecdecedcbabedbabdedbaebeedcecebabedbceecacbdecabcebdcbecedccaeaaadbababdccedebeccecaddeabaebbeeccabeddedbeaadbcdceddceccecddbdbeeddabeddadaaaadbeedbeeeaaaeaadaebdacbdcaaabbacacccddbeaacebeeaabaadcabdbaadeaccaecbeaaabccddabbeacdecadebaecccbabeaceccaaeddedcaecddaacebcaecebebebadaceadcaccdeebbcdebcedaeaedacbeecceeebbdbdbaadeeecabdebbaaebdddeeddabcbaaebeabbbcaaeecddecbbbebecdbbbaecceeaabeeedcdecdcaeacabdcbcedcbbcaeeebaabdbaadcebbccbedbabeaddaecdbdbdccceeccaccbdcdadcccceebdabccaebcddaeeecddddacdbdbeebdabecdaeaadbadbebecbcacbbceeabbceecaabdcabebbcdecedbacbcccddcecccecbacddbeddbbbadcbdadbecceebddeacbeeabcdbbaabeabdbbbcaeeadddaeccbcdabceeabaacbeacdcbdceebeaebcceeebdcdcbeaaeeeadabbecdbadbebbecdceaeeecaaaedeceaddedbedbedbddbcbabeadddeccdaadaaeaeeadebbeabcabbdebabeedeeeccadcddaebbedadcdaebabbecedebadbdeacecdcaebcbdababcecaecbcbcdadacaebdedecaadbaaeeebcbeeedaaebbabbeeadadbacdedcbabdaabddccedbeacbecbcccdeaeeabcaeccdaaaddcdecadddabcaedccbdbbccecacbcdecbdcdcbabbeaacddaeeaabccebaaaebacebdcdcbbbdabadeebbdccabcacaacccccbadbdebecdaccabbecdabdbdaebeeadaeecbadedaebcaedeedcaacabaccbbdaccedaedddacbbbdbcaeedbcbecccdbdeddcdadacccdbcdccebdebeaeacecaaadccbbaaddbeebcbadceaebeccecabdadccddbbcbaebeaeadacaebcbbbdbcdaeadbcbdcedebabbaababaacedcbcbceaaabadbdcddadecdcebeeabaadceecaeccdeeabdbabebdcedceaeddaecedcdbccbbedbeecabaecdbba";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("aeeebaabd", solution.longestDupSubstring(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "okmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajvielokmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajviel";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("okmzpmxzwjbfssktjtebhhxfphcxefhonkncnrumgduoaeltjvwqwydpdsrbxsgmcdxrthilniqxkqzuuqzqhlccmqcmccfqddncchadnthtxjruvwsmazlzhijygmtabbzelslebyrfpyyvcwnaiqkkzlyillxmkfggyfwgzhhvyzfvnltjfxskdarvugagmnrzomkhldgqtqnghsddgrjmuhpgkfcjkkkaywkzsikptkrvbnvuyamegwempuwfpaypmuhhpuqrufsgpiojhblbihbrpwxdxzolgqmzoyeblpvvrnbnsdnonhpmbrqissifpdavvscezqzclvukfgmrmbmmwvzfpxcgecyxneipexrzqgfwzdqeeqrugeiupukpveufmnceetilfsqjprcygitjefwgcvqlsxrasvxkifeasofcdvhvrpmxvjevupqtgqfgkqjmhtkyfsjkrdczmnettzdxcqexenpxbsharuapjmdvmfygeytyqfcqigrovhzbxqxidjzxfbrlpjxibtbndgubwgihdzwoywqxegvxvdgaoarlauurxpwmxqjkidwmfuuhcqtljsvruinflvkyiiuwiiveplnxlviszwkjrvyxijqrulchzkerbdyrdhecyhscuojbecgokythwwdulgnfwvdptzdvgamoublzxdxsogqpunbtoixfnkgbdrgknvcydmphuaxqpsofmylyijpzhbqsxryqusjnqfikvoikwthrmdwrwqzrdmlugfglmlngjhpspvnfddqsvrajviel", solution.longestDupSubstring(S));
  }

  @Test
  public void testProblemCase5() {
    String S = "abcdabcd";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("abcd", solution.longestDupSubstring(S));
  }

  @Test
  public void testProblemCase6() {
    String S = "bbbb";
    LeetCode1044 solution = new LeetCode1044();
    Assert.assertEquals("bbb", solution.longestDupSubstring(S));
  }
}