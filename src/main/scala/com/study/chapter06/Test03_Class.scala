package com.study.chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    //创建对象
    val student: Student = new Student
//    student.name  //不能访问private
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

class Student {
  //定义属性
  private var name: String = "alice"
  @BeanProperty
  var age: Int = _
  var sex: String = _
}
