package com.stephen.learning.lesson02

import scala.collection.mutable.ArrayBuffer

/**
  * @Auther: jack
  * @Date: 2018/9/16 13:51
  * @Description: 数组的一些操作
  * 1. Array创建的方式
  * 2. 注意Array与ArrayBuffer的区别：一个是长度不变的，一个是长度可变
  */
object Grammer05 {
  def main(args: Array[String]): Unit = {
    //创建方式1
    val array = new Array[Int](10)
    array(0) = 10
    println(array.apply(0))

    //寻找元素的下标
    println(array.indexOf(10))
    //转化为可变数组
    println(array.toBuffer)

    //创建方式2
    val array2 = Array("123", "456")
    println(array2.length)
    println(array2(1))


    val arrayBuffer = ArrayBuffer[Int](10)
    arrayBuffer(0) = 1
    //添加元素，类似于Java集合的add
    arrayBuffer += (2, 3, 4, 5)
    arrayBuffer.append(6,7,8,9)
    //增加其他的数组，类似于Java集合的addAll
    arrayBuffer ++= Array(6, 7, 8, 9, 10)
    arrayBuffer.appendAll(Array(11, 12, 13, 14, 15))
    //截断尾部
    arrayBuffer.trimEnd(5)
    //指定位置插入
    arrayBuffer.insert(5,1,3,5,7)
    arrayBuffer.insertAll(5,Array(7,8,9,10))

    println(arrayBuffer.toList)

    //转化为不可变数组
    println(arrayBuffer.toArray)

    //数组的遍历
    var array3=Array(1,3,5,7,9)
    //每隔两个遍历
    for(i<- 0 until (array3.length,2))
      println(array3(i))
    //遍历下标为基数的
    for(x<- array3 if array3.indexOf(x)% 2==1)
      println(x)
    //倒序遍历
    for(i<-(0 until array3.length).reverse)
      println(array3(i))

    //reverse反转集合
    println(Array("123","456").reverse.toList)
  }
}



