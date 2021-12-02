package com.study.chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 5, 8)
    val list2 = List(3, 5, 7, 9, 11, 13)
    val set = Set(1, 5, 8, 7, 6)

    //1.获取集合的头
    println(list1.head)
    //2.获取集合的尾
    println(list1.tail) //去掉头之后的元素
    //3.集合最后一个元素
    println(list2.last)
    //4.集合初始元素
    println(list2.init) //去掉最后一位之前的数组
    //5.反转
    println(list1.reverse)
    //6.取前（后）n个元素
    println(list1.take(3))
    println(list1.takeRight(3))
    //7.去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(4))
    println("================")
    //8.并集
    val union = list1.union(list2)
    println("union:" + union)
    //如果是set做并集，会去重
    val set1 = Set(1, 2, 3, 5, 8)
    val set2 = Set(3, 5, 7, 9, 11, 13)
    println(set1.union(set2))
    println(set1 ++ set2)
    //9.交集
    val intersection = list1.intersect(list2)
    println(intersection)
    //10.差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)
    //11.拉链
    println("zip" + list1.zip(list2))
    println("zip" + list2.zip(list1))
    //12.划窗
    val iterator: Iterator[List[Int]] = list1.sliding(4, 2)
    iterator.foreach(println)
    list1.sliding(3, 3).foreach(println)
  }

}
