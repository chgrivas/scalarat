package com.chgrivas.scalarat.kata.berlinuhr

object BerlinClock {

  def convertToBerlinTime(time: String): Array[String] = {
    Array("")
  }

  def seconds(s: Int): String = if (s % 2 == 0) "Y" else "O"
}
