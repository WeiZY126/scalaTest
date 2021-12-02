package com.study.chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5, 1, 8, 2, -3, 4)
    val list1 = List(("a", 5), ("b", 20), ("c", 5), ("d", 2), ("e", 8))
    //1.求和
    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)

    println(list.sum)

    //2.求乘积
    println(list.product)

    //3.求最大值
    println(list.max)
    println(list1.max)
    println(list1.maxBy((tuple: (String, Int)) => tuple._2))
    println(list1.maxBy(_._2))

    //4.求最小值
    println(list.min)
    println(list1.minBy(_._2))

    //5.排序
    //5.1 sorted
    val sortedList = list.sorted
    println(sortedList)

    //从大到小逆序排列
    println(list.sorted.reverse)
    //传入一个隐式参数
    println(list.sorted(Ordering[Int].reverse))

    println(list1.sorted)
    //5.2sortBy
    println(list1.sortBy(_._2)(Ordering[Int].reverse))

    //5.3 sortWith
    println(list.sortWith((x, y) => x < y))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))
  }

}
