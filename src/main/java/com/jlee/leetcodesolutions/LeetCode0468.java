package com.jlee.leetcodesolutions;

public class LeetCode0468 {
  /*
   * Write a function to check whether an input string is a valid IPv4 address or
   * IPv6 address or neither.
   * 
   * IPv4 addresses are canonically represented in dot-decimal notation, which
   * consists of four decimal numbers, each ranging from 0 to 255, separated by
   * dots ("."), e.g.,172.16.254.1;
   * 
   * Besides, leading zeros in the IPv4 is invalid. For example, the address
   * 172.16.254.01 is invalid.
   * 
   * IPv6 addresses are represented as eight groups of four hexadecimal digits,
   * each group representing 16 bits. The groups are separated by colons (":").
   * For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid
   * one. Also, we could omit some leading zeros among four hexadecimal digits and
   * some low-case characters in the address to upper-case ones, so
   * 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading
   * zeros and using upper cases).
   * 
   * However, we don't replace a consecutive group of zero value with a single
   * empty group using two consecutive colons (::) to pursue simplicity. For
   * example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.
   * 
   * Besides, extra leading zeros in the IPv6 is also invalid. For example, the
   * address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.
   * 
   * Note: You may assume there is no extra space or special characters in the
   * input string.
   */
  private static final String NEITHER = "Neither";
  private static final String IP6 = "IPv6";
  private static final String IP4 = "IPv4";
  
  public String validIPAddress(String IP) {
    if(IP == null || IP.isEmpty())
      return NEITHER;
    
    boolean ipv4 = IP.indexOf(".") >= 0 ? true : false;
    String[] data;
    if(ipv4) {
      if(IP.charAt(0) == '.' || IP.charAt(IP.length()-1) == '.')
        return NEITHER;

      // IPv4 must be split into four subs
      data = IP.split("\\.");
      if(data.length != 4)
        return NEITHER;
      
      for(String sub : data) {
        // sub is empty
        if(sub.trim().isEmpty())
          return NEITHER;

        // sub greater than 3
        if(sub.length() > 3)
          return NEITHER;
        
        // sub begins with a leading zero
        if(sub.charAt(0) == '0' && sub.length() != 1)
          return NEITHER;

        // sub is not all digits
        for(int i = 0; i < sub.length(); i++) {
          char ch = sub.charAt(i);
          if(!Character.isDigit(ch))
            return NEITHER;
        }
        
        // sub is not in range 0 - 255
        int num = Integer.valueOf(sub);
        if(num > 255)
          return NEITHER;
      }
      return IP4;
    } 
    else {
      if(IP.charAt(0) == ':' || IP.charAt(IP.length()-1) == ':')
        return NEITHER;
      
      // IPv6 must be split into eight subs
      data = IP.split(":");
      if(data.length != 8)
        return NEITHER;
      
      for(String sub : data) {
        // sub is empty
        if(sub.trim().isEmpty())
          return NEITHER;
        
        // sub is greater than 16 bit
        if(sub.length() > 4)
          return NEITHER;
        
        // sub is not in hex range
        for(int i = 0; i < sub.length(); i++) {
          char ch = sub.charAt(i);
          if(Character.digit(ch, 16) == -1)
            return NEITHER;
        }
      }
      return IP6;
    }
  }
}
