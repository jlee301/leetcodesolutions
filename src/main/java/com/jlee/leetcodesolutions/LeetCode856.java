package com.jlee.leetcodesolutions;

public class LeetCode856 {
  /*
   * Given a balanced parentheses string S, compute the score of the string based
   * on the following rule:
   * 
   * 1. () has score 1
   * 2. AB has score A + B, where A and B are balanced parentheses strings.
   * 3. (A) has score 2 * A, where A is a balanced parentheses string.
   */
  public int scoreOfParentheses(String S) {
    int N = S.length();
    // 1. Base case, S = "()"
    if(N == 2) 
      return 1;
    
    int count = 0;
    for(int i = 0; i < N-1; i++) {
      if(S.charAt(i) == '(')
        count++;
      else
        count--;
      
      // 2. Add together the inner results
      if(count == 0)
        return scoreOfParentheses(S.substring(0, i+1)) + scoreOfParentheses(S.substring(i+1));
    }
    // 3. Entire S = (()(())) is surrounded by () 
    // S' = ()(()), the inner result is multiplied by 2
    return 2 * scoreOfParentheses(S.substring(1, N-1));
  }
}
