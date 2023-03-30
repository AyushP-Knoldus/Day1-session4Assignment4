package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ArithmeticOperationsTest extends AnyFunSuite {
  val arithmeticOperationsObject = new ArithmeticOperations
  test("arithmeticoperation should return sum of numbers") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperationsObject.arithmeticOperationsOnList(list,"Addition")
    assert(result == 10)
  }
  test("arithmeticoperation method should return subtraction of numbers") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperationsObject.arithmeticOperationsOnList(list, "Subtraction")
    assert(result == -8)
  }
  test("arithmeticoperation method should return multiplication of numbers") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = arithmeticOperationsObject.arithmeticOperationsOnList(list, "Multiplication")
    assert(result == 24)
  }
  test("arithmeticoperation method should throw exception if empty list is passed") {
    val list = List()
    assertThrows[IllegalStateException](arithmeticOperationsObject.arithmeticOperationsOnList(list, "Multiplication"))
  }
  test("arithmeticoperation method should throw exception if arithmetic operation is invaild") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    assertThrows[NoSuchMethodException](arithmeticOperationsObject.arithmeticOperationsOnList(list, "Division"))
  }
}
