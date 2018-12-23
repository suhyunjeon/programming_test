package algorithm.leetcode

import org.scalatest._
import Matchers._
import algorithm.leetcode.TwoSum.generate

class TwoSumTest extends FunSuite {
  test("two sum 1") {
    generate(Array(2, 7, 11, 15), 9) should be (List(0, 1))
  }

  test("two sum 2") {
    generate(Array(0, 3, 1, 3), 6) should be (List(1, 3))
  }
}
