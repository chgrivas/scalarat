package com.chgrivas.scalarat.custom.rational

class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString: String = n + "/" + d
}
