package com.study.chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1.创建数组
    val arr: Array[Int] = new Array[Int](5)
    //另一种创建方式,伴声对象apply方法
    val arr2 = Array(1, 2, 3, 4, 5)

    //2.访问元素
    println(arr(0))
    //    println(arr(5))
    arr(0) = 11
    println(arr(0))

    //3.数组的遍历
    //1)普通for循环
    for (i <- 0 until arr.length) {
      println(arr(i))
    }

    for (i <- arr.indices) {
      println(arr(i))
    }

    //2)增强for循环，遍历所有元素
    for (elem <- arr2){
      println(elem)
    }

    //3)迭代器
    val iter = arr.iterator
    while (iter.hasNext){
      println(iter.next())
    }
    for (elem <- arr.iterator) {
      println(elem)
    }

    //4)foreach方法
    arr2.foreach(println)

    println(arr2.mkString("--"))

    //4.添加元素
    val newArr = arr2.:+(20)
    println(newArr.mkString("--"))

    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("--"))

    val newArr3 = newArr2 :+ 15 :+ 25
    val newArr4 = 19 +: 29 +: newArr3
    println(newArr3.mkString("--"))
    println(newArr4.mkString("--"))
  }

}
