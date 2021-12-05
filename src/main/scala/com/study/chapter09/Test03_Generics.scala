package com.study.chapter09

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    //1.协变和你别
    val child: Parent = new Child
    val childList: MyCollection[Parent] = new MyCollection[Parent]
    //    val childList1: MyCollection[Parent] = new MyCollection[Child]
    val childList2: MyCollection[Child] = new MyCollection[Parent]

    //2.上下限
    def test[A <: Child](a: A) {
      println(a.getClass.getName)
    }
//    test[Parent](new Child)
    test(new SubChild)
  }

}

//定义继承关系
class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

//定义带泛型的集合类型
//class MyCollection[E] {}
//class MyCollection[+E] {}
class MyCollection[-E] {}

