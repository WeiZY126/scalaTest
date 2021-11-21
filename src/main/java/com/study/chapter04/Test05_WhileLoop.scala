package com.study.chapter04

object Test05_WhileLoop {
  def main(args: Array[String]): Unit = {
    //while
    var i: Int = 10;
    while (i >= 1) {
      println("while...." + i)
      i -= 1
    }

    do {
      println("do while...." + i)
      i += 1
    } while (i <= 10)
  }

}
