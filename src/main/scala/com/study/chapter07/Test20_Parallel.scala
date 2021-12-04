package com.study.chapter07

object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val strings = (1 to 100).map(x => Thread.currentThread().getId)
    println(strings)
    val result2 = (1 to 100).par.map(x => Thread.currentThread().getId)
    println(result2)
  }

}
