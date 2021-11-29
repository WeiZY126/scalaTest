package com.study.chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Unit = {
      a + b
    }

    //1.考虑固定一个加数的场景
    def addByfour(b: Int): Int = {
      4 + b
    }

    //2.扩展固定加数改变的情况
    def addByFive(b: Int) = {
      5 + b
    }

    //3.将固定加数作为另一个参数传入，但是是作为“第一层参数”传入
    def addByFour1(): Int => Int = {
      val a = 4
      a + _
    }

    def addByA(a: Int): Int => Int = {
      a + _
    }

    println(addByA(45)(25))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    println(addByFour2(8))
    println(addByFive2(8))

    //5.柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(20)(6))
  }

}
