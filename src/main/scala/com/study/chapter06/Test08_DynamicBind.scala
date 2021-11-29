package com.study.chapter06

object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name) //动态绑定
    student.hello() //动态绑定
  }
}

class Person8 {
  val name = "person"

  def hello() = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "student"

  override def hello() = {
    println("hello student")
  }
}
