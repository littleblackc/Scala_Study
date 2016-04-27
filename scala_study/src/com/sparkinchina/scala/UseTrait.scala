package com.sparkinchina.scala

class UseTrait {
  
}

trait Logger{
  def log(msg : String){
    println("log:" + msg)
  }
}

class ConcreteLogger extends Logger{
  def concreteLog{
    log("It's me")
  }
}
////override parent trait method,should must use override
object UseTrait extends App{
  val logger = new ConcreteLogger
  logger.concreteLog
  
  val acc = new MyAccount
  acc.save
}

trait Flogger{
  def log(msg: String){
    println("Log content is : "+ msg)
  }
}

trait MessageLogger extends Flogger{
  override def log(msg: String){
    println("Log Message is : "+ msg)
  }
}

abstract class Account{
  def save
}

class MyAccount extends Account with Flogger{
  def save{
    log("10000")
  }
}