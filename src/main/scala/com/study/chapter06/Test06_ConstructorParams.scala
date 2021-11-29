package com.study.chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student: Student2 = new Student2
    student.name = "alice"
    println(s"student2:name=${student.name} age=${student.age}")

    val student3: Student3 = new Student3("bob", 20)
    println(s"student3:name=${student3.name} age=${student3.age}")

    val student4: Student4 = new Student4("cary", 25)
    //    println(s"student4:name=${student4.name} age=${student4.age}")
    student4.printInfo()

    val student5: Student5 = new Student5("bob", 20)
    println(s"student5:name=${student5.name} age=${student5.age}")

    val student6: Student6 = new Student6("bob", 20, "study")
    println(s"student6:name=${student6.name} age=${student6.age}")
    student6.printInfo()
  }
}

//定义类
//无参构造器
class Student2 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

//上面定义等价于
class Student3(var name: String, var age: Int)

//主构造器参数无修饰
class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"student4:name=${name} age=${age}")
  }
}

class Student44(_name: String, _age: Int) {
  var name: String = _name
  var age: Int = _age
}

class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"student6:name=${name} age=${age} school=$school")
  }
}