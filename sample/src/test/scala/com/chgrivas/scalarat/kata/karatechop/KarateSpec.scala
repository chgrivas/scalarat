package com.chgrivas.scalarat.kata.karatechop

import org.scalatest.{DiagrammedAssertions, FunSuite}

class KarateSpec extends FunSuite with DiagrammedAssertions {

  test("Calling the chop method of the companion objectcompiles successfully") {
    assertCompiles("Karate.chop(1, Array.emptyIntArray)")
  }
}
