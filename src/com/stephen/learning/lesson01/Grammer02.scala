package com.stephen.learning.lesson01

/**
  * @Auther: jack
  * @Date: 2018/9/12 23:26
  * @Description:条件控制与循环
  * 1.注意循环中until和to的区别(until不包含上限);
  * 2.注意循环区间的使用;
  * 3.注意循环守卫和推导;
  * 4.跳出循环的方法：使用boolean,使用return,使用Breaks类的break
  */
object Grammer02 {
  def main(args: Array[String]): Unit = {
    val a = 11
    //条件直接作为返回值
    println(if (a > 1) a else 0)

    println(if (a < 90) "you are loser" else a)

    //也可以用值接收(加{}换行)
    val b = if (a > 20) {
      "you are adult"
    }
    else if (a > 10 && a < 20) {
      "you are juvenile"
    }
    else
      "you are childen"
    println(b)

    //for循环(scala中的写法和Java的不一样)
    //打印九九乘法表
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        printf("%d*%d=" + i * j + " ", i, j)
      }
      println()
    }

    //多个区间
    for (i <- 1 to 9; j <- 1 to i) {
      printf("%d*%d=" + i * j + " ", i, j)
      if (i == j)
        println()
    }

    //if守卫(循环后面跟着条件,可以多条)
    for (i <- 1 to 20; if i % 2 == 0; if i >= 10)
      print(i + " ")
    println()

    //也可以用大括号
    val num=for(i<-List(1,2,3,4,5,6) if i%2==1)yield i
    println(num)

    //遍历字符串
    for (i <- "123456")
      print(i + " ")

    //遍历数组
    for (i <- Array(1, 2, 3, 4, 5))
      print(i + " ")
    println()

    for (i <- List(10, 9, 8, 7, 6))
      print(i + " ")
  }
}
