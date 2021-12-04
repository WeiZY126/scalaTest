package com.study.chapter07

import scala.collection.mutable

object Test17_SimpleWordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List("hello world", "hello", "hello scala", "spark from scala")
    val splitList = stringList.map(_.split(" ")).flatten
    val groupMap = splitList.groupBy(a => a)
    val mergeMap = mutable.Map[String, Int]()
    //    val result = groupMap.foldLeft(mergeMap)((mergeMap, kv) => {
    //      mergeMap.put(kv._1, kv._2.length)
    //      mergeMap
    //    })
    //    println(result)

    val countMap = groupMap.map(kv => (kv._1, kv._2.length))
    //将map转换为list，排序取前三
    val sortList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(sortList)
  }

}
