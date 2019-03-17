package com.jlee.leetcodesolutions;

public class LeetCode0547 {
  /*
   * There are N students in a class. Some of them are friends, while some are
   * not. Their friendship is transitive in nature. For example, if A is a direct
   * friend of B, and B is a direct friend of C, then A is an indirect friend of
   * C. And we defined a friend circle is a group of students who are direct or
   * indirect friends.
   * 
   * Given a N*N matrix M representing the friend relationship between students in
   * the class. If M[i][j] = 1, then the ith and jth students are direct friends
   * with each other, otherwise not. And you have to output the total number of
   * friend circles among all the students.
   * 
   * Note:
   * 1. N is in range [1,200].
   * 2. M[i][i] = 1 for all students.
   * 3. If M[i][j] = 1, then M[j][i] = 1.
   * 
   * https://leetcode.com/problems/friend-circles/description/
   */
  public int findCircleNum(int[][] M) {
    int result = 0;
    if(M == null || M.length == 0 || M[0].length == 0)
      return result;
    
    // Per student, find all direct and indirect friends
    // The boolean[] studentInCircle is used keep track if the student is already in
    // a circle so we can avoid revisiting
    boolean[] studentInCircle = new boolean[M.length];
    for(int i = 0; i < M.length; i++) {
      if(!studentInCircle[i]) {
        findCircleNum(M, studentInCircle, i);
        result++;
      }
    }
    return result;
  }
  
  private void findCircleNum(int[][] M, boolean[] studentInCircle, int i) {
    // Per student i, mark all direct and indirect friends
    for(int j = 0; j < M[i].length; j++) {
      if(M[i][j] == 1 && !studentInCircle[j]) {
        studentInCircle[j] = true;
        findCircleNum(M, studentInCircle, j);
      }
    }
  }
}
