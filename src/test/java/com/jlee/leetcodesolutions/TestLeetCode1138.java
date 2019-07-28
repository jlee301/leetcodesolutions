package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1138;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1138 {
  @Test
  public void testProblemCase1() {
    HashMap<String,String> data = new HashMap<>();
    data.put("leet", "DDR!UURRR!!DDD!");
    data.put("code", "RR!DDRR!UUL!R!");
    data.put("zero", "DDDDD!UUUUURRRR!DDDLL!URR!");
    data.put("zztop", "DDDDD!!UURRRR!U!DLLLL!");
    data.put("sz", "DDDRRR!LLLDD!");
    LeetCode1138 solution = new LeetCode1138();
    for(String target : data.keySet()) {
      String expected = data.get(target);
      Assert.assertEquals(expected, solution.alphabetBoardPath(target));
    }
  }
}
