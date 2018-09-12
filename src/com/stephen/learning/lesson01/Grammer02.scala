package com.stephen.learning.lesson01

/**
  * @Auther: jack
  * @Date: 2018/9/12 23:26
  * @Description:条件控制与循环
  */
object Grammer02 {
  def main(args: Array[String]): Unit = {
    var a=11
    //条件直接作为返回值
    println(if(a>1) a else 0)

    println(if(a<90) "you are loser" else a)

    //也可以用值接收(加{}换行)
    val b=if(a>20){
      "you are adult"
    }
    else if(a>10&&a<20){
      "you are juvenile"
    }
    else
      "you are childen"
    println(b)
  }
}
