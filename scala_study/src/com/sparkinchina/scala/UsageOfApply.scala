package com.sparkinchina.scala

class UsageOfApply {
  
}

class ApplyTest{
  def apply() = "This apply is in Class"
  def test{
    println("test")
  }
}

object ApplyTest{
  var count = 0
  def apply() = new ApplyTest
  def static{
    println("I am a static method!")
  }
  
  def incr = {
    count = count + 1
  }
}

object UsageOfApply extends App{
  //ApplyTest.static
  
  val a = ApplyTest()
  a.test
  
  
/*  val b = new ApplyTest
  println(b())*/
  //used for class
  
  

  
  /*for(i <- 1 to 10){
    ApplyTest.incr
  }
  println(ApplyTest.count)*/
 
}