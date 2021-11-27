package com.study.chapter05

object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr = Array(45, 78, 22, 33)

    //对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    //定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    //调用函数
    val newArray = arrayOperation(arr, addOne)
    println(newArray.mkString("/"))

    //传入匿名函数，实现数组元素翻倍
    println(arrayOperation(arr, _ * 2).mkString(","))
  }

}
