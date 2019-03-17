package com.jlee.leetcodesolutions;

public class LeetCode0799 {
  /*
   * We stack glasses in a pyramid, where the first row has 1 glass, the second
   * row has 2 glasses, and so on until the 100th row. Each glass holds one cup
   * (250ml) of champagne.
   * 
   * Then, some champagne is poured in the first glass at the top. When the top
   * most glass is full, any excess liquid poured will fall equally to the glass
   * immediately to the left and right of it. When those glasses become full, any
   * excess champagne will fall equally to the left and right of those glasses,
   * and so on. (A glass at the bottom row has it's excess champagne fall on the
   * floor.)
   * 
   * For example, after one cup of champagne is poured, the top most glass is
   * full. After two cups of champagne are poured, the two glasses on the second
   * row are half full. After three cups of champagne are poured, those two cups
   * become full - there are 3 full glasses total now. After four cups of
   * champagne are poured, the third row has the middle glass half full, and the
   * two outside glasses are a quarter full, as pictured below.
   * 
   * Now after pouring some non-negative integer cups of champagne, return how
   * full the j-th glass in the i-th row is (both i and j are 0 indexed.)
   * 
   * Note:
   * 1. poured will be in the range of [0, 10 ^ 9].
   * 2. query_glass and query_row will be in the range of [0, 99].
   * 
   * https://leetcode.com/problems/champagne-tower/description/
   */
  public double champagneTower(int poured, int query_row, int query_glass) {
    double[][] tower = new double[100][100];
    tower[0][0] = poured;
    // Only need to simulate up to the row before the query_row
    for(int i = 0; i < query_row; i++) {
      for(int j = 0; j <= i; j++) {
        // Each glass will cause overflow to the left and right glass in the next row
        double overflow = (tower[i][j] - 1.0) / 2.0;
        if(overflow > 0) {
          tower[i+1][j] += overflow;
          tower[i+1][j+1] += overflow;
        }
      }
    }
    // In case top glass is chosen and poured > 1
    return Math.min(1, tower[query_row][query_glass]);
  }
}
