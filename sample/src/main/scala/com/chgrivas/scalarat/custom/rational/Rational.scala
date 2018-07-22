package com.chgrivas.scalarat.custom.rational

class Rational(n: Int, d: Int) {
  require(d != 0)

  val g: Int = gcd(n, d)
  val num: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = num + "/" + denom

  def +(that: Rational): Rational =
    new Rational(
      num * that.denom + denom * that.num,
      denom * that.denom
    )

  def +(i: Int): Rational =
    new Rational(
      num + denom * i,
      denom
    )

  def *(that: Rational): Rational =
    new Rational(
      num * that.num,
      denom * that.denom
    )

  def *(i: Int): Rational =
    new Rational(
      num * i,
      denom
    )

  def -(that: Rational): Rational =
    new Rational(
      num * that.denom - that.num * denom,
      denom * that.denom
    )

  def -(i: Int): Rational =
    new Rational(
      num - i * denom,
      denom
    )

  def /(that: Rational): Rational =
    new Rational(
      num * that.denom,
      denom * that.num
    )

  def /(i: Int): Rational =
    new Rational(
      num,
      denom * i
    )

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else  gcd(b, a % b)
}
