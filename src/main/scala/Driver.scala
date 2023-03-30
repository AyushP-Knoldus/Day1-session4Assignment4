package com.knoldus
//The result of multiplication of elements is stored in result and displayed using println
object Driver {
  def main(args: Array[String]): Unit = {
    val list = List(Some(2), Some(4), Some(5), Some(12))
    val arithmeticOperationsObject = new ArithmeticOperations
    val result = arithmeticOperationsObject.arithmeticOperationsOnList(list, "Multiplication")
    println(result)
  }
}