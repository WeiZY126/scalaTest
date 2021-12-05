package com.study.chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1("alice", 18)

    //针对对象示例的内容进行匹配
    val result = student1 match {
      case Student1("alice",18) => "Alice,18"
      case _ => "else"
    }
    println(result)
  }

}

//定义类
case class Student1(val name: String, val age: Int)
