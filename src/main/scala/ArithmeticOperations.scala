package com.knoldus

import scala.annotation.tailrec

class ArithmeticOperations {
  //Method which takes list of option of int and arithmetic operations as input and returns the result.
  def arithmeticOperationsOnList(list: List[Option[Int]], arithmeticOperation: String): Int = {
    if (list.isEmpty) {
      throw new IllegalStateException()
    }
    else {
      val listAfterRemovingOption = for {
        Some(number) <- list
      } yield number
      arithmeticOperation match {
        case "Addition" => sumOfNumbers(listAfterRemovingOption)
        case "Subtraction" => subtractionOfNumbers(listAfterRemovingOption)
        case "Multiplication" => multiplicationOfNumbers(listAfterRemovingOption)
        case _ => throw new NoSuchMethodException()
      }
    }
  }

  //Method which calculates sum of numbers of list by calling tail recursive method sumOfNumberHelper.
  private def sumOfNumbers(number: List[Int]): Int = {
    @tailrec
    def sumOfNumbersHelper(number: List[Int], sum: Int): Int = {
      number match {
        case ::(head, next) => sumOfNumbersHelper(next, sum + head)
        case Nil => sum
      }
    }

    sumOfNumbersHelper(number, 0)
  }

  //Method which calculates subtraction of element of list by calling tail recursive method substractionOfNumbershelper
  private def subtractionOfNumbers(number: List[Int]): Int = {
    @tailrec
    def subtractionOfNumbersHelper(number: List[Int], sum: Int): Int = {
      number match {
        case ::(head, next) => subtractionOfNumbersHelper(next, sum - head)
        case Nil => sum
      }
    }

    /*We have purposely added subtraction result with initial value as twice of 1st element to store the first element
       without in the first call*/
    val subtractionResult = number.headOption.getOrElse(0) * 2
    subtractionOfNumbersHelper(number, subtractionResult)
  }

  //Method returns product of elements of list by calling tail recursive method multiplicationOfNumbershelper
  private def multiplicationOfNumbers(number: List[Int]): Int = {
    @tailrec
    def multiplicationOfNumbersHelper(number: List[Int], productResult: Int): Int = {
      number match {
        case ::(head, next) => multiplicationOfNumbersHelper(next, productResult * head)
        case Nil => productResult
      }
    }

    multiplicationOfNumbersHelper(number, 1)
  }

}
