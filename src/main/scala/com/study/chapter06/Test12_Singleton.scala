package com.study.chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1 == student2)
  }

}

//定义类
class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student6:name=${name} age=${age} school=${Student11.school}")
  }
}

//饿汉
//object Student12 {
//  private val student: Student12 = new Student12("alice", 18)
//
//  def getInstance() = {
//    student
//  }
//}

//懒汉
object Student12 {
  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null)
      student = new Student12("alice", 18)
    else
      student
  }
}