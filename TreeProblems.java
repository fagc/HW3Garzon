/*
 * *** Francisco Garzon / COMP 400C ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */

  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // create two temporary TreeSets and utilize the methods retainAll(), addAll(), and removeAll()
    Set<Integer> tempSetA = new TreeSet<>(setA);
    Set<Integer> tempSetB = new TreeSet<>(setB);

    // we can remove all elements from A also in B
    tempSetA.removeAll(setB);

    // we can remove all elements from B also in A
    tempSetB.removeAll(setA);

    // then we can combine the two sets and have only elements of one of them
    Set<Integer> setDifference = new TreeSet<>(tempSetA);
    setDifference.addAll(tempSetB);

    // return the difference
    return setDifference;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // using the ArrayList removeIf () Java library
    treeMap.entrySet().removeIf(thisKey -> thisKey.getKey() % 2 ==0);

  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // comparing the two maps using the equals method

    return tree1.equals(tree2);

  }

} // end treeProblems class
