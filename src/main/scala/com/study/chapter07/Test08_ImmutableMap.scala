package com.study.chapter07

object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //1.创建Map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    //2.遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))

    println("================================")

    //3.取Map中所有的key或者value
    for (key <- map1.keys) {
      println(s"$key--->${map1.get(key)}")
    }

    //4.访问某一个key的value
    val maybeInt: Option[Int] = map1.get("a")
    println(maybeInt.get) //不安全
    println(map1.getOrElse("cc","bb"))  //如果没有参数1，则返回参数2

    println(map1("a"))
    println(map1("cc"))

  }

}
