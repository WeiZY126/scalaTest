package com.study.chapter06

object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student14 = new Student14
    student14.study()
    student14.increase()

    student14.play()
    student14.increase()

    student14.dating()
    student14.increase()

    //动态混入
    println("==================")
    val student1 = new Student14 with Talent {
      override def singing(): Unit = println("student is good at singing")

      override def dancing(): Unit = println("student is good at dancing")
    }
    student1.singing()
    student1.dating()
  }
}
//再定义一个特质
trait Knowledge{
  var amount =0
  def increase():Unit
}

trait Talent{
  def singing():Unit
  def dancing():Unit
}

class Student14 extends Person13 with Young with Knowledge {
  //重写冲突的属性
  override val name: String = "student"
  //实现抽象方法
  override def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from:student $name")
  }

  //实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1;
    println(s"student $name knowledge increased $amount")
  }
}
