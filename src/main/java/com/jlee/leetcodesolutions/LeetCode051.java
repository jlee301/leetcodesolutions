package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode051 {
  /*
   * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
   * such that no two queens attack each other.
   * 
   * Given an integer n, return all distinct solutions to the n-queens puzzle.
   * 
   * Each solution contains a distinct board configuration of the n-queens'
   * placement, where 'Q' and '.' both indicate a queen and an empty space
   * respectively.
   * 
   * https://leetcode.com/problems/n-queens/
   */
  private List<List<String>> result;
  private boolean[] col;
  private boolean[][] diag;
  
  public List<List<String>> solveNQueens(int n) {
    col = new boolean[n];
    diag = new boolean[n][n];
    result = new ArrayList<>();
    helper(0, n, new ArrayList<>());
    return result;
  }
  
  private void helper(int r, int n, List<String> curr) {
    if(r == n) {
      // found suitable n-queen configuration
      result.add(new ArrayList<>(curr));
      return;
    }
    
    // check each column in the row
    for(int i = 0; i < n; i++) {
      if(col[i] || diag[r][i])
        continue;
      
      // backtracking
      curr.add(genRow(i, n));
      col[i] = true;
      boolean[][] alreadySet = new boolean[n][n];
      setDiagonals(r, i, n, true, alreadySet);
      
      helper(r+1, n, curr);
      
      curr.remove(curr.size()-1);
      col[i] = false;
      setDiagonals(r, i, n, false, alreadySet);
    }
  }
  
  // c == position of the queen (0 indexed)
  private String genRow(int c, int n) {
    String ret = "";
    for(int i = 0; i < n; i++)
      ret += i == c ? 'Q' : '.';
    return ret;
  }
  
  private void setDiagonals(int r, int c, int n, boolean set, boolean[][] alreadySet) {
    // alreadySet is to keep track what has been occupied by another queen to avoid
    // unsetting it
    
    diag[r][c] = set ? true : false;
    
    // left of position
    for(int C = c-1, R = r+1; C >= 0 && R < n; C--, R++) {
      if(set && diag[R][C]) 
        alreadySet[R][C] = true;
      
      if(set)
        diag[R][C] = true;
      else {
        if(!alreadySet[R][C])
          diag[R][C] = false;
      }
    }
    
    // right of position
    for(int C = c+1, R = r+1; C < n && R < n; C++, R++) {
      if(set && diag[R][C]) 
        alreadySet[R][C] = true;
      
      if(set)
        diag[R][C] = true;
      else {
        if(!alreadySet[R][C])
          diag[R][C] = false;
      }
    }
  }
}
