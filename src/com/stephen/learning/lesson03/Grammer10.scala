package com.stephen.learning.lesson03

/**
  * @Auther: jack
  * @Date: 2018/10/2 16:59
  * @Description:继承，ooverride可以覆盖方法,也可以覆盖val field
  * 1.如果父类的构造参数声明的val或var，子类的构造函数参数就不需要加，否则会让在字段前加override重写
  */

class Human(name:String){
  val remark="human"
  def sayHello(): Unit ={
    println("hello "+name)
  }
}

class Man(name:String, gender:String="male") extends Human(name:String){
  //重写父类的val字段
  override val remark="man"
  var age=0
  //重新父类的方法
  override def sayHello(): Unit ={
    super.sayHello()
    println("hello "+name+" ,your gender is "+gender+" , your age is "+age)
  }
}
object Grammer10 {
  def main(args: Array[String]): Unit = {
    var man=new Man("jack","male")
    man.age=26
    man.sayHello()

    var human=new Human("peter")
    human.sayHello()
    //判断是否是一个类或子类的实例
    println(human.isInstanceOf[Human])

    human=new Man("bob")
    println(human.asInstanceOf[Man])

    //具体到哪个类
    println(human.getClass==classOf[Man])

  }
}