package com.stephen.learning.lesson01

import java.io.{File, FileNotFoundException}

import scala.io.Source

/**
  * @Auther: jack
  * @Date: 2018/9/16 12:36
  * @Description: 文件读写与异常处理
  * 1.注意lazy的使用(开始的时候不计算，不加载），使用的时候计算，即使不存在也不会立即报错
  */
object Grammer04 {
  def readFile(): String = {
    lazy val text = Source.fromFile(new File("/Users/jack/IdeaProjects/scalaProgramming/files/test.txt")).mkString
    text
  }

  def main(args: Array[String]): Unit = {
    //定义函数
    def lines = Source.fromFile(new File("/Users/jack/IdeaProjects/scalaProgramming/files/test1.txt")).mkString

    //异常处理
    try{
      lines
    }catch{
      case _:FileNotFoundException=>println("文件没找到！！！！！")
    }finally {
      println("文件存不存在都要执行")
    }

    println(readFile)
  }
}
