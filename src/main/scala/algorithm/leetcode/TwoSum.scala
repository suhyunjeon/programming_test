package algorithm.leetcode

import scala.collection.mutable.Map
/**
  * https://leetcode.com/problems/two-sum/
  * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
  * Example:
  *    Given nums = [2, 7, 11, 15], target = 9,
  *
  *    Because nums[0] + nums[1] = 2 + 7 = 9,
  *    return [0, 1].
  */
class TwoSum {
  def generate(nums: Array[Int], target: Int): Array[Int] = {
    val lookup = Map[Integer, Integer]()
    var actualList = Array[Int]()
    for (i <- nums.indices) {
      if (lookup.contains(target - nums(i))) {
        actualList +:= i.toInt
        actualList +:= lookup(target - nums(i)).toInt
      }
      lookup(nums(i)) = i
    }
    actualList
  }
}

object TwoSum extends TwoSum {
  def main(args: Array[String]) {
    generate(Array(2, 7, 11, 15), 9)
  }
}
