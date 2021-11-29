package com.study.chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1: Student1 = new Student1
    student1.Student1()
    val student2: Student1 = new Student1("alice")
    val student3: Student1 = new Student1("alice",25)
  }

}

//定义一个类
class Student1() {
  //定义属性
  var name: String = _
  var age: Int = _

  println("1.主构方法被调用")

  //声明辅助构造方法
  def this(name: String) {
    this() //直接调用主构造器
    println("2.辅助构造方法1被调用")
    this.name = name
    println(s"name:$name age:$age")
  }

  def this(name: String, age: Int) {
    this(name)
    println("3.辅助构造方法2被调用")
    this.age = age
    println(s"name:$name age:$age")
  }

  def Student1() = {
    println("不是构造方法被调用，而是一般方法被调用")
  }
}