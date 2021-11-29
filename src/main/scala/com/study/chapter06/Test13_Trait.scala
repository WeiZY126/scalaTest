package com.study.chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student13 = new Student13
    student13.sayHello()
    student13.study()
    student13.dating()
    student13.play()
  }

}

//定义一个父类
class Person13 {
  val name = "person"
  var age = 18

  def sayHello() = {
    println("hello from:" + name)
  }
  def increase(): Unit = {
    println("person increased")
  }
}

trait Young {
  //定义抽象和非抽象的属性和方法
  var age: Int
  val name = "young"

  //声明抽象和非抽象方法
  def play() = {
    println("young people is playing")
  }

  def dating(): Unit
}

class Student13 extends Person13 with Young {
  //重写冲突的属性
  override val name: String = "student"
  //实现抽象方法
  override def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from:student $name")
  }
}
