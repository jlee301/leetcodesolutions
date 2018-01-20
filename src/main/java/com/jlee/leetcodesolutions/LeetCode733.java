package com.jlee.leetcodesolutions;

public class LeetCode733 {
  /*
   * An image is represented by a 2-D array of integers, each integer representing
   * the pixel value of the image (from 0 to 65535).
   * 
   * Given a coordinate (sr, sc) representing the starting pixel (row and column)
   * of the flood fill, and a pixel value newColor, "flood fill" the image.
   * 
   * To perform a "flood fill", consider the starting pixel, plus any pixels
   * connected 4-directionally to the starting pixel of the same color as the
   * starting pixel, plus any pixels connected 4-directionally to those pixels
   * (also with the same color as the starting pixel), and so on. Replace the
   * color of all of the aforementioned pixels with the newColor.
   * 
   * At the end, return the modified image.
   * 
   * Example 1:
   * Input: image = [[1,1,1],[1,1,0],[1,0,1]] sr = 1, sc = 1, newColor = 2
   * Output: [[2,2,2],[2,2,0],[2,0,1]]
   * 
   * Explanation: From the center of the image (with position (sr, sc) = (1, 1)),
   * all pixels connected by a path of the same color as the starting pixel are
   * colored with the new color. Note the bottom corner is not colored 2, because
   * it is not 4-directionally connected to the starting pixel.
   * 
   * Note:
   * 1. The length of image and image[0] will be in the range [1, 50].
   * 2. The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc <
   * image[0].length.
   * 3. The value of each color in image[i][j] and newColor will be an integer in
   * [0, 65535].
   * 
   * https://leetcode.com/problems/flood-fill/description/
   */
  private int[][] image;
  private boolean[][] check;
  private int newColor;
  private int oldColor;
  
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if(image == null || image.length == 0 || image[0].length == 0 || 
        sr < 0 || sr > image.length || sc < 0 || sc > image[0].length || newColor < 0 || newColor > 65535)
      return image;

    // Making image and newColor global so I do not create new copies per recursion
    this.image = image;
    this.newColor = newColor;
    this.oldColor = image[sr][sc];

    // Check is to make sure I do not recheck an area
    check = new boolean[image.length][image[0].length];

    checkArea(sr, sc);
    return this.image;
  }
  
  private void checkArea(int row, int col) {
    if(row < 0 || row > image.length-1 || col < 0 || col > image[0].length-1 || 
        check[row][col] || image[row][col] != oldColor)
      return;
    
    check[row][col] = true;
    image[row][col] = newColor;
    
    // Check 4-directionally (Up, Down, Left, Right)
    checkArea(row-1, col);
    checkArea(row+1, col);
    checkArea(row, col-1);
    checkArea(row, col+1);
  }
}
