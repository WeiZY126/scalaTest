package com.study.chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1: Student7 = new Student7("alice", 18)
    val student2: Student7 = new Student7("alice", 18, "001")
    val teacher: Teacher7 = new Teacher7
    teacher.printInfo

    def personInfo(person: Person7) = {
      person.printInfo
    }

    val person: Person7 = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

//定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1.父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2.父类辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo = {
    println(s"Person:$name $age")
  }
}

class Student7(name: String, age: Int) extends Person7() {
  println("3.子类主构造器被调用")
  var stuNo: String = _

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    println("4.子类辅助构造器调用")
    this.stuNo = stdNo
  }

  override def printInfo = {
    println(s"Person:$name $age $stuNo")
  }
}

class Teacher7 extends Person7 {
  override def printInfo = {
    println(s"Teacher")
  }
}
