package com.lansalo

object Target {

  def originalExampleWithList: List[Int] = {
    List(1,2,3,4).map(_ + 10).filter(_%2== 0).map(_ * 3)
  }

  def originalExampleWithStream: Stream[Int] = {
    Stream(1,2,3,4).map(_ * 3).map(_ + 10).filter(_%2== 0).map(_ * 3)
  }

  def exampleWithList1(input: String) = {
    List.fill(500)(input).map(_ * 100000 + "test").zipWithIndex.filter(_._2 % 2 == 0).map(_._1.contains("test"))
  }

  def exampleWithStream1(input: String) = {
    Stream.fill(500)(input).map(_ * 100000 + "test").zipWithIndex.filter(_._2 % 2 == 0).map(_._1.contains("test")).toList
  }

  def exampleWithList2(input: String) = {
    List.fill(500)(input).zipWithIndex.filter(_._2 % 2 == 0).map(_._1 * 1000 + "test").count(_.contains("test"))
  }

  def exampleWithStream2(input: String): Int = {
    Stream.fill(500)(input).zipWithIndex.filter(_._2 % 2 == 0).map(_._1 * 100 + "test").count(_.contains("test"))
  }

  def exampleWithList3(input: String) = {
    List.fill(500)(input)
      .map(_ * 10000)
      .zipWithIndex
      .map(t => (t._1 + "test", t._2))
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithStream3(input: String): Int = {
    Stream.fill(500)(input)
      .map(_ * 10000)
      .zipWithIndex
      .map(t => (t._1 + "test", t._2))
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithList4(input: String) = {
    List.fill(500)(input).map(_ * 10000)
      .map(_ + " test")
      .map(_ + " test")
      .zipWithIndex
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithStream4(input: String): Int = {
    Stream.fill(500)(input).map(_ * 10000)
      .map(_ + " test")
      .map(_ + " test")
      .zipWithIndex
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithList5(input: String) = {
    List.fill(1000000)(input)
      .map(_ + " test")
      .map(_ + " test")
      .map(_ + " test")
      .zipWithIndex
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithStream5(input: String): Int = {
    Stream.fill(1000000)(input)
      .map(_ + " test")
      .map(_ + " test")
      .map(_ + " test")
      .zipWithIndex
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }



}
