package com.chgrivas.scalarat.kata.karatechop

import org.scalatest.{DiagrammedAssertions, FunSuite}

class KarateSpec extends FunSuite with DiagrammedAssertions {

  test("Calling the chop method of the companion objectcompiles successfully") {
    assertCompiles("Karate.chop(1, Array.emptyIntArray)")
  }

  test("Searching in an emmpty array returns -1") {
    assert(Karate.chop(1, Array.emptyIntArray) == -1)
  }

  test("Searching in a single element array a non existing value returns -1") {
    assert(Karate.chop(1, Array(10)) == -1)
  }

  test("Searching in a single element array an existing value returns the correct index") {
    assert(Karate.chop(10, Array(10)) == 0)
  }
}
