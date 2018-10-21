package com.lansalo.benchmarck

import java.util.concurrent.TimeUnit

import com.lansalo.Target
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.results.format.ResultFormatType
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.{Options, OptionsBuilder}

object BenchmarkRunner_ThroughputBenchmark {
  // run sbt clean jmh:compile from terminal first.
  def main(args: Array[String]): Unit = {
    val opt: Options = new OptionsBuilder().include(classOf[ThroughputBenchmark].getSimpleName)
      .resultFormat(ResultFormatType.TEXT).build
    new Runner(opt).run
  }
}

@OutputTimeUnit(TimeUnit.SECONDS)
@Warmup(iterations = 15)
@Measurement(iterations = 15)
@State(Scope.Benchmark)
private class ThroughputBenchmark {

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testOriginalExampleWithList(): Unit = Target.originalExampleWithList

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testOriginalExampleWithStream(): Unit = Target.originalExampleWithStream

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testExampleWithStream1(): Unit = Target.exampleWithStream1

  /*@Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList1(): Unit = Target.exampleWithList1*/

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testExampleWithStream2(): Unit = Target.exampleWithStream2

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testExampleWithList2(): Unit = Target.exampleWithList2

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testExampleWithStream3(): Unit = Target.exampleWithStream3

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testExampleWithList3(): Unit = Target.exampleWithList3

}

