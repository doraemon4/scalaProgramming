package com.stephen.learning.lesson03

import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

/**
  * @Auther: jack
  * @Date: 2018/9/24 15:57
  * @Description: scala中的类
  * 1.定义不带private的var field,会定义成private 字段，并提供public的setter和getter方法；
  * 2.如果使用private定义属性，则生成的getter和setter也是private的；
  * 3.定义val的变量，只会生成getter方法;
  * 4.如果不希望生成setter和getter方法，直接声明字段为private[this];
  * 5.getter和setter对应的是：eg:name和name_=
  * 6.当然自己也可以对自带的setter和getter方法进行重写
  * 7.@BeanProperty使Scala生成Java风格的setter和getter,不能是private声明的属性
  */
class Person(name: String, gender: String, age: Int) {
  @BeanProperty
  var address: String = ""

  def sayHello(): Unit = {
    println("you are from " + address)
    println("hello " + name + ", your gender is " + this.gender + " , your age is " + age)
  }

  //自定义getter方法
  def newName = "your name is " + name

  def newName_=(name: String): Unit = {
    println("your new name is " + name)
  }

  def sayHello(address: String): Unit = {
    //this.address=address
    this.address_=(address)
    println("hello " + name + ", your gender is " + this.gender + " , your age is " + age + " , your address is " + address)
  }

  //定义的时候没有带括号，调用的时候也不要带括号
  def getName: String = {
    return this.name
  }

  //辅助构造函数(可以有默认值）
  def this(name: String, gender: String, age: Int, address: String = "china") {
    this(name, gender, age)
    this.address = address
  }

  //内部类的使用
  class Student(name: String) {}

  var students = ArrayBuffer[Student]()

  def createStudent(name: String) = {
    val student = new Student(name)
    students.append(student)
    student
  }
}
