package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode432;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode432 {
  @Test
  public void testProblemCase1() {
    LeetCode432 solution = new LeetCode432();
    Assert.assertEquals("", solution.getMaxKey());
    Assert.assertEquals("", solution.getMinKey());

    
    solution.dec("test1");
    Assert.assertEquals("", solution.getMaxKey());
    Assert.assertEquals("", solution.getMinKey());

    
    solution.inc("test1");
    Assert.assertEquals("test1", solution.getMaxKey());
    Assert.assertEquals("test1", solution.getMinKey());

    
    solution.inc("test2");
    solution.inc("test2");
    Assert.assertEquals("test2", solution.getMaxKey());
    Assert.assertEquals("test1", solution.getMinKey());

    
    solution.dec("test2");
    int[] result = new int[2];
    for(int i = 0; i < 100; i++) {
      String key = solution.getMaxKey();
      if(key == "test1")
        result[0]++;
      else if(key == "test2")
        result[1]++;
    }
    if(result[0] == 0)
      Assert.fail("test1 was not chosen for max key");

    if(result[1] == 0)
      Assert.fail("test2 was not chosen for max key");
    
    Assert.assertEquals(100, result[0]+result[1]);


    result = new int[2];
    for(int i = 0; i < 100; i++) {
      String key = solution.getMinKey();
      if(key == "test1")
        result[0]++;
      else if(key == "test2")
        result[1]++;
    }
    if(result[0] == 0)
      Assert.fail("test1 was not chosen for min key");

    if(result[1] == 0)
      Assert.fail("test2 was not chosen for min key");
    
    Assert.assertEquals(100, result[0]+result[1]);

    
    solution.dec("test2");
    result = new int[2];
    for(int i = 0; i < 100; i++) {
      String key = solution.getMaxKey();
      if(key == "test1")
        result[0]++;
      else if(key == "test2")
        result[1]++;
    }
    if(result[0] != 100)
      Assert.fail("test1 should only be chosen for max key");

    
    result = new int[2];
    for(int i = 0; i < 100; i++) {
      String key = solution.getMinKey();
      if(key == "test1")
        result[0]++;
      else if(key == "test2")
        result[1]++;
    }
    if(result[0] != 100)
      Assert.fail("test1 should only be chosen for min key");
    

    solution.inc("test1");
    solution.dec("test1");
    solution.dec("test1");
    Assert.assertEquals("", solution.getMaxKey());
    Assert.assertEquals("", solution.getMinKey());
  }
}
