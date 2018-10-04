package com.stephen.learning.lesson03

/**
  * @Auther: jack
  * @Date: 2018/9/30 16:04
  * @Description: 实现枚举
  */
object Grammer09 {

  object WeekDay extends Enumeration {
    type WeekDay = Value
    val Mon = Value(1, "Monday")
    val Tue = Value(2, "Tuesday")
    val Wed = Value(3, "Wednesday")
    val Thu = Value(4, "Thursday")
    val Fri = Value(5, "Friday")
    val Sat = Value(6, "Saturday")
    val Sun = Value(0, "Sunday")
  }

  def main(args: Array[String]): Unit = {
    for (ele <- WeekDay.values)
      println(ele)

    println(WeekDay(3))
  }
}
