package com.jlee.leetcodesolutions;

public class LeetCode0299 {
  /*
   * You are playing the following Bulls and Cows game with your friend: You write
   * down a number and ask your friend to guess what the number is. Each time your
   * friend makes a guess, you provide a hint that indicates how many digits in
   * said guess match your secret number exactly in both digit and position
   * (called "bulls") and how many digits match the secret number but locate in
   * the wrong position (called "cows"). Your friend will use successive guesses
   * and hints to eventually derive the secret number.
   * 
   * For example:
   * Secret number: "1807"
   * Friend's guess: "7810"
   * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
   * 
   * Write a function to return a hint according to the secret number and friend's
   * guess, use A to indicate the bulls and B to indicate the cows. In the above
   * example, your function should return "1A3B".
   * 
   * Please note that both secret number and friend's guess may contain duplicate
   * digits, for example:
   * Secret number: "1123"
   * Friend's guess: "0111"
   * 
   * In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a
   * cow, and your function should return "1A1B".
   * 
   * You may assume that the secret number and your friend's guess only contain
   * digits, and their lengths are always equal.
   * 
   * https://leetcode.com/problems/bulls-and-cows/description/
   */
  public String getHint(String secret, String guess) {
    if(secret == null || secret.length() == 0 || guess == null || guess.length() == 0)
      return "0A0B";
    
    int bull = 0, cow = 0;
    int[] counts = new int[10];
    for(int i = 0; i < secret.length(); i++) {
      int s = Character.getNumericValue(secret.charAt(i));
      int g = Character.getNumericValue(guess.charAt(i));
      if(s == g)
        bull++;
      else {
        // The number existed previously in guess
        if(counts[s] < 0) cow++;
        // The number existed previously in secret
        if(counts[g] > 0) cow++;
        counts[s]++;
        counts[g]--;
      }
    }
    return "" + bull + "A" + cow + "B";
    /*List<Character> sList = new ArrayList<>();
    List<Character> gList = new ArrayList<>();
    for(int i = 0; i < secret.length(); i++) {
      if(secret.charAt(i) == guess.charAt(i))
        bull++;
      else {
        sList.add(secret.charAt(i));
        gList.add(guess.charAt(i));
      }
    }
    for(Character ch : gList) {
      if(sList.contains(ch)) {
        cow++;
        sList.remove(ch);
      }
    }*/
  }
}
