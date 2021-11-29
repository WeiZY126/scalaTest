package com.study.chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    //创建对象
    val person: Person = new Person
//    person.idCard
//    person.name
    println(person.age+person.sex)
    person.printInfo()

    val worker: Worker = new Worker
    worker.printInfo()
  }
}

//定义一个子类
class Worker extends Person{
  override def printInfo(): Unit = {
    name = "bob"
    age = 25
    sex = "male"
    println(s"Worker:$name $sex $age")
  }
}