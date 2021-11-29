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

    //4.赋值运算符
    var b: Byte = 10
    //    b += 1  //报错

    println(b)

    //5.位运算符
    //<< >>补符号位 >>>补0
    //0000 0000 0011 1100
    val a = 60
    //byte会自动转换成int
    println(a << 3) //0000 0001 1110 0000
    println(a >> 3) //0000 0000 0000 0111

    //13:0000 0000 0000 1101
    //取反+1：1111 1111 1111 0011
    val s: Short = -13

    //符号位不变，左移两位
    //1111 1111 1100 1100
    //1000 0000 0011 0100 =52取负数
    //32+16+4=-52
    println(s << 2) //-13 * 2^2
    println(2 >> 2)

    //1111 1111 1111 0011
    //0011 1111 1111 1100
    println(s >>> 2) //补0

    //6.运算符的本质
    val n1: Int = 12
    val n2: Int = 37
    println(n1 + n2)
    println(n1.+(n2))

    println(n1.toString)
    println(n1 toString)
  }

}
