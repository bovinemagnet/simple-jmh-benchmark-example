# simple-jmh-benchmark-example
A simple example of a gradle project with a jmh benchmark


I was curious about if there was a difference between a `new Data()` and `System.currentTimeMillis()`, so I wrote a quick and dirty JMH benchmark.

It was really so I could set up a project and get started with JMH benchmarks.

to run

```bash
./gradlew jmh
```


You will get some results like this

```text
Benchmark                     Mode  Cnt         Score         Error  Units
SampleBenchmark.date         thrpt    5  19643682.901 ± 1612197.581  ops/s
SampleBenchmark.instant      thrpt    5   9212400.316 ± 9126592.808  ops/s
SampleBenchmark.miliseconds  thrpt    5  22064363.376 ± 5447924.068  ops/s
```

## Modifying The Run

if you want to change the iterations, or warmups, you can do so in `build.gradle`

```groovy
jmh {
    warmupIterations = 2
    iterations = 5
    fork = 1
}
```

## Accuracy

I don't know how accurate the results are, and this is not a fully worked benchmark.

I welcome changes that make the tests more accurate.  I don't welcome criticisms without code to improve the issues.  This is just play code.

## Background.

I wanted to see the computational difference between two bits of java code.

```java
// Date based time taken
return (new Date().getTime() - Start_Date.getTime());
```

vs

```java
// .currentTimeMillis version
return (System.currentTimeMillis() - startTime);

```
