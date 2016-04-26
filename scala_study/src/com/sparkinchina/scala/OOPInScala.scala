package com.sparkinchina.scala

class OOPInScala {
  
}

/*class Person{
  var name : String = _
  val age =  27
  private[this] val gender = "male"
}*/

class Person(val name: String,val age: Int){
  println("")
}

class Student(name:String,age: Int,val marjor : String) extends Person(name,age){
  println("this is the subclass of Person,major is : "+ marjor)
}

object OOPInScala{
  def main(args: Array[String]){
    //val p = new Person
     //p.name =  "Rocky"
    
  /*  val p = new Person("Rocky",27)
    println(p.name + ":" + p.age)*/
   // p.gender
    
    /*val s = new Student("Rocky",27,"Computer")
    println(s.name)*/

    var n = Array(1,2,4,101,122,1221,15151,16132)
    /*for(x <- n){
      if filter(x){
         println( x)
      }
    }*/
    
   //println(filter(n))
  }
  def filter(n : Int): Boolean = {
    var ns = n+""
    for(i <- 0 to ns.length()/2 if !ns.substring(i,i+1).equals( ns.substring(ns.length()-i-1, ns.length()-i))){
      return true
    }
    false
   
  }
  
}