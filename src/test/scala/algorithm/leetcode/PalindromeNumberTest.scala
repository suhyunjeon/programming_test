package algorithm.leetcode

import algorithm.leetcode.PalindromeNumber._
import org.scalatest.FunSuite
import org.scalatest.Matchers._

class PalindromeNumberTest extends FunSuite {
  test("palindrome number1") {
    isPalindrome(121) should be (true)
  }

  test("palindrome number2") {
    isPalindrome(-121) should be (false)
  }

  test("palindrome number3") {
    isPalindrome(10) should be (false)
  }

  test("palindrome number4") {
    isPalindrome(Int.MaxValue + 1) should be (0)
  }
}
