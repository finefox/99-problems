package com.shekhargulati.ninetynine_problems.scala.lists

/**
  * (*) Lotto: Draw N different random numbers from the set 1..M
  */
object P24 {

  def randomSelect(n: Int, range: (Int, Int)): List[Int] = P23.randomSelectR(P22.range(range._1, range._2), n)

}
