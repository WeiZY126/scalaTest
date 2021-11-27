package com.study.chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    //1.可变参数
    def f1(str: String*) = {
      println(str)
    }

    f1("alice")
    f1("aaa", "bbb", "ccc")

    //2.如果参数列表里有多个参数，那么可变参数一般放在最后
    def f2(str1: String, str2: String*) = {
      println(s"str1:${str1},str2:${str2}")
    }

    f2("aaa")

    //3.参数默认值
    def f3(name: String = "张三") = {
      println(name)
    }

    f3()
    f3("李四")

    //4.带名参数

    def f4(name: String = "李四", age: Int) = {
      println(s"${name + age}岁了")
    }

    f4("张三", 20)
    f4(age = 13)
  }

}
