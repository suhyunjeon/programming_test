package algorithm.leetcode

/**
  * https://leetcode.com/problems/longest-common-prefix/
  */
class LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.isEmpty) ""
    else (strs.min, strs.max).zipped.takeWhile(v => v._1 == v._2).unzip._1.mkString.toString
  }
}

object LongestCommonPrefix extends LongestCommonPrefix {
  def main(args: Array[String]) {
    longestCommonPrefix(Array("dog","racecar","car"))
  }
}