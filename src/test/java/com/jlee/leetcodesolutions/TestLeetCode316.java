package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode316;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode316 {
  @Test
  public void testProblemCase1() {
    String s = "bcabc";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("abc", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cbacdcbc";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("acdb", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "mitnlruhznjfyzmtmfnstsxwktxlboxutbic";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("ilrhjfyzmnstwkboxuc", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "eywdgenmcnzhztolafcfnirfpuxmfcenlppegrcalgxjlajxmphwidqqtrqnmmbssotoywfrtylm";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("chzafipuegjlxdqnbsotwrym", solution.removeDuplicateLetters(s));
  }
  
  @Test
  public void testProblemCase5() {
    String fileName = "src/test/java/com/jlee/leetcodesolutions/TestLeetCode316.txt";
    List<String> list = new ArrayList<>();
    try {
      Stream<String> stream = Files.lines(Paths.get(fileName));
      list = stream.collect(Collectors.toList());
      stream.close();
    }
    catch(IOException e) {
      Assert.fail(e.toString());
    }
    
    LeetCode316 solution = new LeetCode316();
    for(String line : list) {
      String[] sdata = line.split(",");
      // System.out.println(sdata[0] + " | " + sdata[1]);
      Assert.assertEquals(sdata[1], solution.removeDuplicateLetters(sdata[0]));
    }
  }
}
