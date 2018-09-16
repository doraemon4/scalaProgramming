package com.stephen.learning.lesson01

/**
  * @Auther: jack
  * @Date: 2018/9/15 00:54
  * @Description: 函数
  * 1.注意函数后面要指定返回值，必须在函数后面定义返回值类型，不然默认没有返回值
  * 2.含有默认参数值的函数声明
  */
object Grammer03 {
  def sayHello(name: String, age: Int): Unit = {
    if (age > 18)
      printf("hello,%s,you are adult\n", name)
    else
      printf("hello,%s,you are children\n", name)
  }

  def sum(n: Int): Int = {
    var sum = 0
    for (i <- 1 to n)
      sum += i
    sum
  }

  //斐波那契数列
  def fibona(n: Int): Int = {
    if(n<=2) 1
    else
      fibona(n-1)+fibona(n-2)
  }

  //带有默认值的函数
  def sayHello(firstName:String,lastName:String="jack"): Unit ={
    printf("hello,%s,nice to meet you!",lastName+" "+firstName)
    println()
  }

  //可变参数
  def sum(nums:Int*): Int ={
    var sum=0;
    for(num<-nums)
      sum+=num;
    sum;
  }

  def main(args: Array[String]): Unit = {
    sayHello("jack", 16)
    sayHello("peter", 20)

    println(sum(10))
    println(fibona(10))

    //不使用函数默认值
    sayHello("zhang","stephen")
    //使用参数默认值
    sayHello("zhang")
    //调整参数的位置,指定参数名
    sayHello(lastName = "alice",firstName="zhang")

    //变长参数函数调用
    println(sum(1,2,3,4,5))
    println(sum(1 to 5:_*))   //已有序列变成可变长参数
    println(sum(List(1,2,3,4):_*))  //已有序列变成可变长参数
    println(sum(1,2,3,4))
  }
}
