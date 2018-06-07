package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode786 {
  /*
   * A sorted list A contains 1, plus some number of primes. Then, for every p < q
   * in the list, we consider the fraction p/q.
   * 
   * What is the K-th smallest fraction considered? Return your answer as an array
   * of ints, where answer[0] = p and answer[1] = q.
   * 
   * https://leetcode.com/problems/k-th-smallest-prime-fraction/description/
   */
  public int[] kthSmallestPrimeFraction(int[] A, int K) {
    // int[0] = numerator, int[1] = denominator
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      // Top entry of the queue will always be the result of the smallest fraction.
      @Override
      public int compare(int[] o1, int[] o2) {
        double frac1 = (double) A[o1[0]] / (double) A[o1[1]];
        double frac2 = (double) A[o2[0]] / (double) A[o2[1]];
        return frac1 < frac2 ? -1 : frac1 > frac2 ? 1 : 0;
      }
    });
    
    // Add all fractions of A[A.length-1]
    // ie {A[0], A[N-1]}, {A[1], A[N-1]}, {A[2], A[N-1]}, {A[N-2], A[N-1]}
    int N = A.length;
    for(int i = 0; i < N-1; i++)
      pq.add(new int[] {i, N-1});
    
    // K times, pop the lowest fraction, and add the next possible
    for(int i = 0; i < K-1; i++) {
      int[] pop = pq.remove();
      pop[1]--;
      pq.add(pop);
    }

    int[] peek = pq.peek();
    return new int[]{A[peek[0]], A[peek[1]]};
  }  
}
