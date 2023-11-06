### Build
```bash
./mvnw clean install
```

### About it

Stock exchange application written in Kotlin with Java 20.
Imagine you want to be notified when something happens, some GOOGLE(GOOG) stock went up or down.
There are some simple rules(Equal, GreaterThan,LessThan) when the stock price change. Fake Data generation techniques are used to generate a lot of data for benchmarks.
Such solution would be used for Day Trading applications.

### Benchmark
```bash

```

### CAP 100 rules

Now we can do:
 * 100k in 155 ms
 * 1M in 1 second
 * 10M in 10 seconds

```bash
>> Benchmarks: CAP 100 rules
```


### Moving Forward

1. Implements queue system.
2. Implements redis to test performance.
3. Implement Kineis to validate performance. 
4. Implement a thread pool to process events.
5. Implement database connection to check performance with load user preferences.