package com.study.chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //1.多精度数据混合计算时，系统首先自动将所有数据转换成精度大的类型然后进行运算
    val a1: Byte = 10
    val b1: Long = 2353
    val result1: Long = a1 + b1
    val result2: Int = (a1 + b1.toInt)

    //2.把精度大的类型赋给精度小的类型时，会报错，反正就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte

    //3.(byte,short)和char之间不会自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
    //val c3 : Byte = b3 error
    val c3: Int = b3
    println(c3)

    //4.byte,short,char三者可以计算，在计算时首先转换为int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    //val result4 :Short = a4 + b4 error
    val result: Int = a4 + b4 + c4

    //强制类型转换

    //1.数据由高精度转换为低精度，需要强转
    val n1: Int = 2.5.toInt
    println(n1) //取整数部分,截断 2

    //2.强转的符号只对最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = (2.6 + 3.7).toInt //6
    val n3: Int = 2.6.toInt + 3.7.toInt //7

    //3.数值类型和String类型
    //数值转String
    val n: Int = 27
    val s: String = n + ""
    println(s)

    //String转数值
    val a: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toInt  //运行报错


  }

}
