package com.lansalo.benchmarck

import com.lansalo.Target
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.results.format.ResultFormatType
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.{Options, OptionsBuilder}

object BenchmarkRunner_FlightRecorder {
  // run sbt clean jmh:compile from terminal first.
  def main(args: Array[String]): Unit = {
    val opt: Options = new OptionsBuilder().include(classOf[FlightRecorderDump].getSimpleName)
      .resultFormat(ResultFormatType.TEXT).build
    new Runner(opt).run
  }
}

@Warmup(iterations = 10)
@Measurement(iterations = 15)
@State(Scope.Benchmark)
private class FlightRecorderDump {

  /*@Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
      "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
      "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list1.jfr"))
  def testExampleWithList1(): Unit = Target.exampleWithList1

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream1.jfr"))
  def testExampleWithStream1(): Unit = Target.exampleWithStream1
*/
  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list2.jfr"))
  def testExampleWithList2(): Unit = Target.exampleWithList2

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream2.jfr"))
  def testExampleWithStream2(): Unit = Target.exampleWithStream2

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list3.jfr"))
  def testExampleWithList3(): Unit = Target.exampleWithList3

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream3.jfr"))
  def testExampleWithStream3(): Unit = Target.exampleWithStream3

}


