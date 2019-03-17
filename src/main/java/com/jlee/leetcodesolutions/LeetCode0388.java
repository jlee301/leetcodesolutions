package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0388 {
  /*
   * Suppose we abstract our file system by a string in the following manner:
   * 
   * The string
   * "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
   * represents:
   * 
   * dir 
   *  subdir1 
   *    file1.ext 
   *    subsubdir1 
   *  subdir2 
   *    subsubdir2 
   *      file2.ext 
   *      
   * We are interested in finding the longest (number of characters) absolute path
   * to a file within our file system. For example, in the second example above,
   * the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its
   * length is 32 (not including the double quotes).
   * 
   * https://leetcode.com/problems/longest-absolute-file-path/description/
   */
  public int lengthLongestPath(String input) {
    if(input == null || input.length() == 0)
      return 0;

    String[] data = input.split("\n");
    int result = 0, absPathLen = 0;
    // The stack is being used to keep track of the length of each directory or file
    Stack<Integer> stack = new Stack<>();
    
    for(String s : data) {
      int dirCount = dirCount(s);
      while(stack.size() > dirCount)
        absPathLen -= stack.pop();
      
      // We compensate with +1 in case this is a directory for '/' to be included in
      // the absolute path length
      int currLen = s.replaceAll("\t", "").length() + 1;
      absPathLen += currLen;
      
      // We found a file. Determine if it has the max absolute file path length. We -1
      // here to compensate for adding it above thinking it is a directory.
      if(s.indexOf(".") > 0)
        result = Math.max(result, absPathLen-1);
      
      stack.add(currLen);
    }
    return result;
  }
  
  private int dirCount(String s) {
    String temp = s.replaceAll("\t", "");
    return s.length() - temp.length();
  }
}
