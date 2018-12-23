package algorithm.leetcode

/**
  * Given a 32-bit signed integer, reverse xs of an integer.
  *   Example 1:
  *     Input: 123
  *     Output: 321
  *   Example 2:
  *     Input: -123
  *     Output: -321
  */
class ReverseInteger {
  def reverseAbs(x: Int, reverseX: Int): Int = if (x >= 0) reverseX else -reverseX

  def generate(x: Int): Int = {
    val reverseX: String = x.abs.toString.reverse.toString
    try {
      if (reverseX.toInt > Int.MaxValue) 0 else reverseAbs(x, reverseX.toInt)
    } catch {
      case e: java.lang.NumberFormatException => 0
    }
  }
}

object ReverseInteger extends ReverseInteger{
  def main(args: Array[String]) {
    println(generate(-123))
  }
}
