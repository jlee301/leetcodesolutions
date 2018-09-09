package com.jlee.leetcodesolutions;

public class LeetCode900 {
  /*
   * Write an iterator that iterates through a run-length encoded sequence.
   * 
   * The iterator is initialized by RLEIterator(int[] A), where A is a run-length
   * encoding of some sequence. More specifically, for all even i, A[i] tells us
   * the number of times that the non-negative integer value A[i+1] is repeated in
   * the sequence.
   * 
   * The iterator supports one function: next(int n), which exhausts the next n
   * elements (n >= 1) and returns the last element exhausted in this way. If
   * there is no element left to exhaust, next returns -1 instead.
   * 
   * For example, we start with A = [3,8,0,9,2,5], which is a run-length encoding
   * of the sequence [8,8,8,5,5]. This is because the sequence can be read as
   * "three eights, zero nines, two fives".
   * 
   * https://leetcode.com/contest/weekly-contest-101/problems/rle-iterator/
   */
  private int[] A;
  private int left = 0;
  private int pos = 0;
  
  public LeetCode900(int[] A) {
    this.A = A;
    left = 0;
    pos = 0;
  }
  
  public int next(int n) {
    // A = [3,8,0,9,2,5]
    // [8,8,8,5,5]
    left -= n;
    // Find index pos where I gain enough moves to output the sequence
    while(pos != A.length && left < 0) {
      left += A[pos];
      pos += 2;
    }
    return left < 0 ? -1 : A[pos-1];
  }
}
