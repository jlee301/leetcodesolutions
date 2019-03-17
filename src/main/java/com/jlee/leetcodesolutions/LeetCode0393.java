package com.jlee.leetcodesolutions;

public class LeetCode0393 {
  /*
   * A character in UTF8 can be from 1 to 4 bytes long, subjected to the following
   * rules:
   * For 1-byte character, the first bit is a 0, followed by its unicode code.
   * For n-bytes character, the first n-bits are all one's, the n+1 bit is 0,
   * followed by n-1 bytes with most significant 2 bits being 10.
   * 
   * This is how the UTF-8 encoding would work:
   * Char. number range | UTF-8 octet sequence
   * (hexadecimal)       | (binary)
   * --------------------+---------------------------------------------
   * 0000 0000-0000 007F | 0xxxxxxx
   * 0000 0080-0000 07FF | 110xxxxx 10xxxxxx
   * 0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
   * 0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
   * 
   * Given an array of integers representing the data, return whether it is a
   * valid utf-8 encoding.
   * 
   * https://leetcode.com/problems/utf-8-validation/description/
   */
  public boolean validUtf8(int[] data) {
    if(data == null || data.length == 0)
      return false;

    int i = 0;
    while(i < data.length) {
      int byteCount = 0;
      int firstOctet = data[i];
      // Determine the bytes from the first octet
      if(firstOctet >= 240 && firstOctet <= 247)
        byteCount = 4;
      else if(firstOctet >= 224 && firstOctet <= 239)
        byteCount = 3;
      else if(firstOctet >= 192 && firstOctet <= 223)
        byteCount = 2;
      else if(firstOctet >= 0 && firstOctet <= 127)
        byteCount = 1;
      else // Invalid byte for UTF-8 
        return false;
      
      for(int j = 1; j < byteCount; j++) {
        // There is not enough elements
        if(i+j > data.length-1)
          return false;
        // The next byteCount-1 elements should be between 128 <= data[i] <= 191
        if(data[i+j] < 128 || data[i+j] > 191)
          return false;
      }
      i += byteCount;
    }
    return true;
  }
}
