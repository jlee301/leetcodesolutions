package com.jlee.leetcodesolutions;

public class LeetCode0396 {
  /*
   * Given an array of integers A and let n to be its length.
   * 
   * Assume Bk to be an array obtained by rotating the array A k positions
   * clock-wise, we define a "rotation function" F on A as follow:
   * 
   * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
   * 
   * Calculate the maximum value of F(0), F(1), ..., F(n-1).
   * 
   * Note:
   * n is guaranteed to be less than 10^5.
   * 
   * Example:
   * A = [4, 3, 2, 6]
   * F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
   * F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
   * F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
   * F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
   * 
   * So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
   */
  public int maxRotateFunction(int[] A) {
    if(A == null || A.length == 0)
      return 0;
    
    // F(k) = 0*Bk[0] + 1*Bk[1] + ... + (n-1)*Bk[n-1]
    // F(k-1) = 0*Bk-1[0] + 1*Bk-1[0] + ... + (n-1)*Bk-1[n-1]
    //        = 0*Bk[1]   + 1*Bk[2]   + ... + (n-1)*Bk[0]
    //
    // F(k) - F(k-1) = Bk[1] + 2*Bk[2] + ... - Bk[2] - 2*Bk[3] - ... - (n-1)*Bk[0]
    // F(k) - F(k-1) = sum(Bk) - n*Bk[0]
    // F(k) = F(k-1) + sum(Bk) - n*Bk[0]
    int sum = 0, f = 0, n = A.length;
    for(int i = 0; i < n; i++) {
      // Calculating sum and F(0)
      sum += A[i];
      f += i*A[i];
    }
    int result = f;
    for(int i = n-1; i > 0; i--) {
      // Calculating up to F(k). Every iteration F(1), F(2), ... F(k)
      f = f + sum - (n*A[i]);
      result = Math.max(result, f);
    }
    return result;
  }
}
