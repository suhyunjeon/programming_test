package algorithm.leetcode

/**
  * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
  * Example 1:
  *   Input: 121
  *   Output: true
  * Example 2:
  *   Input: 10
  *   Output: false
  *   Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
  *
  */
class PalindromeNumber {
  def isPalindrome(x: Int): Boolean = {
    val reverseX = x.toString.reverse.toString
    if (x.toString != reverseX) return false
    true
  }

}

object PalindromeNumber extends PalindromeNumber{
  def main(args: Array[String]) {
    isPalindrome(121)
  }
}
