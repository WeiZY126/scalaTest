package com.study.chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    val fun = (a: Int, b: String, c: Char) => {
      if (a == 0 && b == "" && c == 0)
        true
      else
        false
    }
    println(fun(0, "", 0))
    println(fun(0, "", 3))

    def func(int: Int) = {
      def f1(str: String) = {
        def f2(char: Char) = {
          if (int == 0 && str == "" && char == 0) true else false
        }

        f2 _
      }

      f1 _
    }

    println(func(0)("")(0))
    println(func(0)("")(1))

    def func2(int: Int): String => (Char => Boolean) = { str => char => if (int == 0 && str == "" && char == 0) true else false }

    //柯里化函数
    def fun3(int:Int)(str:String)(char:Char):Boolean={
      if (int == 0 && str == "" && char == 0) true else false
    }
  }
}
