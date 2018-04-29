package com.jlee.leetcodesolutions;

public class LeetCode824 {
  /*
   * A sentence S is given, composed of words separated by spaces. Each word
   * consists of lowercase and uppercase letters only.
   * 
   * We would like to convert the sentence to "Goat Latin" (a made-up language
   * similar to Pig Latin.)
   * 
   * The rules of Goat Latin are as follows: 1. If a word begins with a vowel (a,
   * e, i, o, or u), append "ma" to the end of the word. For example, the word
   * 'apple' becomes 'applema'. 2. If a word begins with a consonant (i.e. not a
   * vowel), remove the first letter and append it to the end, then add "ma". For
   * example, the word "goat" becomes "oatgma". 3. Add one letter 'a' to the end
   * of each word per its word index in the sentence, starting with 1. For
   * example, the first word gets "a" added to the end, the second word gets "aa"
   * added to the end and so on.
   * 
   * Return the final sentence representing the conversion from S to Goat Latin.
   * 
   * Notes:
   * S contains only uppercase, lowercase and spaces. Exactly one space between
   * each word. 1 <= S.length <= 100.
   * 
   * https://leetcode.com/contest/weekly-contest-82/problems/goat-latin/
   */
  public String toGoatLatin(String S) {
    // Split by space
    String[] data = S.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < data.length; i++) {
        String word = "";
        char ch = data[i].charAt(0);
        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
            // If first letter vowel
            word = data[i];
        else
            // First letter no vowel, flip first letter to end
            word = data[i].substring(1) + ch;
        
        word = word + "ma";
        // Appending additional "a" per word position
        for(int j = 0; j <= i; j++)
            word = word + "a";
        sb.append(word + " ");
    }
    return sb.toString().trim();
  }
}
