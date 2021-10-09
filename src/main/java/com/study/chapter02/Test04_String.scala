package com.study.chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    //通过+号连接
    val name = "alice"
    val age = 18
    println(age + "岁的" + name + "XXX")

    //*作用用于将一个字符串复制多次拼接
    println(name*3)

    //printf格式化输出
    printf("%d岁的%sXXX\n",age,name)

    //字符串模板(插值字符串)：通过$获取变量值
    println(s"${age}岁的${name}XXX")

    val num: Double = 2.3456
    println(f"the num = ${num}%2.2f") //格式化模板字符串
    println(raw"the num = ${num}%2.2f")

    //三引号模板字符串，保持多行字符串的原格式输出
    println(
      s"""
         |
         |""".stripMargin)
  }

}
