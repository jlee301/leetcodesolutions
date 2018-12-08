package com.jlee.leetcodesolutions;

public class LeetCode427 {
  /*
   * https://leetcode.com/problems/construct-quad-tree/
   */
  public Node construct(int[][] grid) {
    return helper(grid, 0, 0, grid.length);      
  }
  
  private Node helper(int[][] grid, int r, int c, int len) {
    if(len == 1)
      return new Node(grid[r][c] == 1, true, null, null, null, null);
    
    Node node = new Node();
    Node topLeft = helper(grid, r, c, len / 2);
    Node topRight = helper(grid, r, c + len / 2, len / 2);
    Node bottomLeft = helper(grid, r + len / 2, c, len / 2);
    Node bottomRight = helper(grid, r + len / 2, c + len / 2, len / 2);
    
    if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val
        && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
      // If all leaf nodes are the same, consolidate into one QuadNode
      node.isLeaf = true;
      node.val = topLeft.val;
    }
    else {
      node.topLeft = topLeft;
      node.topRight = topRight;
      node.bottomLeft = bottomLeft;
      node.bottomRight = bottomRight;
    }
    return node;
  }
  
  public class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
  }
}
