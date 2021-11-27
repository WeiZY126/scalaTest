package com.study.chapter05

import scala.Boolean

object Test12_MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10

    //1.写一个常规的while循环
    while (n >= 1) {
      println(n)
      n -= 1
    }

    //2.用闭包实现一个函数，将代码块作为参数传入,递归调用
    def whileFun(condition: => Boolean): (=> Unit) => Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          whileFun(condition)(op)
        }
      }

      doLoop _
    }

    n = 10
    whileFun(n >= 1) {
      println(n)
      n -= 1
    }

    //3.用匿名函数实现
    def whileFun2(condition: => Boolean): (=> Unit) => Unit = {
      op => {
        {
          if (condition) {
            op
            whileFun2(condition)(op)
          }
        }
      }
    }

    //4.用柯里化实现
    def whileFun3(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        whileFun3(condition)(op)
      }
    }
  }
}