package com.study.chapter04

object Test04_Practice_Pyramid {
  def main(args: Array[String]): Unit = {
    for {i <- 1 to 9 by 2
         j = " " * ((9 - i) / 2)
         k = "*" * i
         } {
      println(j + k)
    }

    for (stars <- 1 to 17 by 2; space = (17 - stars) / 2) {
      println(s"${" " * space}${"*" * stars}")
    }


  }

}
