package com.chgrivas.scalarat.kata.berlinuhr

object BerlinClock {

  def convertToBerlinTime(time: String): Array[String] = {
    Array("")
  }

  def seconds(s: Int): String = if (s % 2 == 0) "Y" else "O"

  def topHours(number: Int) = onOff(4, topNumberOfOnSigns(number))

  private def onOff(lamps: Int, onSigns: Int, onSign: String = "R") = {
    onSign * onSigns + "O" * (lamps - onSigns)
  }

  private def topNumberOfOnSigns(number: Int) = (number - (number % 5)) / 5
}
