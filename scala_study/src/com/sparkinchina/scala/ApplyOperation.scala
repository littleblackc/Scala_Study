package com.sparkinchina.scala

class ApplyOperation {
  
}



class ApplyTest1{
  def apply() = println("I am into spart so much !!!")
  def hyveATry: Unit = {
    println("have a try on apply")
  }
}

object ApplyTest1{
  def apply() = {
    println("I am into Scala so much")
    new ApplyTest1
  }
}
 
object ApplyOperation extends App{
  val a = ApplyTest1()// used for object
  a.hyveATry
  a()// used for class
  
}