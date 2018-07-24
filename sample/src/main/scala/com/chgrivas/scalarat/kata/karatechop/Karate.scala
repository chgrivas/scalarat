package com.chgrivas.scalarat.kata.karatechop

object Karate {

  /**
    * First attempt. Let's do it with a loop.
     */
  def chop(t: Int, arr: Array[Int]): Int = {
    var min = 0
    var max = arr.length -1

    var guess = -1

    while (min <= max) {
      var guess = (max - min) / 2

      if (t == arr(guess))
        return guess
      else if (t > arr(guess))
        min = guess + 1
      else
        max = guess -1
    }
    -1
  }
}
