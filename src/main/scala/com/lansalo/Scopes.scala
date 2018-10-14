package com.lansalo

import org.openjdk.jmh.annotations._

object Scopes {

  @State(Scope.Benchmark)
  class BenchmarkState {

    val sampleString = "Someone must have slandered Josef K., for one morning, without having done anything truly wrong, he was arrested."

  }

}
