package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode975 {
  /*
   * https://leetcode.com/problems/odd-even-jump/
   */
  private int count;
  private int N;
  private NextJump[] idxMap;
  
  private class NextJump {
    public Integer oddNextIdx;
    public Integer evenNextIdx;
    NextJump(Integer odd, Integer even) {
      oddNextIdx = odd;
      evenNextIdx = even;
    }
  }
  
  public int oddEvenJumps(int[] A) {
    count = 0;
    N = A.length;
    
    // idxMap[i] stores information on where you can jump next from A[i]
    idxMap = new NextJump[N];
    
    
    // Store all elements of the array in the set.  This will be used to see what is the next value
    TreeSet<Integer> set = new TreeSet<>();
    // Associate each integer to its index position(s)
    HashMap<Integer,TreeSet<Integer>> valToIdxMap = new HashMap<>();
    
    // Work backwards to find next element
    for(int i = N-1; i >= 0; i--) {
      // Assuming the current turn is odd, get the smallest element greater or equal to A[i]
      Integer oddNext = set.ceiling(A[i]);
      // Assuming the current turn is even, get the largest element less than or equal to A[i]
      Integer evenNext = set.floor(A[i]);
      Integer oddNextIdx = oddNext == null ? null : valToIdxMap.get(oddNext).ceiling(i+1);
      Integer evenNextIdx = evenNext == null ? null : valToIdxMap.get(evenNext).ceiling(i+1);
      idxMap[i] = new NextJump(oddNextIdx, evenNextIdx);
      
      set.add(A[i]);
      valToIdxMap.computeIfAbsent(A[i], k -> new TreeSet<>()).add(i);
    }
    
    Boolean[][] memo = new Boolean[2][N];
    for(int i = 0; i < N; i++)
      dfsOdd(i, memo);
    
    return count;
  }
  
  private boolean dfsOdd(int pos, Boolean[][] memo) {
    // During odd numbered jumps (ie. jumps 1, 3, 5, ...), you jump to the index j
    // such that A[i] <= A[j] and A[j] is the smallest possible value. If there are
    // multiple such indexes j, you can only jump to the smallest such index j.
    if(pos == N-1) {
      count++;
      return true;
    }
    
    // check memoization
    if(memo[0][pos] != null) {
      if(memo[0][pos]) {
        count++;
        return true;
      }
      return false;
    }
    
    if(idxMap[pos].oddNextIdx == null) {
      memo[0][pos] = false;
      return false;
    }
    
    memo[0][pos] = dfsEven(idxMap[pos].oddNextIdx, memo);
    return memo[0][pos];
  }

  private boolean dfsEven(int pos, Boolean[][] memo) {
    // During even numbered jumps (ie. jumps 2, 4, 6, ...), you jump to the index j
    // such that A[i] >= A[j] and A[j] is the largest possible value. If there are
    // multiple such indexes j, you can only jump to the smallest such index j.
    if(pos == N-1) {
      count++;
      return true;
    }
    
    // check memoization
    if(memo[1][pos] != null) {
      if(memo[1][pos]) {
        count++;
        return true;
      }
      return false;
    }
    
    if(idxMap[pos].evenNextIdx == null) {
      memo[1][pos] = false;
      return false;
    }
    
    memo[1][pos] = dfsOdd(idxMap[pos].evenNextIdx, memo);
    return memo[1][pos];
  }
}
