package com.study.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建可变数组
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer[Int](1, 2, 3)

    println(arr1)
    println(arr2.toString())

    //2.访问元素
    println(arr2(0))
    arr2(0) = 20
    println(arr2(0))

    //3.添加元素
    val newArr1 = arr1 :+ 20 //主要针对不可变集合，还得创建新数组
    println(newArr1)

    val newArr2 = arr1 += 18
    println(arr1)
    println(newArr2)
    println(arr1 == newArr2)
    newArr2 += 11
    println(arr1)

    19 +=: arr1
    println(arr1)

    arr1.append(2)
    arr1.prepend(1)
    println(arr1)
    arr1.insert(1, 55, 28, 26)
    println(arr1)

    arr1.insertAll(1, newArr1)
    arr1.appendAll(newArr2)
    arr1.prependAll(newArr1)
    println(arr1)

    //4.删除元素
    arr1.remove(3)
    println(arr1)
    arr1.remove(0, 10)
    println(arr1)

    arr1 -= 19 //先遍历，再删除
    println(arr1)

    //5.可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString("-"))
    println(arr)

    //6.不可变数组转换为可变数组
    val buffer:mutable.Buffer[Int] = newArr.toBuffer


  }

}
