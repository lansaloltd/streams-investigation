package com.lansalo.benchmarck

import java.util.concurrent.TimeUnit

import com.lansalo.{Scopes, Target}
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

  /*@Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testOriginalExampleWithList(state: Scopes.BenchmarkState): Unit = Target.originalExampleWithList

  @Benchmark
  @BenchmarkMode(Array(Mode.Throughput))
  @Fork(value = 1)
  def testOriginalExampleWithStream(state: Scopes.BenchmarkState): Unit = Target.originalExampleWithStream*/

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithStream1(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream1(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList1(state: Scopes.BenchmarkState): Unit = Target.exampleWithList1(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithStream2(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream2(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList2(state: Scopes.BenchmarkState): Unit = Target.exampleWithList2(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithStream3(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream3(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList3(state: Scopes.BenchmarkState): Unit = Target.exampleWithList3(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithStream4(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream4(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList4(state: Scopes.BenchmarkState): Unit = Target.exampleWithList4(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithStream5(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream5(state.sampleString)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @Fork(value = 1)
  def testExampleWithList5(state: Scopes.BenchmarkState): Unit = Target.exampleWithList5(state.sampleString)


}
