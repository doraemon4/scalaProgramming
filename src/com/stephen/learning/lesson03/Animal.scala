package com.stephen.learning.lesson03

/**
  * @Auther: jack
  * @Date: 2018/9/30 15:07
  * @Description: 伴生类和伴生对象
  * 1.伴生对象和伴生类可以互相访问其私有成员
  * 2.伴生对象的apply方法的使用
  */
class Animal(name:String,gender:String) {

  def getInformation(): Unit ={
    //伴生类可以直接使用伴生对象的属性
    println(Animal.name)
    println("the animal's name is "+this.name+", gender is "+this.gender)
  }
}
object Animal{
  private val name="Monkey"

  //实现apply方法，实现构造伴生对象
  def apply(name: String, gender: String): Animal = new Animal(name, gender)
  //此方法只会执行一次
  println("i am Animal constructor")

  def main(args: Array[String]): Unit = {
    println(Animal.name)

    //显式的创建
    val animal=new Animal("Tiger","Male");
    animal.getInformation()

    //隐式的创建(和array类似)
    Animal.apply("Elephant","Female").getInformation()
    Animal("Elephant","Female").getInformation()
  }
}