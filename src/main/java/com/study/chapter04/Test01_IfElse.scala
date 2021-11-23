package com.study.chapter04

import scala.io.StdIn

object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    val age: Int = StdIn.readInt()

    if (age >= 18) {
      println("成年")
    } else if (age >= 36) {
      println("青年")
    } else {
      println("未成年")
    }


    //分支语句返回值
    val result: Any = if (age >= 18) {
      println("成年")
      age
    } else if (age >= 36) {
      println("青年")
      "ff"
    } else {
      println("未成年")
    }

    println(result)

    //三元运算符
    val res = if (age >= 18) "成年" else "未成年"
  }
}
