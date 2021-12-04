package com.study.chapter07

import scala.collection.mutable
import scala.collection.immutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    //创建可变队列
    val queue = new mutable.Queue[String]()
    queue.enqueue("a","b","c")
    println(queue)
    val str = queue.dequeue()
    println(str)
    println(queue)
    queue.enqueue("d","e")
    println(queue)

    //创建不可变队列
    val queue2 = immutable.Queue[String]("a","b","c")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)
  }

}
