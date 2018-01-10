package com.jlee.leetcodesolutions;

public class LeetCode566 {
  /*
   * In MATLAB, there is a very useful function called 'reshape', which can
   * reshape a matrix into a new one with different size but keep its original
   * data.
   * 
   * You're given a matrix represented by a two-dimensional array, and two
   * positive integers r and c representing the row number and column number of
   * the wanted reshaped matrix, respectively.
   * 
   * The reshaped matrix need to be filled with all the elements of the original
   * matrix in the same row-traversing order as they were.
   * 
   * If the 'reshape' operation with given parameters is possible and legal,
   * output the new reshaped matrix; Otherwise, output the original matrix.
   * 
   * Example 1: 
   * Input: nums = [[1,2], [3,4]] r = 1, c = 4 
   * Output: [[1,2,3,4]]
   * 
   * Explanation: The row-traversing of nums is [1,2,3,4]. The new reshaped matrix
   * is a 1 * 4 matrix, fill it row by row by using the previous list.
   * 
   * Example 2: 
   * Input: nums = [[1,2], [3,4]] r = 2, c = 4 
   * Output: [[1,2], [3,4]]
   * 
   * Explanation: There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So
   * output the original matrix.
   * 
   * Note:
   * 1. The height and width of the given matrix is in range [1, 100].
   * 2. The given r and c are all positive.
   * 
   * https://leetcode.com/problems/reshape-the-matrix/description/
   */
  public int[][] matrixReshape(int[][] nums, int r, int c){
    if(nums == null)
      return null;
    
    if((nums.length == r && nums[0].length == c) || (nums.length*nums[0].length != r*c) || r < 1 || c < 1)
      return nums;
    
    int k = 0, l = 0;
    int[][] result = new int[r][c];
    for(int i = 0; i < result.length; i++) {
      for(int j = 0; j < result[i].length; j++) {
        result[i][j] = nums[k][l];
        if(l == nums[k].length - 1) {
          k++;
          l = 0;
        } else {
          l++;
        }
      }
    }
    return result;
  }
}
