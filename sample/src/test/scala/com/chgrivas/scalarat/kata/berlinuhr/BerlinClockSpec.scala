package com.chgrivas.scalarat.kata.berlinuhr

import org.scalatest.{DiagrammedAssertions, FunSuite}

class BerlinClockSpec extends FunSuite with DiagrammedAssertions {

  test("BerlinClock exists") {
    assertCompiles("BerlinClock.convertToBerlinTime(\"15:13:22\")")
  }
}
