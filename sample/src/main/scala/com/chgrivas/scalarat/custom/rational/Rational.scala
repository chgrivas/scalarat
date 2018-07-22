package com.chgrivas.scalarat.custom.rational

class Rational(n: Int, d: Int) {
  require(d != 0)

  val num: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1)

  override def toString: String = n + "/" + d

  def add(that: Rational): Rational = {
    new Rational(
      num * that.denom + denom * that.num,
      denom * that.denom
    )
  }
}
