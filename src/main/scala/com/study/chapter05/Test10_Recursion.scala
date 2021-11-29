package com.study.chapter05

import scala.annotation.tailrec

object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  //递归实现阶乘
  def fact(i: Int): Int = {
    if (i == 0)
      1
    else
      fact(i - 1) * i
  }

  //尾递归实现
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, result: Int): Int = {
      if (n == 0)
        result
      else
        loop(n - 1, result * n)
    }

    loop(n, 1)
  }

}
