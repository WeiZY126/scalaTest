package com.study

package object chapter06 {
  //定义当前包共享的属性和方法
  val commonValue = "study"

  def commonMethod() = {
    println("common")
  }
}
