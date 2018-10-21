package com.lansalo

import org.scalatest.FunSuite

class TargetTest extends FunSuite {

  import Target._

  val sampleInput = "###############"

  /*
  this might throw a java.lang.OutOfMemoryError: Java heap space (if the heap size is not big enough)
  test("that exampleWithList1 if equivalent to exampleWithStream1") {
    exampleWithList1(sampleInput) == exampleWithStream1(sampleInput)
  }*/

  test("that exampleWithList2 if equivalent to exampleWithStream2") {
    exampleWithList2 == exampleWithStream2
  }

  test("that exampleWithList3 if equivalent to exampleWithStream3") {
    exampleWithList3 == exampleWithStream3
  }


}
