package com.stephen.learning.lesson03

/**
  * @Auther: jack
  * @Date: 2018/10/4 11:59
  * @Description: 抽象类的使用和Java类似
  * 1.Scala默认如果定义的var或val字段没有初始化，子类也必须实现赋值，不然就是抽象类
  */

abstract class Person2(name:String){
  var gender:String
  def sayHello:Unit
}

class Woman(name:String) extends Person2(name){
  var gender="female"
  def sayHello=println("hello "+name)
}
object Grammer11 {
  def main(args: Array[String]): Unit = {
    val woman=new Woman("Alice")
    woman.sayHello
  }
}
