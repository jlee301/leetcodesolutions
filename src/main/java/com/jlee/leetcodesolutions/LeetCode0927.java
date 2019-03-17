package com.jlee.leetcodesolutions;

public class LeetCode0927 {
  /*
   * https://leetcode.com/problems/three-equal-parts/
   */
  public int[] threeEqualParts(int[] A) {
    if(A == null || A.length < 3)
      return new int[] {-1,-1};
    
    // Count the number of 1's in the array
    int countOfOnes = 0;
    for(int n : A)
      countOfOnes += n;
    
    // Edge case, the array is all 0's
    if(countOfOnes == 0)
      return new int[] {0, A.length-1};
      
    // Count of 1's should be divisible by 3
    if(countOfOnes % 3 != 0)
      return new int[] {-1,-1};
    

    // Find the index of the first 1 for each three parts
    int k = countOfOnes / 3;
    
    int first = 0;
    while(A[first] == 0)
      first++;
    
    int count = 0;
    int second = first;
    while(count < k + 1)
      count += A[second++];
    second--;
    
    int third = second + 1;
    while(count < 2*k + 1)
      count += A[third++]; 
    third--;
    
    // Check if the three parts match
    while(third < A.length && A[third] == A[first] && A[third] == A[second]) {
      first++;
      second++;
      third++;
    }
    // { end of the first part, start of the third }
    return third == A.length ? new int[] {first-1, second} : new int[] {-1,-1};
  }
}
