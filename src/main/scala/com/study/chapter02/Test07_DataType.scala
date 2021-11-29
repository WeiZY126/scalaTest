package com.study.chapter02

import scala.xml.Null

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    //1.整数类型
    val a1: Byte = 127
    //val a2: Byte = 128 错误

    val a3 = 12 //证书默认类型为int

    val a4 = 9999999999999999L //长整型定义

    val b1: Byte = 10
    val b2: Byte = 10 + 20
    println(b2)

    val b3: Byte = (b1 + 20).toByte
    println(b3)

    //2.浮点类型
    val f1: Float = 1.2345f

    //3.字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    val c3: Char = '\t'
    val c4: Char = '\n'
    println(s"abc${c3}def")
    println(s"abc${c4}def")

    //转义字符
    val c5 = '\\' //表示\自身
    val c6 = '\"' //表示"

    //字符变量底层保存整型数据，对应ASCII码
    val i1: Int = c1
    println("i1:" + i1)
    val i2: Int = c2
    println(s"i2:${i2}")

    val c7: Char = (i1 + 1).toChar
    println(c7)

    //4.布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    //5.空类型
    //5.1 空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a = m1();
    println(s"a+${a}")

    //5.2空引用Null
    //    val n : Int = Null   error
    var student: Student = new Student()
    student = null;
    println(student)

    //5.3Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        return n
      else
        throw new NullPointerException
    }

    val b = m2(0)
    println(b)
  }

}
