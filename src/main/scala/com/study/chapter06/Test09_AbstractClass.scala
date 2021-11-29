package com.study.chapter06

object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student: Student9 = new Student9
    student.eat()
    student.sleep()
  }
}

//定义抽象类
abstract class Person9 {
  //非抽象属性
  val name: String = "person"
  //抽象属性
  var age: Int

  //非抽象方法
  def eat() = {
    println("person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//具体实现子类
class Student9 extends Person9 {
  //实现抽象属性和方法

  var age: Int = _

  override def sleep(): Unit = {
    println("student sleep")
  }

  //重写非抽象属性和方法
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}
