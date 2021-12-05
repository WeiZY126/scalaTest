package com.study.chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    //1.匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "num one"
      case "hello" => "string hello"
      case true => "boolean true"
      case _ => "" //scala.MatchError
    }

    println(describeConst("11"))
    println("=================")

    //2.匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case i: Char => "Char" + i
      case i: List[String] => "List[String]" + i //泛型无法判断
      case i: Array[String] => "Array[String]" + i //泛型可以判断
      case a => "else:" + a
    }

    println(describeType(1))
    println(describeType(List[Int](1, 2)))
    println(describeType(Array[Int](1, 2)))

    //3.匹配数组
    for (arr <- List(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(2, 3, 7, 10), Array("hello", 20, 30))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => "Array:" + x + "," + y //匹配两元素数组
        case Array(0, _*) => "以0开头数组"
        case Array(x, 1, z) => "中间为一的三元素数组"
        case _ => "else"
      }
      println(result)
    }

    println("================")
    //4.匹配列表
    //方式一
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88)
    )) {
      val result = list match {
        case List(0) => "0"
        case List(x, y) => s"List($x,$y)"
        case List(0, _*) => "List(0,...)"
        case List(a) => "List(a)" + a
        case _ => "else"
      }
      println(result)
    }

    println("=================")

    //方式二
    val list1 = List(1, 2, 5, 7, 24)
    val list = List(1)
    list match {
      case first :: second :: rest => println(s"first: $first , second:$second , rest:$rest")
      case _ => println("else")
    }

    println("=================")
    //5.匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 57),
      ("hello", true, 57)
    )) {
      val result = tuple match {
        case (a, b) => a + "," + b
        case (0, _) => "(0,_)"
        case (a, 1, _) => "(a,1,_)" + a
        case _ => "else"
      }
      println(result)
    }
  }

}
