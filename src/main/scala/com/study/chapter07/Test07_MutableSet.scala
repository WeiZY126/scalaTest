package com.study.chapter07


import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建set
    val set1 = mutable.Set[Int](1, 2, 3, 4, 5)
    println(set1)

    //2.添加元素
    val set2 = set1 + 6 //不管可变不可变，当前都不做改变
    println(set2)

    set1 += 11
    println(set1)

    val flag1 = set1.add(12)
    println(set1)
    println(flag1)

    val flag2 = set1.add(12)
    println(flag2)

    //3.删除元素
    set1 -= 11
    println(set1)

    val flag3 = set1.remove(12)
    println(set1)
    println(flag3)
    val flag4 = set1.remove(12)
    println(flag4)

    //4.合并两个set
    val set3 = mutable.Set(1, 2, 6, 7, 8)
    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)

    set1 ++= set3
    println(set1)
  }

}
