package com.chgrivas.scalarat.kata.karatechop

import org.scalatest.{DiagrammedAssertions, FunSuite}

class KarateSpec extends FunSuite with DiagrammedAssertions {

  test("Calling the chop method of the companion object does not throw an exception") {
    assertCompiles("Karate.chop(1, Array.emptyIntArray)")
  }
}
