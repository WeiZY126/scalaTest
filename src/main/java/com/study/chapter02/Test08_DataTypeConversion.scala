package com.study.chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //1.
    val a1:Byte = 10
    val b1:Long = 2353
    val result1: Long = a1 + b1
    val result2:Int = (a1 + b1.toInt)

    //
  }

}
