package com.jlee.leetcodesolutions;

public class LeetCode165 {
  /*
   * Compare two version numbers version1 and version2. If version1 > version2
   * return 1, if version1 < version2 return -1, otherwise return 0.
   * 
   * You may assume that the version strings are non-empty and contain only digits
   * and the . character. The . character does not represent a decimal point and
   * is used to separate number sequences. For instance, 2.5 is not
   * "two and a half" or "half way to version three", it is the fifth second-level
   * revision of the second first-level revision.
   * 
   * Here is an example of version numbers ordering:
   * 0.1 < 1.1 < 1.2 < 13.37
   * 
   * https://leetcode.com/problems/compare-version-numbers/description/
   */
  public int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");
    for(int i = 0; i < v1.length || i < v2.length; i++) {
      // If one version has more segments than the other, we just plug in zero to be
      // used for comparison.
      int ver1 = i < v1.length ? Integer.valueOf(v1[i]) : 0;
      int ver2 = i < v2.length ? Integer.valueOf(v2[i]) : 0;
      // ver2 segment greater than ver1
      if(ver1 < ver2)
        return -1;
      // ver1 segment greater than ver2
      if(ver1 > ver2)
        return 1;
    }
    return 0;
  }  
}
