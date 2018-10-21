package com.jlee.leetcodesolutions;

public class LeetCode925 {
  /*
   * Your friend is typing his name into a keyboard. Sometimes, when typing a
   * character c, the key might get long pressed, and the character will be typed
   * 1 or more times.
   * 
   * You examine the typed characters of the keyboard. Return True if it is
   * possible that it was your friends name, with some characters (possibly none)
   * being long pressed.
   * 
   * https://leetcode.com/contest/weekly-contest-107/problems/long-pressed-name/
   */
  public boolean isLongPressedName(String name, String typed) {
    int i = 0, k = 0;
    while(i < name.length() && k < typed.length()) {
      // find the count of next char in name
      char ch = name.charAt(i);
      int j = i + 1;
      while(j < name.length() && ch == name.charAt(j)) {
        j++;
      }
      int len = j - i;
      i = j;
      
      // find the count of next char in typed
      char tyCh = typed.charAt(k);
      j = k + 1;
      while(j < typed.length() && tyCh == typed.charAt(j)) {
        j++;
      }
      int tyLen = j - k;
      k = j;
      
      // There must be at least len of ch in String type
      if(ch != tyCh || len > tyLen)
        return false;
    }
    return i == name.length() && k == typed.length() ? true : false;
  }
}
