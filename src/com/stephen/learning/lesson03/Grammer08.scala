package com.stephen.learning.lesson03

/**
  * @Auther: jack
  * @Date: 2018/9/24 16:18
  * @Description:
  */
object Grammer08 {
  def main(args: Array[String]): Unit = {
    var person = new Person("jack", "male", 20)
    person.sayHello()
    println(person.getName)
    person.sayHello("china")

    println("-------------------------华丽的分割线---------------------")
    person.address = "America" //
    person.sayHello()
    person.address_=("Japan") //待用setter方法
    person.sayHello()

    println("-------------------------华丽的分割线---------------------")
    println(person.newName)
    person.newName_=("alice")
    println(person.newName)

    println("-------------------------华丽的分割线---------------------")
    person = new Person("peter", "male", 28, "India")
    person.sayHello()

    println("-------------------------华丽的分割线---------------------")
    person.createStudent("jack")
    person.createStudent("peter")
    person.createStudent("alice")
    person.createStudent("jenny")
    println(person.students)

  }
}
