package com.jlee.leetcodesolutions;

public class LeetCode668 {
  /*
   * Nearly every one have used the Multiplication Table. But could you find out
   * the k-th smallest number quickly from the multiplication table?
   * 
   * Given the height m and the length n of a m * n Multiplication Table, and a
   * positive integer k, you need to return the k-th smallest number in this
   * table.
   * 
   * Note:
   * 1. The m and n will be in the range [1, 30000].
   * 2. The k will be in the range [1, m * n]
   * 
   * https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/
   */
  public int findKthNumber(int m, int n, int k) {
    // In the multiplication table, the possible answers range from [1 : m*n]
    // We binary search each possible guess to tell us how many numbers are greater than the guess
    int low = 1, high = m*n;
    while(low < high) {
      int mid = low + ((high-low) / 2);
      if(!check(mid, m, n, k))
        low = mid+1;
      else
        high = mid;
        // It is not high = mid-1 because mid is still a possible answer as the function
        // only return true if we still have >= k numbers
    }
    return high;
  }
  
  private boolean check(int num, int m, int n, int k) {
    int count = 0;
    // Determine how many numbers in each row are greater than num
    // Worst case is total n added per row
    for(int i = 1; i <= m; i++)
      count += Math.min(num / i, n);
    
    return count >= k;
  }
}
