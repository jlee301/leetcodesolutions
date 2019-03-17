package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0721;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0721 {
  @Test
  public void testProblemCase() {
    List<List<String>> accounts = new ArrayList<>();
    accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
    accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));
    accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
    accounts.add(Arrays.asList("Mary", "mary@mail.com"));
    LeetCode0721 solution = new LeetCode0721();
    List<List<String>> result = solution.accountsMerge(accounts);
    Assert.assertEquals(3, result.size());
    String[] data = new String[result.get(0).size()];
    data = result.get(0).toArray(data);
    Assert.assertArrayEquals(new String[] {"John", "johnnybravo@mail.com"}, data);
    data = new String[result.get(1).size()];
    data = result.get(1).toArray(data);
    Assert.assertArrayEquals(new String[] {"John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"}, data);
    data = new String[result.get(2).size()];
    data = result.get(2).toArray(data);
    Assert.assertArrayEquals(new String[] {"Mary", "mary@mail.com"}, data);    
  }
}
