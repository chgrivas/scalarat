package com.chgrivas.scalarat.sample

import org.scalatest.{DiagrammedAssertions, FunSuite}

class SampleSpec extends FunSuite with DiagrammedAssertions {

  test("Hello starts with the letter H") {
    assert("Hello".startsWith("H"))
  }
}
