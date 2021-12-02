package com.study.chapter07

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //1.过滤
    //选取偶数
    list.filter(elem => elem % 2 == 0)
    println(list.filter(_ % 2 == 0))
    //选取奇数
    println(list.filter(_ % 2 == 1))

    //2.map
    //把集合每个数乘2
    println(list.map(_ * 2))

    //3.扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    //4.扁平映射
    //将一组字符串进行分词，保存成单词的列表
    val strings = List("hello world", "hello scala", "hello java", "we study")
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    val flatList3 = splitList.flatten
    println(flatList3)

    val flapMapList = strings.flatMap(_.split(" "))
    println(flapMapList)

    //5.分组操作 groupBy
    //分成奇数偶数两组
    println(list.groupBy(_ % 2))
    println(list.groupBy(data => {
      if (data % 2 == 0) "偶数" else "奇数"
    }))

    //给定一组word，按照分词首字母分组
    println(flapMapList.groupBy(_.charAt(0)))


  }

}
