package com.study.chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
    val student11: Student11 = Student11.newStudent("alice",11)
    student11.printInfo()

    val student111: Student11 = Student11.apply("bob",20)
    student111.printInfo()

    val student112: Student11 = Student11("bob",20)
    student112.printInfo()
  }
}

//定义类
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student6:name=${name} age=${age} school=${Student11.school}")
  }
}

object Student11 {
  val school: String = "study"

  //定义一个类的对象实例的创建方法
  def newStudent(name:String,age:Int) ={
    new Student11(name,age)
  }

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}