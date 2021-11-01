package com.study.chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    //1.算术运算符
    val result1 = 10 / 3
    println(result1)

    val result2: Double = 10 / 3 //3.0
    println(result2)

    val result3: Double = 10.0 / 3.0
    println(result3.formatted("%5.2f"))

    val result4: Int = 10 % 3
    println(result4)

    //2.比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) //scala中为true
    println(s1.equals(s2))

    //3.逻辑运算符
    def m(n: Int): Int = {
      println(s"m被调用");
      1
    }

    println(4 > 5 & m(1) > 0)

    def isNotEmpty(str: String): Boolean = {
      return (str != null) && (!("" == str.trim))
    }
  }

}
