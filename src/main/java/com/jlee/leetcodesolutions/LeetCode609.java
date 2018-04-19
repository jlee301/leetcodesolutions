package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode609 {
  /*
   * Given a list of directory info including directory path, and all the files
   * with contents in this directory, you need to find out all the groups of
   * duplicate files in the file system in terms of their paths.
   * 
   * A group of duplicate files consists of at least two files that have exactly
   * the same content.
   * 
   * A single directory info string in the input list has the following format:
   * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
   * 
   * It means there are n files (f1.txt, f2.txt ... fn.txt with content
   * f1_content, f2_content ... fn_content, respectively) in directory
   * root/d1/d2/.../dm. Note that n >= 1 and m >= 0. If m = 0, it means the
   * directory is just the root directory.
   * 
   * The output is a list of group of duplicate file paths. For each group, it
   * contains all the file paths of the files that have the same content. A file
   * path is a string that has the following format:
   * "directory_path/file_name.txt"
   * 
   * Example 1:
   * Input:
   * ["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
   * "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
   * Output:
   * [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt",
   * "root/c/3.txt"]]
   * 
   * https://leetcode.com/problems/find-duplicate-file-in-system/description/
   */
  public List<List<String>> findDuplicate(String[] paths) {
    List<List<String>> result = new ArrayList<>();
    if(paths == null || paths.length == 0)
      return result;
    
    // Store by file content, list of files
    HashMap<String,List<String>> map = new HashMap<>();
    for(String path : paths) {
      String[] data = path.split(" ");
      // data[0] = directory path
      for(int i = 1; i < data.length; i++) {
        String[] file = data[i].split("\\(");
        // file[0] = file name
        // file[1] = file content
        if(!map.containsKey(file[1]))
          map.put(file[1], new ArrayList<>());
        map.get(file[1]).add(data[0] + "/" + file[0]);
      }
    }
    
    // Now find file content that occurs more than once and add to result
    for(String key : map.keySet()) {
      List<String> temp = map.get(key);
      if(temp.size() > 1)
        result.add(temp);
    }
    return result;
  }
}
