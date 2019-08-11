package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1125;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1125 {
  @Test
  public void testProblemCase1() {
    String[] req_skills = {"java","nodejs","reactjs"};
    List<List<String>> people = new ArrayList<>();
    people.add(Arrays.asList(new String[] {"java"}));
    people.add(Arrays.asList(new String[] {"nodejs"}));
    people.add(Arrays.asList(new String[] {"nodejs", "reactjs"}));
    
    LeetCode1125 solution = new LeetCode1125();
    int[] result = solution.smallestSufficientTeam(req_skills, people);
    Assert.assertArrayEquals(new int[] {0, 2}, result);
    // System.out.println(Arrays.toString(result));
  }

  @Test
  public void testProblemCase2() {
    String[] req_skills = {"algorithms","math","java","reactjs","csharp","aws"};
    List<List<String>> people = new ArrayList<>();
    people.add(Arrays.asList(new String[] {"algorithms","math","java"}));
    people.add(Arrays.asList(new String[] {"algorithms","math","reactjs"}));
    people.add(Arrays.asList(new String[] {"java","csharp","aws"}));
    people.add(Arrays.asList(new String[] {"reactjs","csharp"}));
    people.add(Arrays.asList(new String[] {"csharp","math"}));
    people.add(Arrays.asList(new String[] {"aws","java"}));
    
    LeetCode1125 solution = new LeetCode1125();
    int[] result = solution.smallestSufficientTeam(req_skills, people);
    Assert.assertArrayEquals(new int[] {1, 2}, result);
    // System.out.println(Arrays.toString(result));
  }

  @Test
  public void testProblemCase3() {
    String[] req_skills = {"algorithms","math","java","reactjs","csharp","aws"};
    List<List<String>> people = new ArrayList<>();
    people.add(Arrays.asList(new String[] {"idiot1"}));
    people.add(Arrays.asList(new String[] {"idiot2"}));
    
    LeetCode1125 solution = new LeetCode1125();
    int[] result = solution.smallestSufficientTeam(req_skills, people);
    Assert.assertArrayEquals(new int[] {}, result);
    // System.out.println(Arrays.toString(result));
  }

  @Test
  public void testProblemCase4() {
    String[] req_skills = {"gkgtfxpvxnxlbhxu","baayobms","yomqrposuurmvisx","vsftojpcp","pjovtkytubbouq","hlmvucyi","chpzrslbtd","uighcqpiteg"};
    List<List<String>> people = new ArrayList<>();
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"baayobms"}));
    people.add(Arrays.asList(new String[] {"baayobms","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"chpzrslbtd"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {"uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"gkgtfxpvxnxlbhxu","yomqrposuurmvisx","uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq","uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"gkgtfxpvxnxlbhxu","yomqrposuurmvisx","pjovtkytubbouq","uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"chpzrslbtd"}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"baayobms"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","chpzrslbtd"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"vsftojpcp"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"gkgtfxpvxnxlbhxu"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq","chpzrslbtd"}));
    people.add(Arrays.asList(new String[] {"uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq","uighcqpiteg"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"chpzrslbtd"}));
    people.add(Arrays.asList(new String[] {"hlmvucyi"}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx","pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {"pjovtkytubbouq"}));
    people.add(Arrays.asList(new String[] {}));
    people.add(Arrays.asList(new String[] {"yomqrposuurmvisx"}));
    people.add(Arrays.asList(new String[] {}));
    
    LeetCode1125 solution = new LeetCode1125();
    int[] result = solution.smallestSufficientTeam(req_skills, people);
    Assert.assertArrayEquals(new int[] {16, 1, 3, 54, 39}, result);
    // System.out.println(Arrays.toString(result));
  }
}
