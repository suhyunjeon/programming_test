package algorithm.leetcode

import org.scalatest.{Matchers, FunSuite}
import Matchers._
import algorithm.leetcode.LongestCommonPrefix.longestCommonPrefix

class LongestCommonPrefixTest extends FunSuite {

  test("longest common prefix 1") {
    longestCommonPrefix(Array("flower","flow","flight")) should be ("fl")
  }

  test("longest common prefix 2") {
    longestCommonPrefix(Array("dog","racecar","car")) should be ("")
  }
}
