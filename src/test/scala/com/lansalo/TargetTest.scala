package com.lansalo

import org.scalatest.FunSuite

class TargetTest extends FunSuite {

  import Target._

  val sampleInput = "###############"

  test("that exampleWithList2 if equivalent to exampleWithStream2") {
    exampleWithList2(sampleInput) == exampleWithStream2(sampleInput)
  }

  test("that exampleWithList3 if equivalent to exampleWithStream3") {
    exampleWithList3(sampleInput) == exampleWithStream3(sampleInput)
  }

  test("that exampleWithList4 if equivalent to exampleWithStream4") {
    exampleWithList4(sampleInput) == exampleWithStream4(sampleInput)
  }

  test("that exampleWithList5 if equivalent to exampleWithStream5") {
    exampleWithList5(sampleInput) == exampleWithStream5(sampleInput)
  }

}
