package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode274 {
  /*
   * Given an array of citations (each citation is a non-negative integer) of a
   * researcher, write a function to compute the researcher's h-index.
   * 
   * According to the definition of h-index on Wikipedia:
   * "A scientist has index h if h of his/her N papers have at least h citations 
   * each, and the other N − h papers have no more than h citations each."
   * 
   * For example, given citations = [3, 0, 6, 1, 5], which means the researcher
   * has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations
   * respectively. Since the researcher has 3 papers with at least 3 citations
   * each and the remaining two with no more than 3 citations each, his h-index is
   * 3.
   * 
   * Note: If there are several possible values for h, the maximum one is taken as
   * the h-index.
   * 
   * https://leetcode.com/problems/h-index/description/
   */
  public int hIndex(int[] citations) {
    if(citations == null)
      return 0;
    
    Arrays.sort(citations);
    for(int i = citations.length-1, n = 1; i >= 0; i--, n++) {
      if(citations[i] == n)
        return n;
      // If the next iteration is less than the number of papers n, then return n-1
      if(citations[i] < n)
        return n-1;
    }
    // If none is found to meet the conditions, then the h-index is the total number
    // of papers
    return citations.length;
  }
}
