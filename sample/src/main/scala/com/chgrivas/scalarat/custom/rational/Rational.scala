package com.chgrivas.scalarat.custom.rational

class Rational(n: Int, d: Int) {
  require(d != 0)

  def this(n: Int) = this(n, 1)

  override def toString: String = n + "/" + d
}
