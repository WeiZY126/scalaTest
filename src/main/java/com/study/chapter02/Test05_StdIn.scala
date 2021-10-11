package com.study.chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println(s"输入姓名")
    val name: String = StdIn.readLine()
    println("输入年龄")
    val age: Int = StdIn.readInt()
    println(s"${name}的年龄是${age}")
  }

}
