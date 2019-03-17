package com.jlee.leetcodesolutions;

public class LeetCode0839 {
  /*
   * Two strings X and Y are similar if we can swap two letters (in different
   * positions) of X, so that it equals Y.
   * 
   * For example, "tars" and "rats" are similar (swapping at positions 0 and 2),
   * and "rats" and "arts" are similar, but "star" is not similar to "tars",
   * "rats", or "arts".
   * 
   * Together, these form two connected groups by similarity: {"tars", "rats",
   * "arts"} and {"star"}. Notice that "tars" and "arts" are in the same group
   * even though they are not similar. Formally, each group is such that a word is
   * in the group if and only if it is similar to at least one other word in the
   * group.
   * 
   * We are given a list A of unique strings. Every string in A is an anagram of
   * every other string in A. How many groups are there?
   * 
   * https://leetcode.com/problems/similar-string-groups/description/
   */
  public int numSimilarGroups(String[] A) {
    if(A == null) return 0;
    boolean[] used = new boolean[A.length];

    // Check each word to see if there is any similar
    int groups = 0;
    for(int i = 0; i < A.length; i++) {
      if(used[i]) continue;
      String str = A[i];
      used[i] = true;
      dfs(A, str, used);
      groups++;
    }
    return groups;
  }
  
  private void dfs(String[] A, String str, boolean[] used) {
    for(int i = 0; i < A.length; i++) {
      if(used[i]) continue;
      // Continue the dfs when a word is similar
      if(isSimilar(str, A[i])) {
        used[i] = true;
        dfs(A, A[i], used);
      }
    }
  }
  
  private boolean isSimilar(String A, String B) {
    int swap = 0, i = 0;
    // Detecting two differences for swap
    while(i < A.length() && swap <= 2) {
      if(A.charAt(i) != B.charAt(i)) swap++;
      i++;
    }
    return swap == 2;
  }
}
