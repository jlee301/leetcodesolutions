package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0744 {
  /*
   * Given a list of sorted characters letters containing only lowercase letters,
   * and given a target letter target, find the smallest element in the list that
   * is larger than the given target.
   * 
   * Letters also wrap around. For example, if the target is target = 'z' and
   * letters = ['a', 'b'], the answer is 'a'.
   * 
   * Examples: 
   * Input: letters = ["c", "f", "j"] target = "a" Output: "c"
   * Input: letters = ["c", "f", "j"] target = "c" Output: "f"
   * Input: letters = ["c", "f", "j"] target = "d" Output: "f"
   * Input: letters = ["c", "f", "j"] target = "g" Output: "j"
   * Input: letters = ["c", "f", "j"] target = "j" Output: "c"
   * Input: letters = ["c", "f", "j"] target = "k" Output: "c"
   * 
   * Note:
   * 1. letters has a length in range [2, 10000].
   * 2. letters consists of lowercase letters, and contains at least 2 unique
   * letters.
   * 3. target is a lowercase letter.
   * 
   * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
   */
  public char nextGreatestLetter(char[] letters, char target) {
    if(letters == null || letters.length == 0)
      return 'a';
    
    HashSet<Integer> set = new HashSet<Integer>();
    for(char letter : letters) {
      set.add(letter - 'a');
    }
    
    for(int i = target - 'a' + 1; i < 26; i++) {
      if(set.contains(i))
        return (char) (i + 'a');
    }
    return letters[0];
  }
}
