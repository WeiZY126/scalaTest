package com.study.chapter09

object Test02_Implicit {
  def main(args: Array[String]): Unit = {


    //1.隐式函数
    implicit def convert(num: Int) = new MyRichInt(num)

    println(12.myMax(15))
    println("=======================")

    //2.隐式类
    implicit class MyRichInt2(val self: Int) {
      //自定义比较大小方法
      def myMax2(n: Int): Int = if (n < self) self else n

      def myMin2(n: Int): Int = if (n > self) self else n
    }
    println(12.myMax2(15))

    //3.隐式参数
    implicit val alice: String = "alice"
    implicit val num: Int = 18
//    implicit val bob: String = "bob"  //报错

    def sayHello(implicit name: String = "bob") = println("hello," + name)
    sayHello

    //4.简便写法
    def hiAge()={println("hi"+implicitly[Int])}
    hiAge()
  }

}

//自定义类
class MyRichInt(val self: Int) {
  //自定义比较大小方法
  def myMax(n: Int): Int = if (n < self) self else n

  def myMin(n: Int): Int = if (n > self) self else n
}
