package com.study.chapter08

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list = List(("a", 12), ("b", 35), ("c", 29), ("a", 30))

    //1.map转换：实现value*2
    val newList = list.map(tuple => {
      (tuple._1, tuple._2 * 2)
    })
    println(newList)

    //2.用模式匹配给元祖元素赋值实现功能
    val newList2 = list.map(tuple => {
      tuple match {
        case (a, b) => (a, b * 2)
      }
    })

    //3.省略lambda表达式的写法进行简化
    val newList3 = list.map {
      case (a, b) => (a, b * 2)
    }

    println(newList3)

    //4.偏函数的应用，求绝对值
    //对输入数据分为不同的情形，正、负、0
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val nativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case x if x == 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse nativeAbs orElse zeroAbs) (x)
  }

}
