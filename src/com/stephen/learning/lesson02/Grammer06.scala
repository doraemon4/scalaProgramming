package com.stephen.learning.lesson02

/**
  * @Auther: jack
  * @Date: 2018/9/16 16:48
  * @Description: 数组的一些基本操作(Array包下的操作)
  * 1.创建区间数组
  * 2.合并
  * 3.创建多维数组
  */
object Grammer06 {
  def main(args: Array[String]): Unit = {
    val array = Array(7, 12, 4, 32, 5, 18)
    println("求和：" + array.sum)
    println("求最大值：" + array.max)
    println("求最小值：" + array.min)

    //使用Array的方法
    val array2 = Array.range(10, 20, 2)
    println(array2.toList)

    var array3 = Array.range(10, 20, 3)
    println(array3.toList)

    //合并数组
    var array4 = Array.concat(array2, array3)
    println(array4.toList)

    //创建二维数组
    val array5 = Array.ofDim[Int](2, 3)
    for (i <- 0 until 2) {
      for (j <- 0 until 3) {
        array5(i)(j) = j
        print(" " + array5(i)(j))
      }
      println()
    }

    //过滤出偶数再乘以2
    val array6=Array(1,2,3,4,5).filter(_ % 2 == 0).map(_*2)
    println(array6.toList)
  }

}
