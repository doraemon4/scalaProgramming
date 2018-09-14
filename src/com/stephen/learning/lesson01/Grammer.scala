package com.stephen.learning.lesson01
import scala.math.sqrt;

/**
  * @Auther: jack
  * @Date: 2018/9/12 22:40
  * @Description: 常量的基本定义
  * 1.基本数据类型:Byte Int Short Long Double Float Boolean
  * 2.没有++、--，只有+和-
  */
object Grammer {
  def main(args: Array[String]): Unit = {
    //可变的常量
    var a=10
    a+=1

    //不可变的常量
    val b=10
    println(a)
    println(b)

    //求绝对值
    println(sqrt(a))

    //自带的一些方法
    var c="hello"
    println(c.toUpperCase())

    //定义数组
    var array=Array(1,2,3,"5","hello");
    println(array.size)
    println("第5个值为:"+array.apply(4))

    //定义字符串
    val str="hello world"
    println(str.distinct)
    println(str.apply(6)+"-------"+str.charAt(6))
    printf("hello world,%s\n","jack")

    //直接调用Java代码
    System.out.println("this is a scala app!")
  }
}
