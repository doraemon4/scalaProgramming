package com.stephen.learning.lesson02

import scala.collection.immutable.SortedMap

/**
  * @Auther: jack
  * @Date: 2018/9/22 11:57
  * @Description: map与Tuple(一个小括号的集合）
  * 1.注意不可变和可变的map
  * 2.map的遍历
  * 3.有顺序的map
  * 4.tuple的使用
  */
object Grammer07 {
  def main(args: Array[String]): Unit = {
    //不可变的map(改变原有元素报错,但是可以增加，删除元素，此处会生成一个全新的map)
    var map = Map("jack" -> 23, "peter" -> 24, "alice" -> 30)
    println(map)
    map += "jack" -> 18
    map = map + ("bob" -> 33)
    //这样会报错：map("jack")=20
    map -= "alice"
    println(map)

    //可变的map
    val ages = scala.collection.mutable.Map("jack" -> 20, "peter" -> 34)
    println("修改前的：" + ages)
    ages("jack") = 35
    println("修改后的：" + ages)
    ages.put("jack", 55)
    println(ages)

    //也可以用括号
    val person = Map(("name", "jack"), ("age", 18), "sex" -> "male")
    println(person)

    //创建一个空的map(必须是实现类)
    val nullMap = new scala.collection.mutable.HashMap[String, Any]
    println("是否存在：" + nullMap.contains("name"))
    println("是否存在：" + nullMap.getOrElse("name", 0))
    nullMap("name") = 18
    //移除某个元素(等效remove）
    nullMap -= "age"
    //添加多个元素(等效put)
    nullMap += ("gender" -> "male", "age" -> 18)
    println("操作后的结果：" + nullMap)
    println("是否存在：" + nullMap.contains("name"))
    println("是否存在：" + nullMap.getOrElse("name", 0))

    //遍历map使用entrySet
    for ((k, v) <- ages)
      println("key:" + k + ",value:" + v)

    for (k <- ages.keySet)
      println("key:" + k + ",value:" + ages(k))

    //反转map
    val ages2 = for ((k, v) <- ages) yield (v, k)
    println(ages2)

    //SortedMap自动按照key排序
    val sortedMap = SortedMap(("jack", "male"), ("bob", "male"), ("alice", "female"))
    println("排序的结果：" + sortedMap)

    //LinkedHashMap按照插入的顺序
    val linkedMap = scala.collection.mutable.LinkedHashMap[String, String]()
    linkedMap("jack") = "male"
    linkedMap("bob") = "male"
    linkedMap("alice") = "female"
    println("插入的顺序：" + linkedMap)

    var set = Set(1, 2, 3, 4, 5, 5)
    set = set + 8
    println(set)

    //遍历tuple的元素(相当于Java中的实体bean）
    val tuple = ("jack", 18, "male")
    println("tuple的属性：" + tuple._1 + " " + tuple._2 + " " + tuple._3)

    val names = Array("Jack", "Alice", "Bob")
    val num = Array(20, 18, 24)
    val people = names.zip(num)
    for ((name,age) <- people)
      println("name:"+name+" age:"+age)
  }
}
