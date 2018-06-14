package com.jlee.leetcodesolutions;

public class LeetCode768 {
  /*
   * Given an array arr of integers (not necessarily distinct), we split the array
   * into some number of "chunks" (partitions), and individually sort each chunk.
   * After concatenating them, the result equals the sorted array.
   * 
   * What is the most number of chunks we could have made?
   * 
   * https://leetcode.com/problems/max-chunks-to-make-sorted-ii/description/
   */
  public int maxChunksToSorted(int[] arr) {
    int N = arr.length;
    // Determine max[i] = max element between arr[0] - arr[i]
    int[] max = new int[N];
    max[0] = arr[0];
    for(int i = 1; i < N; i++)
      max[i] = Math.max(max[i-1], arr[i]);
    
    // Determine min[i] = min element between arr[i] - arr[N-1]
    int[] min = new int[N];
    min[N-1] = arr[N-1];
    for(int i = N-2; i >= 0; i--)
      min[i] = Math.min(min[i+1], arr[i]);
    
    int chunks = 1;
    // When every element on the left is less than or equal to every element on the
    // right, we have a new chunk
    for(int i = 0; i < N-1; i++) {
      if(max[i] <= min[i+1])
        chunks++;
    }
    return chunks;
  }
}
