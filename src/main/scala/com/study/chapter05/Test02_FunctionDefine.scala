package com.study.chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    //1.无参无返回值
    def f1():Unit={
      println("1.无参无返回值")
    }
    f1()

    //2.无参有返回值
    def f2():Int={
      println("2.无参有返回值")
      return 1
    }
    println(f2())

    //3.有参无返回值
    def f3(name : String):Unit={
      println("3.有参无返回值")
    }
    println(f3("zhangsan"))

    //4.有参有返回值
    def f4(name : String):String={
      println("4.有参有返回值")
      return "hi"+name
    }
    println(f4("lisi"))

    //5.多参无返回值
    def f5(name1 : String,name2 : Unit):Unit={
      println("5.多参无返回值")
    }
    println(f5("lisi","lili"))

    //6.多参有返回值
    def f6(name1 : String,name2 : String):Unit={
      println("6.多参有返回值")
      return s"${name1}:${name2}"
    }
    println(f6("lisi","lili"))
  }

}
