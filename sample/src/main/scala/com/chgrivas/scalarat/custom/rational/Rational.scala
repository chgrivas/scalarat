package com.chgrivas.scalarat.custom.rational

class Rational(n: Int, d: Int) {
  require(d != 0)

  val g: Int = gcd(n, d)
  val num: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = num + "/" + denom

  def add(that: Rational): Rational = {
    new Rational(
      num * that.denom + denom * that.num,
      denom * that.denom
    )
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else  gcd(b, a % b)
}
