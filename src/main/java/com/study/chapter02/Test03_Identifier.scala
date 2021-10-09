package com.study.chapter02

object Test03_Identifier {
  def main(args:Array[String]): Unit ={
    val hello: String = "";
    val _abc = 111;

    //以操作头开头，只包含操作符
    val +-*/ = "hello";
    println(+-*/);

    //用反引号``包括的任何字符
    val `val` = "hello"
    println(`val`)
  }
}
