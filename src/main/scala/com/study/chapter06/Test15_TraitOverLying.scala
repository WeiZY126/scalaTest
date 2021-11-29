package com.study.chapter06

object Test15_TraitOverLying {
  def main(args: Array[String]): Unit = {
    val student15 = new Student15
    //最后一个特征
    student15.increase()

    val ball = new myFootBall
    println(ball.describe())
  }
}

trait Knowledge15 {
  var amount = 0

  def increase(): Unit = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Knowledge15 with Talent15 {
  override def singing(): Unit = println("sing")

  override def dancing(): Unit = println("dance")

  override def increase(): Unit = {
    super.increase()
  }
}

//钻石问题
//定义球类
trait Ball {
  def describe(): String = "ball"
}

//定义颜色
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = {
    color + "_" + super.describe()
  }
}

//定义种类
trait CategoryBall extends Ball {
  val category: String = "foot"

  override def describe(): String = category + "_" + super.describe() //super:CategoryBall
}

class myFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super[CategoryBall].describe()
}