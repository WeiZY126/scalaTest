package com.study.chapter07

object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建set
    val set1 = Set(1, 2, 3, 4, 5, 4, 3)
    println(set1)

    //2.添加元素
    val set2 = set1 + 20
    println(set2)

    //3.合并set
    val set3 = Set(6,7,8,9,10)
    val set4 = set3 ++ set2
    println(set4)

    //4.删除元素
    val set5 = set3 - 10
    println(set5)
  }

}
