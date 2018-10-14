package com.lansalo.benchmarck

import com.lansalo.{Scopes, Target}
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

@Warmup(iterations = 5)
@Measurement(iterations = 10)
@State(Scope.Benchmark)
private class FlightRecorderDump {

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
      "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
      "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list1.jfr"))
  def testExampleWithList1(state: Scopes.BenchmarkState): Unit = Target.exampleWithList1(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream1.jfr"))
  def testExampleWithStream1(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream1(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list2.jfr"))
  def testExampleWithList2(state: Scopes.BenchmarkState): Unit = Target.exampleWithList2(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream2.jfr"))
  def testExampleWithStream2(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream2(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list3.jfr"))
  def testExampleWithList3(state: Scopes.BenchmarkState): Unit = Target.exampleWithList3(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream3.jfr"))
  def testExampleWithStream3(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream3(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list4.jfr"))
  def testExampleWithList4(state: Scopes.BenchmarkState): Unit = Target.exampleWithList4(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream4.jfr"))
  def testExampleWithStream4(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream4(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/list5.jfr"))
  def testExampleWithList5(state: Scopes.BenchmarkState): Unit = Target.exampleWithList5(state.sampleString)

  @Benchmark
  @Fork(value = 1, jvmArgsAppend = Array("-XX:+UnlockCommercialFeatures",
    "-XX:+FlightRecorder", "-XX:+UnlockDiagnosticVMOptions", "-XX:+DebugNonSafepoints",
    "-XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,dumponexitpath=/tmp/stream5.jfr"))
  def testExampleWithStream5(state: Scopes.BenchmarkState): Unit = Target.exampleWithStream5(state.sampleString)

}


