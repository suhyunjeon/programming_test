package algorithm.leetcode

import org.scalatest.{Matchers, FunSuite}
import Matchers._
import algorithm.leetcode.ReverseInteger.generate

class ReverseIntegerTest extends FunSuite {

  test("reverse integer 1") {
    generate(123) should be (321)
  }

  test("reverse integer 2") {
    generate(-321) should be (-123)
  }

  test("reverse integer 3") {
    generate(120) should be (21)
  }

  test("reverse integer 4") {
    generate(Int.MaxValue + 1) should be (0)
  }

  test("reverse integer 5") {
    generate(Int.MinValue+ 1) should be (0)
  }

  test("reverse integer 6") {
    generate(964632451) should be (0)
  }

}
