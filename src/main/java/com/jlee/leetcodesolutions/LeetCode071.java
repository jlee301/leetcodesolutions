package com.jlee.leetcodesolutions;

public class LeetCode071 {
  /*
   * Given an absolute path for a file (Unix-style), simplify it.
   * 
   * For example,
   * path = "/home/", => "/home"
   * path = "/a/./b/../../c/", => "/c"
   * 
   * Corner Cases:
   * 1. Did you consider the case where path = "/../"? In this case, you should
   * return "/".
   * 2. Another corner case is the path might contain multiple slashes '/'
   * together, such as "/home//foo/".
   * 3. In this case, you should ignore redundant slashes and return "/home/foo".
   * 
   * https://leetcode.com/problems/simplify-path/description/
   */
  public String simplifyPath(String path) {
    String result = "";
    if(path == null || path.length() == 0)
      return result;
    
    String[] sPath = path.split("/");
    int backwards = 0;
    for(int i = sPath.length-1; i >= 0; i--) {
      if(sPath[i].equals(".") || sPath[i].equals("")) 
        continue;
      
      if(sPath[i].equals(".."))
        backwards++;
      else if(backwards > 0) {
        backwards--;
        continue;
      }
      else
       result = "/" + sPath[i] + result; 
    }
    return result.length() == 0 ? "/" : result;
  }
}
