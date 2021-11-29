package com.study.chapter04

import scala.collection.immutable

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {

    //1.范围遍历
    for (i <- 1 to 10) {
      println(s"$i.hello world")
    }
    for (i: Int <- 1.to(10)) {
      println(s"$i.hello world")
    }

    for (i <- Range(1, 10)) {
      println(s"$i.hello world")
    }

    for (i <- 1 until 10) {
      println(s"$i.hello world")
    }

    //2.集合遍历
    for (i <- Array(12, 34, 55)) {
      println(s"$i.hello world")
    }

    for (i <- List(12, 34, 55)) {
      println(s"$i.hello world")
    }

    for (i <- Set(12, 34, 55)) {
      println(s"$i.hello world")
    }

    println("================")

    //3.循环守卫
    for (i <- 1 to 10 if i != 5) {
      //      if (i==5){
      //        continue
      //      }
      println(i)
    }

    //4.循环步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    for (i <- 35 to 30 by -2) {
      println(i)
    }

    for (i <- 1 to 10 reverse) { //反转
      println(i)
    }

    //    for (i <- 1 to 10 by 0){
    //      println(i)
    //    }

    for (i <- 1.0 to 10.0 by 0.3) {
      println(i)
    }

    println("================")

    //5.循环嵌套

    for (i <- 1 to 9; j <- 1 to 9) {
      println(s"i=$i,j=$j")
    }

    println("================")
    //6.引入变量
    for (i <- 1 to 10; j = 10 - i) {
      println(s"i=$i j=$j")
    }

    for {i <- 1 to 10
         j = 10 - i} {
      println(s"i=$i j=$j")
    }

    //6.循环返回值
    val a: Unit = for (i <- 1 to 10) { //默认返回unit
      i
    }
    println(s"a=$a")

    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i*i
    println(s"b=$b")
  }
}
