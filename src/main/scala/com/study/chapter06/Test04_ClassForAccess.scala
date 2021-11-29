package com.study.chapter06

object Test04_ClassForAccess {


}

//定义父类
class Person {
  private var idCard: String = "123"
  protected var name: String = "alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo()={
    println(s"Persion:$idCard $name $sex $age")
  }
}
