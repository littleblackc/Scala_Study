package com.sparkinchina.scala

class AbstractClass {
  
}


abstract class People{
  def speak
  
  val name: String
  var age : Int
}

class Worker extends People{
  def speak{
    println("Hello,Everyone!")
  }
  val name = "Rocky"
  var age = 27
}

object AbstractClass extends App{
   val worker = new Worker
   worker.speak
   println(worker.name + ":" + worker.age)
}