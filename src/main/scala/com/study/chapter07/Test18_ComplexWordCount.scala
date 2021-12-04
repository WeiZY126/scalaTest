package com.study.chapter07

import scala.collection.mutable

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(("hello world", 1), ("hello", 2), ("hello scala", 3), ("spark from scala", 2))

    //1.思路一：直接展开为普通版本
    val newStringList = tupleList.map(kv => {
      (kv._1.trim + " ") * kv._2
    })
    println(newStringList)
    val wordCountList = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList.sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)

    //2.思路二：直接基于预统计结果进行转换
    //1.将字符串打散为单词，并结合对应的个数包装成二元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(tuple => {
      tuple._1.split(" ").map(word => (word, tuple._2))
    })
    val groupByMap = preCountList.groupBy(_._1)
    println(groupByMap)
    val list = groupByMap.mapValues(tupleList => {
      tupleList.map(_._2).sum
    })
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(list)
  }

}
