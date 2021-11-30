package com.study.chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer[Int](11, 22, 33)

    println(list1)
    println(list2)

    //2.添加元素
    list1.append(0, 23)
    list2.prepend(20)
    list1.insert(1, 19, 22)
    println(list1)
    println(list2)

    31 +=: 56 +=: list1 += 25 += 30
    println(list1)

    //3.合并ListBuffer
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    list1 ++= list2
    println(list1)
    println(list2)

    list1 ++=: list2
    println(list1)
    println(list2)

    //4.修改元素
    list2(3) = 1
    println(list2)

    //5.删除元素
    list2.remove(2,50)
    println(list2)
    list2 -= 56
    println(list2)
  }

}
