

package com.sparkinchina.scala

class HelloScala {
  
}

object HelloScala{
 
  def hello(name:String): String = {
	"Hello  " + name
} 

def main(args: Array[String]){
    /*println("Hello Scala")
    println(hello("Scala") )
    helloScala
    println(add(1,2))*/
  
    //println(sum2(1)(2))
    //variableParameter("I","LOVE","Spark")
    
  
   /* val max = 1
    val result = if(max > 0) 1 else 0
    println(result)*/
  
 /* var (n,r) = (10,0)
  while(n > 0){
    r = r+n
    n = n-1
  }
  println(r)*/
  
  
/*  for (i <- 1 to 10){
    println(i)
  }
  
  for(i<- 1 until 10){
    println(i)
 
   }*/
  
  for(i<- 1 until 10 if i%2 == 0){
    println(i)
  }
}
  
    
 
  def helloScala(){
    println("Hello Scala,this is rocky")
  }
  def add = (x:Int,y: Int) => x+y
  val sum = (x:Int,y: Int) => x+y
  def sum2(x: Int)(y:Int) = x+y
  def variableParameter(s:String*) = {
    s.foreach(x => println(x))
  }
}
