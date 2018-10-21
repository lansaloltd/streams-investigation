package com.lansalo

object Target {

  val listInput: List[Int] = (1 to 500).toList
  val streamInput: Stream[Int] = (1 to 500).toStream

  final case class Wrapper(index: Int, text: String)

  def originalExampleWithList: List[Int] = {
    List(1,2,3,4).map(_ + 10).filter(_%2== 0).map(_ * 3)
  }

  def originalExampleWithStream: List[Int] = {
    Stream(1,2,3,4).map(_ * 3).map(_ + 10).filter(_%2== 0).map(_ * 3).toList
  }

  def exampleWithList1: List[Boolean] = {
    List.fill(600)("Some random sample text.")
      .map(_ * 500000 + "test")
      .zipWithIndex.filter(_._2 % 2 == 0)
      .map(_._1.contains("test"))
  }

  def exampleWithStream1: List[Boolean]= {
    Stream.fill(600)("Some random sample text.")
      .map(_ * 500000 + "test")
      .zipWithIndex.filter(_._2 % 2 == 0)
      .map(_._1.contains("test")).toList
  }

  def exampleWithList2: Int = {
    List.fill(600)("Some random sample text.")
      .zipWithIndex
      .map(t => (t._1 * 100 + "test", t._2))
      .map(t => (t._1 * 5 + "test", t._2))
      .map(t => (t._1 * 5 + "test", t._2))
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithStream2: Int = {
    Stream.fill(600)("Some random sample text.")
      .zipWithIndex
      .map(t => (t._1 * 100 + "test", t._2))
      .map(t => (t._1 * 5 + "test", t._2))
      .map(t => (t._1 * 5 + "test", t._2))
      .filter(_._2 % 2 == 0)
      .count(_._1.contains("test"))
  }

  def exampleWithList3: Int = {
    listInput
      .map(Wrapper(_, "Some simple text"))
      .map(_.copy(text = "some simple text" * 500))
      .map(w => w.copy(text = w.text + "look for me!"))
      .filter(_.index % 2 == 0)
      .map(_.text.toLowerCase)
      .count(_.contains("look for me!"))
  }

  def exampleWithStream3: Int = {
    streamInput
      .map(Wrapper(_, "Some simple text"))
      .map(_.copy(text = "some simple text" * 500))
      .map(w => w.copy(text = w.text + "look for me!"))
      .filter(_.index % 2 == 0)
      .map(_.text.toLowerCase)
      .count(_.contains("look for me!"))
  }

}
