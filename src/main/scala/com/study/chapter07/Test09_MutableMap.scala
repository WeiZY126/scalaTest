package com.study.chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //1.创建map
    val map1 = mutable.Map("a" -> 20, "b" -> 15)
    println(map1)
    println(map1.getClass) //HashMap

    //2.添加元素
    map1.put("c", 5)
    map1.put("d", 9)
    println(map1)

    map1 += (("e", 7))
    println(map1)

    //3.删除元素
    map1.remove("e")
    map1 -= "d"
    println(map1.getOrElse("d", null))
    println(map1)

    //4.修改元素
    map1.update("d", 11)
    println(map1)
    map1.update("d", 12)
    println(map1)

    //5.合并两个Map
    val map2 = Map("a" -> 20, "b" -> 20, "aaa" -> 20)
    map1 ++= map2 //map2值添加到map1,并覆盖
    println(map1)
    println(map2)
  }

}
