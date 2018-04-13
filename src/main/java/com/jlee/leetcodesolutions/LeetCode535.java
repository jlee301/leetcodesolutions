package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Random;

public class LeetCode535 {
  /*
   * TinyURL is a URL shortening service where you enter a URL such as
   * https://leetcode.com/problems/design-tinyurl and it returns a short URL such
   * as http://tinyurl.com/4e9iAk.
   * 
   * Design the encode and decode methods for the TinyURL service. There is no
   * restriction on how your encode/decode algorithm should work. You just need to
   * ensure that a URL can be encoded to a tiny URL and the tiny URL can be
   * decoded to the original URL.
   */
  private HashMap<String,String> map;
  private static final String TINYURL = "http://tinyurl.com/";
  
  public LeetCode535() {
    map = new HashMap<>();
  }
  
  // Encodes a URL to a shortened URL.
  public String encode(String longUrl) {
    String shortUrl = "";
    do {
      StringBuilder sb = new StringBuilder();
      Random rand = new Random();
      while(sb.length() < 6) {
        int type = rand.nextInt(3);
        if(type == 0)
          sb.append(rand.nextInt(10));
        else if(type == 1)
          sb.append((char)('A' + rand.nextInt(26)));
        else
          sb.append((char)('a' + rand.nextInt(26)));
      }
      shortUrl = sb.toString();
    } while(map.containsKey(shortUrl));
    map.put(shortUrl, longUrl);
    return TINYURL + shortUrl;
  }

  // Decodes a shortened URL to its original URL.
  public String decode(String shortUrl) {
    return map.get(shortUrl.replace(TINYURL, ""));
  }
}
