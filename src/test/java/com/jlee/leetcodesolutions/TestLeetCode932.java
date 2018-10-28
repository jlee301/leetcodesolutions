package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode932;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode932 {
  @Test
  public void testProblemCase1() {
    int N = 4;
    LeetCode932 solution = new LeetCode932();
    int[] result = solution.beautifulArray(N);
    validateBeautifulArray(result, N);
  }

  @Test
  public void testProblemCase2() {
    int N = 5;
    LeetCode932 solution = new LeetCode932();
    int[] result = solution.beautifulArray(N);
    validateBeautifulArray(result, N);
  }
  
  private void validateBeautifulArray(int[] result, int N) {
    // Checking to see 1 thru N are in the array
    List<Integer> list = new ArrayList<>();
    for(int n : result)
      list.add(n);
    
    for(Integer i = 1; i <= N; i++)
      Assert.assertTrue(list.contains(i));
    
    // i < k < j, no k exist where 2*A[k] != A[i] + A[j]
    for(int i = 0; i < result.length-2; i++) {
      for(int j = i + 2; j < result.length-1; j++) {
        int IJSum = result[i] + result[j];
        for(int k = i + 1; k < j; k++)
          Assert.assertTrue(2*result[k] != IJSum);
      }
    }
  }
}
